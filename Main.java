/******************************************************************
Main.java
Autores: Stefano Aragoni, Rebecca Smith, Roberto Vallecillos
Última modificación: 2020-08-30

******************************************************************/

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      int opcion = 0;

      while(opcion != 3 ){
        System.out.println("¡Bienvenid@ a TutoGuate! Elige una opcion");
        System.out.println("1. Nuevo usuario");
        System.out.println("2. Iniciar sesion");
        System.out.println("3. Salir");
        opcion = scan.nextInt();

        if (opcion == 1){
          

        }else if (opcion == 2){

        }else if (opcion == 3){

        }else{
          System.out.println("Gracias por usar TutoGuate, vuelve pronto!");
        }
     }


  }
}
