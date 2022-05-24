package br.edu.iftm.excecao.erros.classes;

public class TvDesligadaException extends  ControleRemotoException{
    public TvDesligadaException() {
        super("A TV já está desligada!");
    }
}
