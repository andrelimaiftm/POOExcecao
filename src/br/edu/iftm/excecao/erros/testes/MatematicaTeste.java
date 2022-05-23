package br.edu.iftm.excecao.erros.testes;

import br.edu.iftm.excecao.erros.classes.Matematica;

public class MatematicaTeste {

    public static void main(String[] args){
        Matematica m = new Matematica();
        try {
            m.divisao(5, 0);
        }catch (Exception e){
            System.out.println("Houve um erro: ");
            System.out.println("Divisão por zero");
            //e.printStackTrace();
        }

    }
}
