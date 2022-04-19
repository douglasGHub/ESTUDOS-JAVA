
package imparoupar;

import java.util.Scanner;


public class ImparOuPar {

   
    public static void main(String[] args) {
        
        
        int num = 0;
     
      
      System.out.println("DIGITE O NÚMERO");
      Scanner entrada = new Scanner(System.in);
      num = entrada.nextInt();
      
      if(num %2 ==0 ){
          System.out.println("----------------");
          System.out.println("O NÚMERO DIGITADO FOI: "+num);
          System.out.println("O NÚMERO É PAR");
          System.out.println("--------------");
      }else{
          System.out.println("----------------");
          System.out.println("O NÚMERO DIGITADO FOI: "+num);
          System.out.println("O NÚMERO É IMPAR");
          System.out.println("----------------");
    }
    
        }
}

