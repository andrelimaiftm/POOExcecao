package br.edu.iftm.excecao.erros.classes;

public class ControleRemotoException extends Exception{
    public ControleRemotoException(String mensagem) {
        super("Controle Remoto: " + mensagem);
    }
}
