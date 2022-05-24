package br.edu.iftm.excecao.erros.classes;

public class ControleRemoto {

    private boolean estaLigado;
    private int volumeAtual;
    private boolean estaMundo;

    public ControleRemoto(){
        this.estaLigado = false;
        this.volumeAtual = 0;
        this.estaMundo = false;
    }

    public void ligar() throws Exception {
        if(estaLigado){
            //System.out.println("TV já está ligada!");
            //Exception excecao = new Exception("A TV já está ligada!");
            //throw excecao;
            TvLigadaException excecao = new TvLigadaException();
            throw excecao;
        }else{
            this.estaLigado = true;
            System.out.println("A TV ligou.");
        }
    }

    public void desligar() throws Exception {
         //!estaLigado
        if(estaLigado == false){
            //System.out.println("A TV está desligada!");
            //Exception excecao = new Exception("A TV está desligada!");
            //throw excecao;
            throw new TvDesligadaException();
        }else{
            estaLigado = false;
            System.out.println("A TV desligou.");
        }
    }

    public void aumentarVolume() throws ControleRemotoException{
        if(volumeAtual > 60){
            //System.out.println("O volume está no máximo!");
            throw new ControleRemotoException("O volume está no máximo");
        }else{
            volumeAtual += 40;
            System.out.println("O volume é: " + volumeAtual);
        }
    }

    public void diminuirVolume() throws ControleRemotoException{
        if(volumeAtual < 40){
            //System.out.println("O volume já esta no minimo!");
            throw new ControleRemotoException("O volume já esta no minimo!");
        }else{
            volumeAtual -= 40;
            System.out.println("O volume é: " + volumeAtual);
        }
    }

    public void ativarMudo(){
        this.estaMundo = true;
        System.out.println("A TV está muda");
    }

    public void desligarMudar(){
        this.estaMundo = false;
        System.out.println("A TV não está muda");
    }



    //metodos getter e setter
    public boolean isEstaLigado() {
        return estaLigado;
    }

    public void setEstaLigado(boolean estaLigado) {
        this.estaLigado = estaLigado;
    }

    public int getVolumeAtual() {
        return volumeAtual;
    }

    public void setVolumeAtual(int volumeAtual) {
        this.volumeAtual = volumeAtual;
    }

    public boolean isEstaMundo() {
        return estaMundo;
    }

    public void setEstaMundo(boolean estaMundo) {
        this.estaMundo = estaMundo;
    }
}
