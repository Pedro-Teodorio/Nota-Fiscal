package com.senai.sp.nota_fiscal.controller;

import com.senai.sp.nota_fiscal.DAO.ItensDao;
import com.senai.sp.nota_fiscal.DAO.NotaDAO;
import com.senai.sp.nota_fiscal.Model.Nota;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/NF")
public class NotaController {

    final
    NotaDAO notaDAO;

    final
    ItensDao itensDao;

    public NotaController(NotaDAO notaDAO, ItensDao itensDao) {
        this.notaDAO = notaDAO;
        this.itensDao = itensDao;
    }

    @GetMapping
    public List<Nota> buscarNotas() {
        return notaDAO.buscarTodos();
    }

    @GetMapping("/{id}")
    public Nota buscarNotas(@PathVariable int id) {
        return notaDAO.buscarNfPorId(id);
    }
    @PostMapping
    public Nota inserirNota(@RequestBody Nota nota){
       return notaDAO.novaNf(nota);
    }

    @PutMapping("/{id}")
    public Nota alterar(@RequestBody Nota nota, @PathVariable int id){
        return notaDAO.alterarNf(nota,id);
    }

    @DeleteMapping("/{id}")
    public int deletarNota(@PathVariable int id){
       return notaDAO.excluirNota(id);
    }
}
