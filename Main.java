/******************************************************************
Main.java
Autores: Stefano Aragoni, Rebecca Smith, Roberto Vallecillos
Última modificación: 2020-08-30

******************************************************************/

import java.util.Scanner;
import java.util.Random;
import java.io.*; 

public class Main {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      int opcion = 0;
      Diagnostico DTest = new Diagnostico();
      String nombre;
      String apellido;
      String correo;
      int age = 0;
      String usuario;
      String pass;
      String user;
      String contra;

      DTest.examenInicialLectura(0);
      int opcion1 = scan.nextInt();
      DTest.RespuestasLectura(opcion1);

      while(opcion != 3 ){
        System.out.println("¡Bienvenid@ a TutoGuate! Elige una opcion");
        System.out.println("1. Nuevo usuario");
        System.out.println("2. Iniciar sesion");
        System.out.println("3. Salir");
        opcion = scan.nextInt();

        if (opcion == 1){
          System.out.println("Hola bienvenid@, necesitamos algunos datos para comenzar");
          try{
          System.out.println("\nIngresa tu nombre");
          nombre = scan.next();
          System.out.println("\nIngresa tu apellido");
          apellido= scan.next();
      
          
          int contador1 = 0;
          while (contador1 < 1){
            System.out.println("\nIngresa tu correo");
            correo= scan.next();
            int firstIndex = correo.indexOf("@");

            if(((correo.length()) < 7) || (firstIndex == -1)){
              System.out.println("Por favor ingrese un correo valido."); 
            }
            else{
              contador1 = 1;
            }
          }

          System.out.println("\nIngresa tu edad en numeros");
          int bean = 0;
          while(bean != 7){
            try{
            age = scan.nextInt();
            bean = 7;
            }catch(Exception e){
              System.out.println("Por favor ingresa un numero correcto."); 
              scan.next();
              continue;
            }
          }
          
          System.out.println("\nCrea un nombre de usuario");
          usuario = scan.next();

          int jelly = 0;
          while(jelly != 1){
            System.out.println("\nCrea una contrasena con un minimo de 5 caracteres para ingresar");
            pass = scan.next();
            if(pass.length() > 5){
              System.out.println("Contrasena valida");
              jelly +=1;
            }else{
              System.out.println("Ingrese una contrasena valida");
              
            }
          }
          }catch(Exception e){
            System.out.println("\nHubo un error. Ingrese sus datos de nuevo");
            
          }
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
