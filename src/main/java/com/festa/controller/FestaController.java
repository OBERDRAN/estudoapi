package com.festa.controller;

import com.festa.model.FestaModel;
import com.festa.service.FestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/festa")
public class FestaController {

    @Autowired
    private FestaService service;

    @GetMapping("/listarfestas")
    //listar todos
    public List<FestaModel> listarFestaTodos(){
        return service.listarTodos();
    }

    @GetMapping("/id")
    public Optional<FestaModel> listarFestaId(long id){
        return service.listarid(id);
    }

    @PostMapping("/salvar")
    public void salvarFesta(FestaModel festaModel){
        service.festasalvar(festaModel);
    }

    @PostMapping("/alterar")
    public void alterarFesta(FestaModel festamodel){
        service.festaalterar(festamodel);
    }

    @GetMapping("/hello")
    public String Hello(){
        return service.Hello();
    }
}
