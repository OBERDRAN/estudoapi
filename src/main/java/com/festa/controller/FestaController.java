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

    @GetMapping("/festa/listarfestas")
    //listar todos
    public List<FestaModel> listartodos(){
        return service.listarTodos();
    }

    @GetMapping("/festa/id")
    //listar por id
    public Optional<FestaModel> festaid(long id){
        return service.listarid(id);
    }

    @PostMapping("/festa/salvar")
    //salvar
    public void salvarfesta(FestaModel festaModel){
        service.festasalvar(festaModel);
    }

    @PostMapping("/festa/alterar")
    public void alterarfesta(FestaModel festamodel){
        service.festaalterar(festamodel);
    }

}
