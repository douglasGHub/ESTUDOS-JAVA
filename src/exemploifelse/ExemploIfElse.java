
package exemploifelse;

import java.util.Scanner;

public class ExemploIfElse {

    
    public static void main(String[] args) {
        String nome;
        int idade;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("DIGITE SEU NOME");
        nome = entrada.nextLine();
        System.out.println("DIGITE SUA IDADE");
        idade = entrada.nextInt();
        
        if(idade>=18){
            System.out.println("Olá "+nome+ " você é maior de idade!");
        
        }else{
            System.out.println("Olá "+nome+ " você é menor de idade!");

        entrada.close();

        
    }
    
    }
}

