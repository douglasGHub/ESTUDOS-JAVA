
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner entrada = new Scanner (System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int resp = 999;
        int total =0;
       
       
        while(true){
           System.out.println("----------------------");
      System.out.println("COMO DESEJA ABASTECER?");
      System.out.println("1 - álcool");
      System.out.println("2 - gasolina");
      System.out.println("3 - diesel");
      System.out.println("0 - encerrar");
      System.out.println("----------------------");
     
      resp = entrada.nextInt();
     
     
     
     
      if(resp==1){
          alcool++;
          System.out.println("Você selecionou álcool");
      }else if(resp==2){
          System.out.println("Você selecionou gasolina");
          gasolina++;
      }else if(resp==3){
          System.out.println("Você selecionou diesel");
          diesel++;
      }else if(resp>=0 || resp>3){
          System.out.println("");
          System.out.println("total álcool: "+alcool);
          System.out.println("total gasolina: "+gasolina);
          System.out.println("total diesel: "+diesel);
          System.out.println("");
          System.out.println("============================");
          System.out.println("TOTAL DE CLIENTES ATENDIDOS:"+total);
          System.out.println("============================");
          System.out.println("");
          break;
         
      }
     
      total = alcool + gasolina + diesel;
     
     
      System.out.println("");
      System.out.println("total álcool: "+alcool);
      System.out.println("total gasolina: "+gasolina);
      System.out.println("total diesel: "+diesel);
      System.out.println("");
      System.out.println("============================");
      System.out.println("TOTAL DE CLIENTES ATENDIDOS:"+total);
      System.out.println("============================");
      System.out.println("");
     
         
       
       

}


  }
}
