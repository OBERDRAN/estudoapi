package com.festa.service;

import com.festa.excecao_handler.BusinessException;
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
    //@Autowired
    //private FestaModel fm;
    //listar todos
    //instanciar objeto dentro do método
    public List<FestaModel>listarFesta(){
        return fp.findAll();
    }
    //listar por id
    public Optional<FestaModel>listarFestaId(Long id) throws Exception {
        if(fp.existsById(id)){
            Optional<FestaModel> festamodelid = fp.findById(id);
            return festamodelid;

        }else{
            System.out.println("Nenhuma festa com esse ID");
            throw new Exception("Nullo");
        }
        //tentando entender ainda esse codigo abaixo, mas serve pra caso
        // não encontre nenhum registro
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

        if(fp.existsById(festamodel.getId())){
            System.out.println("Já existe uma festa!");
        }
        return fp.save(festamodel);
    }
     //alterar
    public void festaAlterar(Long id, FestaModel festamodel){
       if(fp.existsById(festamodel.getId())){
            fp.save(festamodel);
        }else{
            System.out.println("nenhuma festa encontrada");
        }
    }
    public FestaModel alterarFesta1(Long id, FestaModel festamodel){

        if(festamodel.getId()==null){
            throw new BusinessException("Campo obrigatorio");
        }
        FestaModel festamodelSalvar = fp.findById(id).orElseThrow(()->new RuntimeException("não Existe"));
        festamodelSalvar.setNome(festamodel.getNome());
        festamodelSalvar.setQtdepessoas(festamodel.getQtdepessoas());
        festamodel = fp.save(festamodelSalvar);
        System.out.println("festa alterada com sucesso");
        return festamodel;

        /*FestaModel festmodelSalvar = fp.getReferenceById(id).orElseThrow(()->new Exception("Não existe"));
        festmodelSalvar.setNome(festamodel.getNome());
        festmodelSalvar.setQtdepessoas(festamodel.getQtdepessoas());
        festamodel = fp.save(festmodelSalvar);
        System.out.println("festa alterada com sucesso");
        return festamodel;*/


        //  FestaModel festamodelSalvar = fp.findById(id).get();
      /*  FestaModel festmodelSalvar = fp.getReferenceById(id);
        if(fp.existsById(id)) {
            festamodelSalvar.setNome(festamodel.getNome());
            festamodelSalvar.setQtdepessoas(festamodel.getQtdepessoas());
            festamodel = fp.save(festmodelSalvar);
            System.out.println("festa alterada com sucesso");
        }else{
            System.out.println("Festa não existe");
        }
        return festamodel;*/
    }
    public String hello(){
        return "hello";
     }
}
