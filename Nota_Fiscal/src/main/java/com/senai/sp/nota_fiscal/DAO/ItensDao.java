package com.senai.sp.nota_fiscal.DAO;

import com.senai.sp.nota_fiscal.Model.Itens;
import com.senai.sp.nota_fiscal.Model.Nota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItensDao {

    private  static final String BUSCAR_NR_NOTA = "SELECT id, nome, preco, qtd, nr_nota FROM nf_cadastro.itens where nr_nota = ?";

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Itens novoItem(Itens itens) {
        String sql = "insert into nf_cadastro.itens (nome, preco, qtd, nr_nota) values (?,?,?,?)";
        jdbcTemplate.update(sql, itens.getNome(), itens.getPreco(), itens.getQtd(), itens.getNr_nota());

        return itens;
    }

    public List<Itens> buscarTodosItens() {
        String sql = "SELECT id, nome, preco, qtd, nr_nota FROM nf_cadastro.itens";
        List<Itens> listagem = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Itens.class));
        return listagem;


    }
    public Itens buscarItemPorId(int id) {
        String sql = "SELECT id, nome, preco, qtd, nr_nota FROM nf_cadastro.itens where id = ?";

        Object[] params = {id};

        Itens itens = jdbcTemplate.queryForObject(sql,
                BeanPropertyRowMapper.newInstance(Itens.class), params);

        return itens;

    }
    public boolean alterarNf(Nota nota) {
        String sql = "UPDATE nf_cadastro.itens SET nome=? , preco=?, qtd= ?, nr_nota=? WHERE id =?";

        Object[] params = {nota.getCliente(), nota.getDt_emissao(), nota.getNr_nota()};
        jdbcTemplate.update(sql, params);

        return true;

    }

    public int excluirItem(int id) {
        String sql = "DELETE FROM nf_cadastro.itens where id = ?";
        Object[] params = {id};

        int result = jdbcTemplate.update(sql, params);

        return result;

    }
    public  List<Itens> buscarPorNrNota(int id) {
        Object[] params = {id};

        List<Itens> listaItemsNrNota = jdbcTemplate.query(BUSCAR_NR_NOTA,
                BeanPropertyRowMapper.newInstance(Itens.class), params);

        return listaItemsNrNota;
    }
}
