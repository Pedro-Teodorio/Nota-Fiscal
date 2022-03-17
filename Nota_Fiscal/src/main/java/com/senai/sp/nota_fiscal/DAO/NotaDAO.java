package com.senai.sp.nota_fiscal.DAO;


import com.senai.sp.nota_fiscal.Model.Itens;
import com.senai.sp.nota_fiscal.Model.Nota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.List;


@Repository
public class NotaDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    ItensDao itensDao;

    private static final String BUSCAR_NOTAS = "SELECT nr_nota, cliente, dt_emissao FROM nf_cadastro.nota ";
    private static final String INSERIR_NOTA ="insert into nf_cadastro.nota (cliente, dt_emissao) values (?,?)";
    private static final String DELETAR_NOTA = "DELETE FROM nf_cadastro.nota where nr_nota = ?";


    public Nota novaNf(Nota nota) {

         KeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(new PreparedStatementCreator() {

            @Override
            public PreparedStatement createPreparedStatement(Connection connection)throws SQLException {

                PreparedStatement ps = connection.prepareStatement(INSERIR_NOTA,
                        Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, nota.getCliente());
                ps.setDate(2, new Date(nota.getDt_emissao().getYear(),
                        nota.getDt_emissao().getMonthValue(), nota.getDt_emissao().getDayOfMonth()));
                return ps;
            }
        }, holder);

        for (Itens itens  : nota.getItens()) {
            itens.setNr_nota(holder.getKey().intValue());
            itensDao.novoItem(itens);
        }
        System.out.println(holder.getKey().intValue());
        return buscarNfPorId(holder.getKey().intValue());
    }



    public List<Nota> buscarTodos() {

        List<Nota> listagem = jdbcTemplate.query(BUSCAR_NOTAS,
                BeanPropertyRowMapper.newInstance(Nota.class));

        for (Nota nota : listagem) {


            nota.setItens(itensDao.buscarPorNrNota(nota.getNr_nota()));


        }

        return listagem;
    }


    public Nota buscarNfPorId(int id) {
        String sql = "SELECT nr_nota,cliente,dt_emissao FROM nf_cadastro.nota where nr_nota= ?";

        Object[] params = {id};

        Nota nota = jdbcTemplate.queryForObject(sql,
                BeanPropertyRowMapper.newInstance(Nota.class), params);


        nota.setItens(itensDao.buscarPorNrNota(nota.getNr_nota()));

        return nota;

         }

        public Nota alterarNf (Nota nota,int id){
            String sql = "UPDATE nf_cadastro.nota SET cliente=? , dt_emissao=? WHERE nr_nota =?";

            Object[] params = {nota.getCliente(), nota.getDt_emissao(), nota.getNr_nota()};
            jdbcTemplate.update(sql, params);

            for (Itens itens  : nota.getItens()) {
                itensDao.excluirItem(itens.getId());
                itensDao.novoItem(itens);
            }

            return nota;

        }

    public int excluirNota(int id) {
        Object[] params = {id};

        int resultado = jdbcTemplate.update(DELETAR_NOTA, params);

        return resultado;
    }


    }

