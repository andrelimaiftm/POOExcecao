package br.edu.iftm.excecao.erros.testes;

import br.edu.iftm.excecao.erros.classes.ControleRemoto;
import br.edu.iftm.excecao.erros.classes.ControleRemotoException;
import br.edu.iftm.excecao.erros.classes.TvDesligadaException;
import br.edu.iftm.excecao.erros.classes.TvLigadaException;

public class ControleRemotoErroTeste {

    public static void main(String[] args) {

        ControleRemoto controleRemoto = new ControleRemoto();

        try {
            controleRemoto.ligar();
            //controleRemoto.ligar();
            controleRemoto.aumentarVolume();
            //controleRemoto.aumentarVolume();
            //controleRemoto.aumentarVolume();
            //controleRemoto.diminuirVolume();
            controleRemoto.diminuirVolume();
            controleRemoto.ativarMudo();
            controleRemoto.desligarMudar();
            controleRemoto.desligar();
            controleRemoto.desligar();
        }catch (TvDesligadaException e) {
            System.out.println("Erro 1");
            System.out.println(e.getMessage());
        }catch (TvLigadaException e){
            System.out.println("Erro 2");
            System.out.println(e.getMessage());
        }catch (ControleRemotoException e) {
            System.out.println("Erro 3");
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println("Erro 4");
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }


    }
}
