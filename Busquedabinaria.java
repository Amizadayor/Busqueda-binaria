import java.util.Scanner; // Importamos la libreria para la entrada de datos

public class Busquedabinaria { // creamos la clase de Busquedabinaria
   static Scanner entrada = new Scanner(System.in);

   public static void main(String[] args){
      int numero, puntero=0, finall=9, mitad=-999;
      int [] vec = {3,8,11,22,38,49,50,56,62,70}; // declaramos la lista con los Datos
      boolean encontrar = false;
      System.out.print(" INGRESE EL DATO A BUSCAR :");
      numero = entrada.nextInt();
      while ( !encontrar && puntero <= finall ){
         mitad = (int) ((puntero+finall) / 2);
      if(numero == vec[mitad])
         encontrar = true;
      else if(numero < vec[mitad])
         finall = mitad -1;
      else
         puntero = mitad + 1;
      }
      if (encontrar)
         System.out.print("EL DATO SE ENCUENTRA EN LA POSICION NUMERO : " + (mitad + 1));
      else
         System.out.print("EL DATO NO SE ENCONTRO, INTENTE OTRA VEZ");
   }
}