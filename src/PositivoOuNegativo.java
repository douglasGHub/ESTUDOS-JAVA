
package positivoounegativo;

import java.util.Scanner;


public class PositivoOuNegativo {

    
    public static void main(String[] args) {
        int num = 0;
    
     
      System.out.println("DIGITE O NÚMERO");
      Scanner entrada = new Scanner(System.in);
      num = entrada.nextInt();
     
      if(num >= 0){
          System.out.println("-------------------");
          System.out.println("O NÚMERO É POSITIVO");
          System.out.println("-------------------");
      }else{
          System.out.println("-------------------");
          System.out.println("O NÚMERO É NEGATIVO");
          System.out.println("-------------------");
          
    }
    
}
}
