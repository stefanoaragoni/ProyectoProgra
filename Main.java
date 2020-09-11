/******************************************************************
Main.java
Autores: Stefano Aragoni, Rebecca Smith, Roberto Vallecillos, Cayetano molina, Daniel Cabrera, Diego Ruiz
Última modificación: 2020-08-30

******************************************************************/

import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.util.Random;
import java.io.*; 

public class Main {


  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    Diagnostico DTest = new Diagnostico();
    ActLectura ALec = new ActLectura();
    ActMate AMate = new ActMate();
    brain Brain = new brain();

    usuario UsuarioActual = null;

    int opcion = 0;
    String nombre = "";
    String apellido = "";
    String correo = "";
    int age = 0;
    String usuario = "";
    String pass = "";
    String user = "";
    String contra = "";
    int opcion2 = 0;


    while(opcion != 3 ){
      System.out.println("\n¡Bienvenid@ a TutoGuate! Elige una opcion");
      System.out.println("1. Nuevo usuario");
      System.out.println("2. Iniciar sesion");
      System.out.println("3. Salir");
      opcion = scan.nextInt();

      int seguro5 = 1;

      if (opcion == 1){
        UsuarioActual = Brain.newUsu();
        seguro5 = 0;
        
      }
      else if(opcion == 2){
        UsuarioActual = Brain.logIn();
        if(UsuarioActual != null){
          boolean prueba = Brain.logIn2(UsuarioActual);
          if(prueba){
            seguro5 = 0;
            System.out.println("\nCargando...\n\n");
          }
          
        } 
      }else if(opcion == 3){

          System.out.println("Gracias por usar TutoGuate, ¡vuelve pronto!");
      }
      else{
        System.out.println("Ingresa una opcion valida");
      }
      while(seguro5==0){
        try {
          TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
           System.out.println("");
         }

        System.out.println("--PREGUNTAS DE MATEMATICA--");

        try {
          TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
           System.out.println("");
         }

        int levelMate = UsuarioActual.getNivelMat();
        AMate.MenuNivel(levelMate);

        try {
          TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
           System.out.println("");
        }

         System.out.println("--PREGUNTAS DE LECTURA--");
        int levelLec = UsuarioActual.getNivelLec();
        ALec.MenuNivel(levelLec);

        seguro5 = 1;



      }
    }

  }
}