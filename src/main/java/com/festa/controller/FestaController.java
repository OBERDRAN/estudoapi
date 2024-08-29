package com.festa.controller;

import com.festa.model.FestaModel;
import com.festa.service.FestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return service.listarFesta();
    }
    @GetMapping("/id")
    public Optional<FestaModel> listarFestaId(long id){
        return service.listarFestaId(id);
    }
//    public void salvarFesta(FestaModel festaModel){
//        service.festasalvar(festaModel);
//    }
//    @PostMapping("/salvar")
//    public ResponseEntity<FestaModel>salvarFesta(@RequestBody FestaModel festamodel){
//        service.salvarFesta(festamodel);
//        return ResponseEntity.ok().build();
//    }
    @PostMapping("/salvar")
    public FestaModel salvarFesta1(FestaModel festamodel){
        return service.salvarFesta1(festamodel);
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
