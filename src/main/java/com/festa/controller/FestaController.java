package com.festa.controller;

import com.festa.model.FestaModel;
import com.festa.service.FestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Optional<FestaModel> listarFestaId(@PathVariable("id") long id) throws Exception {
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
    public FestaModel salvarFesta(@RequestBody FestaModel festamodel){
        return service.salvarFesta(festamodel);
    }

    //@PostMapping("/alterar")
    /*public void alterarFesta(FestaModel festamodel){
        service.festaalterar(festamodel);
    }*/
    @ResponseStatus(code = HttpStatus.CREATED)
    @PutMapping("/alterar/{id}")
    //passando o id e o objeto no corpo do metodo, id para identificar qual o objeto a ser editado
   /* public void alterarFesta(@PathVariable("id") Long id, @RequestBody FestaModel festamodel){
        service.festaalterar(festamodel);
    }*/

    //mesma função alterar, mas tras o objeto editado
    public FestaModel alterarFesta(@PathVariable("id") Long id, @RequestBody FestaModel festamodel){
        return service.alterarFesta1(festamodel);
    }
    @GetMapping("/hello")
    @ResponseStatus(code=HttpStatus.OK)
    public String hello(){
        return service.Hello();
    }
}
