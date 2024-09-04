package com.festa.service;

import com.festa.model.FestaModel;
import com.festa.repository.FestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class FestaService {
    @Autowired
    private FestaRepository fp;
    //@Autowired
    private FestaModel fm;
    //listar todos
    public List<FestaModel>listarFesta(){
        return fp.findAll();
    }
    //listar por id
    public Optional<FestaModel>listarFestaId(Long id){
        if(fp.existsById(fm.getId())){
            fp.findById(id);
        }else{
            System.out.println("Nenhuma festa com esse ID");
        }
        //tentando entender ainda esse codigo abaixo, mas serve pra caso
        // não encontre nenhum registro
        return Optional.empty();
    }
    //salvar festa
//     public void festasalvar(FestaModel festamodel){
//            fp.save(festamodel);
//     }
    //classe service não usa responseentity
//    public ResponseEntity<FestaModel>salvarFesta(FestaModel festamodel){
//        fp.save(festamodel);
//        return ResponseEntity.ok().build();
//    }

    public FestaModel salvarFesta(FestaModel festamodel){
        return fp.save(festamodel);
    }
     //alterar
    public void festaalterar(FestaModel festaModel){
        if(fp.existsById(festaModel.getId())){
            fp.save(festaModel);
        }else{
            System.out.println("nenhuma festa encontrada");
        }
    }
    public String Hello(){
        return "hello";
     }

}
