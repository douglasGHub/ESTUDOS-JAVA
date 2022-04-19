/*
de 0 a 2000,00 =  isento
de 2000.01 até 3.000,00  = 8%
de 3.000.01 até 4.5000,00 = 18%
acima de 4500,00 = 28%
*/

import java.util.Scanner;

public class calculoImposto
{
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        
        
        String nome;
        double salario = 0;
        double imposto = 0;
       
      
        
        System.out.println("Digite seu nome:");
        nome = entrada.nextLine();
        
        System.out.println("Digite seu salário:");
        salario = entrada.nextDouble();
        
        if(salario>=0 && salario<=2000){
            System.out.println("");
            System.out.println("Olá "+nome);
            System.out.printf("Seu salário é de R$%.2f",salario);
            System.out.println("");
            System.out.println("Você está ISENTO de impostos");
        }else if(salario>=2000.01 && salario<=3000){
            imposto = salario *0.08;
            double novosalario = salario - imposto;
            double desconto = salario - novosalario;
            System.out.println("");
            System.out.println("Olá "+nome);
            System.out.printf("Seu salário é de: R$%.2f",salario);
            System.out.println("");
            System.out.println("Seu imposto é de: 8%");
            System.out.printf("O desconto é de: R$%.2f %n",desconto);
            System.out.printf("Seu novo salário é de: R$%.2f",novosalario);
        }else if(salario>=3000.01 && salario<=4500){
            imposto = salario *0.18;
            double novosalario = salario - imposto;
            double desconto = salario - novosalario;
            System.out.println("");
            System.out.println("Olá "+nome);
            System.out.printf("Seu salário é de R$%.2f",salario);
            System.out.println("");
            System.out.println("Seu imposto é de 18%");
            System.out.printf("O desconto é de: R$%.2f %n",desconto);
            System.out.println("Seu novo salário é de:"+novosalario);
        }else if(salario>4500){
            imposto = salario *0.28;
            double novosalario = salario - imposto;
            double desconto = salario - novosalario;
            System.out.println("");
            System.out.println("Olá "+nome);
            System.out.printf("Seu salário é de R$%.2f",salario);
            System.out.println("");
            System.out.println("Seu imposto é de 28%");
            System.out.printf("O desconto é de: R$%.2f %n",desconto);
            System.out.printf("Seu novo salário é de R$%.2f",novosalario);
        }
        
    }
}
    
    
   
