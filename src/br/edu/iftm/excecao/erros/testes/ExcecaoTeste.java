package br.edu.iftm.excecao.erros.testes;

public class ExcecaoTeste {

    public static void main(String[] args) {
        System.out.println("Mensagem antes do erro");
        int[] numeros = new int[4];
        try {
            //fica aqui o codigo que poderá conter possiveis erros
            //ou seja o que pode gerar exceção
            numeros[3] = 10;
        }catch (Exception e){
        //}catch (ArrayIndexOutOfBoundsException e){
            //Manipula as excecoes, trata os erros
            System.out.println("Gerou uma exceção");
            System.out.println("Houve um problema ao preencher o vetor");
            //System.out.println("indice invalido");
            //System.out.println(e.getMessage());
        }

//        for (int i = 0; i < 5; i++) {
//            System.out.println(numeros[i]);
//        }

        System.out.println("Mensagem após o erro");
    }
}
