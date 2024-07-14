import java.util.Scanner;

public class Contador {
    public static void main(String[] args){

        Scanner parametros = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro.");
        int numeroUm = parametros.nextInt();
        System.out.println("Digite o segundo parametro.");
        int numeroDois = parametros.nextInt();
        try{
            contar(numeroUm, numeroDois);
        }
        catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");

        }
    }

    static void contar (int numeroUm, int numeroDois) throws ParametrosInvalidosException{
        if(numeroUm > numeroDois){
            throw new ParametrosInvalidosException("");
        }
        int contagem = 1;
        for(int m=numeroUm;m<numeroDois;m++){
            System.out.println("imprimindo o número "+contagem+": "+m);
            contagem++;

        }
    }
}
