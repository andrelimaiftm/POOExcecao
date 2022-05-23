package br.edu.iftm.excecao.erros.testes;

public class ExcecaoTeste2 {

    public static void dividir(int numero, int peso) throws ArithmeticException{
        System.out.println(numero / peso);
    }

    public static void main(String[] args) {
        int[] numeros = new int[] {1, 3, 5, 9};
        int[] pesos = new int[] {5, 0, 4};

        for (int i = 0; i < numeros.length; i++) {
            try {
                //ExcecaoTeste2.dividir(numeros[i], pesos[i]);
                int resultado = numeros[i]*pesos[i];
                System.out.printf(" %d * %d = %d\n",numeros[i], pesos[i], resultado);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Houve um problema ao acesso o indice do array");
            }catch (ArithmeticException e){
                e.printStackTrace();
            }catch (Exception e){

            }finally {
                //fecha um arquivo quando que a vc tenha aberto
                //codigo que vai ser executado
                System.out.println("Código dentro do finally");
            }
        }
        System.out.println("Mensagem após o erro.");
    }
}
