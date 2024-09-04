package com.festa.controller;

import com.festa.model.FestaModel;
import com.festa.service.FestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/festa")
public class FestaController {
    @Autowired
    private FestaService service;
    //listar todos
    @GetMapping("/listarfestas")
    @ResponseStatus(code = HttpStatus.OK)
    public List<FestaModel> listarFestaTodos(){
        return service.listarFesta();
    }
    @GetMapping("/id")
    @ResponseStatus(code = HttpStatus.OK)
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
    @ResponseStatus(code = HttpStatus.CREATED)
    public FestaModel salvarFesta1(FestaModel festamodel){
        return service.salvarFesta1(festamodel);
    }
    @PostMapping("/alterar")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void alterarFesta(FestaModel festamodel){
        service.festaalterar(festamodel);
    }
    @GetMapping("/hello")
    @ResponseStatus(code=HttpStatus.OK)
    public String Hello(){
        return service.Hello();
    }
}
