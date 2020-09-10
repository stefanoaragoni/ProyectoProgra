/******************************************************************
Main.java
Autores: Stefano Aragoni, Rebecca Smith, Roberto Vallecillos
Última modificación: 2020-08-30

******************************************************************/

import java.util.Random;
import java.util.Scanner;

class Diagnostico{
  Random rand = new Random();
  Scanner scan = new Scanner(System.in);
  int correctas, preguntas, num3, lec3, correctasL;

  public Diagnostico(){
    preguntas = 10; 
    correctas = 0; 
    correctasL = 0;
    lec3 = 0;
    num3 = 0;
  }

  public void examenInicialLectura(int  i){
    
    if (i==0){
      System.out.println("Pregunta 1:");
      System.out.println("Mi gallina es muy bonita.\nYo le hecho siempre de comer.\nUn día se perdió y mi padre fue a buscarla.\nEstaba poniendo un huevo\n");
      System.out.println("¿Quién le hecha de comer a la gallina?\n1.El narrador.\n2.El padre\n3.La madre\n4.La misma gallina.");
      lec3 = 1;
    }
    else if (i==1){
      System.out.println("Pregunta 2:");
      System.out.println("María está feliz.\nElla esta esperando a Santa.\nMaría le dejará galletas y leches.\n");
      System.out.println("¿A quién está esperando María. \n1.A su papá.\n2.A su mamá\n3.A su perrita\n4.A Santa Claus.");
      lec3 = 4;
    }
    else if (i==2){
      System.out.println("Pregunta 3:"); 
      System.out.println("Éste es mi ratón.\nMi ratón se llama Jacinto.\nJacinto es muy tragón.\nÉl es de color gris.\n A Jacinto le gusta comer queso\n");
      System.out.println("¿Cual es de lo siguiente es falso? \n1. El ratón se llama Jacinto.\n2.El ratón es blanco\n3.El ratón le gusta comer queso\n4.El ratón es muy tragón.");
      lec3 = 2;
    }
    else if (i==3){
      System.out.println("Pregunta 4:");
      System.out.println("Martín es un pez.\nÉl es rojo y amarillo.\nLe gusta nadar.\nMartín puede nadar muy rápido\n");
      System.out.println("¿Cual es de lo siguiente es verdadero \n1. El pez se llama Marlín y es de color rojo.\n2.El pez le gusta nadar y nada lento.\n3.El pez se llama Martín y le gusta nadar.\n4.El pez es de color azul y amarillo y nada muy rápido.");
      lec3 = 3;
    }
    else if (i==4){
      System.out.println("Pregunta 5:");
      System.out.println("La gata Quilla vive en un tejado muy soleado.\nTiene el pelo de color naranja y unos grandes ojos verdes que por la noche se vuelven amarillos.\nSus dientes son muy pequeños y tiene sus uñas siempre afiladas.\n");
      System.out.println("¿Cual es de lo siguiente es verdadero \n1. La gata Quilla tiene pelo naranja y vive en un tejado.\n2.La gata Quilla tiene dientes muy grandes y sus uñas siempre afiladas.\n3.La gata CosQuilla tiene ojos verdes y uñas afiladas.\n4.La gata Cosquilla tiene el pelo color negro y viven en un tejado soleado.");
      lec3 = 1;
    }
  }
  
    public void RespuestasLectura(){
      int b = scan.nextInt();
      if (b == lec3){
        System.out.println("¡Correcto! Muy bien hecho.\n\n");
        correctasL++;
      }
      else {
        System.out.println("Eh. Incorrecto. La respuesta correcta era: "+ lec3+"\n\n");
     }
    }

  public void examenInicialMate(int i){
    
    if (i==0){
      int num1 = rand.nextInt(25) +1;
      int num2 = rand.nextInt(25) +1;
      System.out.println("Pregunta 1:");
      System.out.println("¿Cuánto es "+num1+"+"+num2+"?");
      num3 = num1 + num2;
    }
    else if (i==1){
      int num1 = rand.nextInt(10) +1;
      int num2 = rand.nextInt(10) +1;
      System.out.println("Pregunta 2:");
      System.out.println("¿Cuánto es "+num1+"*"+num2+"?");
      num3 = num1*num2;
    }
    else if (i==2){
      int num1 = rand.nextInt(10) +1;
      int num2 = rand.nextInt(10) +1;
      int num4 = rand.nextInt(5) +2;
      System.out.println("Pregunta 3:");
      System.out.println("¿Cuánto es ("+num1+"+"+num2+")*"+num4+" ?");
      num3 = ((num1+num2)*num4);
    }
    else if (i==3){
      int num1 = rand.nextInt(5) +1;
      int num2 = rand.nextInt(5) +1;
      int num4 = rand.nextInt(5) +2;
      System.out.println("Pregunta 4:");
      System.out.println("¿Cuánto es ("+num1+"*"+num2+"*"+num4+") ?");
      num3 = (num1*num2*num4);
    }
    else if (i==4){
      int num1 = rand.nextInt(5) +1;
      int num2 = rand.nextInt(5) +1;
      int num4 = rand.nextInt(10) +1;
      System.out.println("Pregunta 5:");
      System.out.println("(Utilizando las reglas de PEMDAS) ¿Cuánto es ("+num1+"+"+num2+"*"+num4+") ?");
      num3 = ((num2*num4)+num1);

    }


  }

   public void RespuestasMate(){
    int b = scan.nextInt();
    if (b == num3){
      System.out.println("¡Correcto! Muy bien hecho.\n\n");
      correctas++;
    }
    else {
      System.out.println("Eh. Incorrecto. La respuesta correcta era: "+num3+"\n\n");
    }
  }


}