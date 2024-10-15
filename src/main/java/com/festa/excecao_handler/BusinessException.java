package com.festa.excecao_handler;

public class BusinessException extends RuntimeException{

    public BusinessException(String mensagem){
        super(mensagem);
    }
                            //cria conteudo dinamico
    public BusinessException(String mensagem, Object ... params){
        super(String.format(mensagem,params));
    }
}
