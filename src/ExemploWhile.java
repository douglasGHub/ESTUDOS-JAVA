
package exemploifelse;

import java.util.Scanner;

public class ExemploWhile {

    
    public static void main(String[] args) {
      //Estrutura While

//        enquanto(<=9){
//            //incremento da variável que está servindo a nossa condição
//            inteira = inteira + 1;
//            imprima("essa msg");
//        }

        //INCREMENTADO - de 0 à 9
        int i = 0;
        while(i<=9){
            i = i + 1;
            System.out.println( i );
        }
        /*
         * 1
         * 2
         * 3
         * 4
         * 5
         * 6
         * 7
         * 8
         * 9
         * 10
         */

        //DE-CREMENTADO - de 9 à 0
        int x = 0;
        while(x>=0){
            x = x - 1;
            System.out.println( x );
        }
        /*
        * 10
        * 9
        * 8
        * 7
        * 6
        * 5
        * 4
        * 3
        * 2
        * 1
        * 0
        * */

    }

}