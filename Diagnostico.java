/******************************************************************
Main.java
Autores: Stefano Aragoni, Rebecca Smith, Roberto Vallecillos
Última modificación: 2020-08-30

******************************************************************/

import java.util.Random;

class Diagnostico{
  Random rand = new Random();
  int correctas, preguntas, num3;

  public Diagnostico(){
    preguntas = 10; 
    correctas = 0; 
  }

  public void examenInicialLectura(int i){
    System.out.println("--Seccion de Lectura--"); 
    System.out.println("\nLeer los siguientes incisos y responder las preguntas correspondientes. \n\n"); 
    if (i==0){
      System.out.println("Leer este parrafo y responder las preguntas\nMi gallina es muy bonita.\nYo le hecho siempre de comer.\nUn día se perdió y mi padre fue a buscarla.\nEstaba poniendo un huevo\n");
      System.out.println("¿Quién le hecha de comer a la gallina?\n1.El narrador.\n2.El padre\n3.La madre\n4.La misma gallina.");
      
    }
    else if (i==1){
      
    }
    else if (i==2){
    }
    else if (i==3){
    }
    else if (i==4){
    }

  }
  
  public void examenInicialMate(int i){
    System.out.println("--Sección de Matemática--"); 
    System.out.println("\nLeer los siguientes incisos y responder las preguntas correspondientes. \n\n");
    if (i==0){
      int num1 = rand.nextInt(25) +1;
      int num2 = rand.nextInt(25) +1;
      System.out.println("¿Cuánto es "+num1+" + "+num2+"?");
      num3 = num1 + num2;
    }
    else if (i==1){
    }
    else if (i==2){
    }
    else if (i==3){
    }
    else if (i==4){
    }
  }

   public void RespuestasMate(int i,int b){
    System.out.println("--𝕊𝕖𝕔𝕔𝕚ó𝕟 𝕕𝕖 𝕄𝕒𝕥𝕖𝕞á𝕥𝕚𝕔𝕒--"); 
    System.out.println("\nLeer los siguientes incisos y responder las preguntas correspondientes. \n\n");
    if (i==0){
      int num1 = rand.nextInt(25) +1;
      int num2 = rand.nextInt(25) +1;
      System.out.println("¿Cuánto es "+num1+" + "+num2+"?");
      num3 = num1 + num2;
    }
    else if (i==1){
    }
    else if (i==2){
    }
    else if (i==3){
    }
    else if (i==4){
    }
  }


}