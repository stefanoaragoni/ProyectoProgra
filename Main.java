/******************************************************************
Main.java
Autores: Stefano Aragoni, Rebecca Smith, Roberto Vallecillos, Cayetano molina, Daniel Cabrera, Diego Ruiz
Última modificación: 2020-09-11

******************************************************************/

import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.util.Random;
import java.io.*; 

public class Main {


  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    //llaman a las clases
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

      // el usuario ingresa su opcion
      int seguro5 = 1;

      if (opcion == 1){

        //Esta opcion llama al metodo new usuario para hacer un usuario nuevo
        UsuarioActual = Brain.newUsu();
        seguro5 = 0;
        
      }
      else if(opcion == 2){
        //Aqui se llama al metodo login para que el usuario inicie sesion
        UsuarioActual = Brain.logIn();
        if(UsuarioActual != null){
          boolean prueba = Brain.logIn2(UsuarioActual);
          if(prueba){
            seguro5 = 0;
          }
          
        } 
      }else if(opcion == 3){

          System.out.println("Gracias por usar TutoGuate, ¡vuelve pronto!");
      }
      else{
        System.out.println("Ingresa una opcion valida");
      }
      //ESTE ES CERRAR SESI'ON
      while(seguro5==0){
        try {
          TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
           System.out.println("");
        }

        int decision = 0;
        System.out.println("Ingrese la opcion que desea hacer ahora:");
        System.out.println("1. Hacer actividades de matematica");
        System.out.println("2. Hacer actividades de lectura");
        System.out.println("3. Salir");

        decision = scan.nextInt();

        if(decision ==1){
          try {
            TimeUnit.SECONDS.sleep(1);
          }catch (InterruptedException e) {
            System.out.println("");
          }
          System.out.println("\n\n--PREGUNTAS DE MATEMATICA--");
          //llama a las preguntas de matematica
          int levelMate = UsuarioActual.getNivelMat();
          AMate.MenuNivel(levelMate);
          
        }else if (decision == 2){
          try {
            TimeUnit.SECONDS.sleep(2);
          } catch (InterruptedException e) {
            System.out.println("");
          }
          
          System.out.println("\n\n--PREGUNTAS DE LECTURA--");

          //llama a las preguntas de lectura
          int levelLec = UsuarioActual.getNivelLec();
          ALec.MenuNivel(levelLec);

        }else if (decision ==3){
          seguro5 = 1;

        }else{
          System.out.println("Ingrese una opcion valida");
        }

        

      }
    }

  }
}