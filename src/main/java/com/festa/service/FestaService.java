package com.festa.service;

import ch.qos.logback.classic.joran.sanity.IfNestedWithinSecondPhaseElementSC;
import com.festa.model.FestaModel;
import com.festa.repository.FestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FestaService {

    @Autowired
    private FestaRepository fp;

    @Autowired
    private FestaModel fm;

    //listar todos
    public List<FestaModel>listarTodos(){
        return fp.findAll();
    }

    //listar por id
    public Optional<FestaModel>listarid(Long id){
        return fp.findById(id);
    }

    //salvar festa
    public void festasalvar(FestaModel festamodel){
        fp.save(festamodel);
    }

    //alterar
    public void festaalterar(FestaModel festaModel){
        if (fp.existsById(festaModel.getId())){
            fp.save(festaModel);
        }else{
            System.out.println("nenhuma festa encontrada");
        }
    }
    //implementar busca por nome

}
