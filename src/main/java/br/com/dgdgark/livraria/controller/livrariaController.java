package br.com.dgdgark.livraria.controller;

import br.com.dgdgark.livraria.model.livrariaModel;
import br.com.dgdgark.livraria.service.livrariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class livrariaController {

    @Autowired
    private livrariaService service;

    @GetMapping
    public String home(){
        return "index" ;
    }
    @PostMapping("/cadastrar")
    public  String cadastrarLivro(livrariaModel livro){
        service.cadastrarLivro(livro);
        return "index";
    }
}
