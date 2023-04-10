package atividade24;

import java.util.Scanner;

public class atividade24 {
    
     public static void main(String[] args) {
     try{
            Scanner valor = new Scanner(System.in);
            Integer qtd;
            double n;

            System.out.println("Digite a quantidade de números que vai verificar");
            qtd=valor.nextInt();

            for(int i=0;i<qtd;i++){
                System.out.println("Digite o número");
                n=valor.nextInt();
                if(n>0){
                    System.out.println("Número positivo");
                }else if(n==0){
                    System.out.println("Número zero");
                }if(n<0){
                    System.out.println("Número negativo");
                }
            }
     
    }catch(Exception e){
        System.out.println("Exceção"+e);
        System.out.println("Digite apenas números");
    }


}
}
