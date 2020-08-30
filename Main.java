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
      Diagnostico DTest = new Diagnostico();
      String nombre;
      String apellido;
      String correo;
      int age;
      String usuario;
      String pass;
      String user;
      String contra;

      DTest.examenInicialMate(0);
      int opcion1 = scan.nextInt();
      DTest.RespuestasMate(opcion1);

      while(opcion != 3 ){
        System.out.println("¡Bienvenid@ a TutoGuate! Elige una opcion");
        System.out.println("1. Nuevo usuario");
        System.out.println("2. Iniciar sesion");
        System.out.println("3. Salir");
        opcion = scan.nextInt();

        if (opcion == 1){
          System.out.println("Hola bienvenid@, necesitamos algunos datos para comenzar");
          System.out.println("Ingresa tu nombre");
          nombre = scan.next();
          System.out.println("Ingresa tu apellido");
          apellido= scan.next();
          try{
          System.out.println("Ingresa tu correo");
          correo= scan.next();
          }except{
            
          }
          System.out.println("Ingresa tu edad");
          age = scan.nextInt();
          System.out.println("Crea un nombre de usuario");
          usuario = scan.next();
          System.out.println("Crea una contrasena para ingresar");
          pass = scan.next();
          System.out.println("\nYa se creo tu usuario. ¡Bienvenid@!");



        }else if (opcion == 2){
          System.out.println("Ingresa tu usuario");
          user = scan.next();
          System.out.println("Ingresa tu contrasena");
          contra = scan.next();




        }else if (opcion == 3){
           System.out.println("Gracias por usar TutoGuate, vuelve pronto!");

        }else{
         System.out.println("Ingresa una opcion valida");
        }
     }


  }
}
