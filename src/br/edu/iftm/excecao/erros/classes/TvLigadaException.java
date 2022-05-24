package br.edu.iftm.excecao.erros.classes;

public class TvLigadaException  extends ControleRemotoException{
    public TvLigadaException() {
        super("A TV já está ligada!");
    }
}
