
import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
   Scanner entrada = new Scanner(System.in);
   int senha = 2002;
   int resp =0;
   System.out.println("DIGITE A SENHA");
   resp = entrada.nextInt();
   
   while(resp!=senha){
       System.out.println("");
       System.out.println("SENHA INVÁLIDA!");
       System.out.println("DIGITE A SENHA");
       resp = entrada.nextInt();
   }
   System.out.println("ACESSO PERMITIDO!");
}
}
