/******************************************************************
Diagnostico.java
Autores: Stefano Aragoni, Rebecca Smith, Roberto Vallecillos, Cayetano molina, Daniel Cabrera, Diego Ruiz
Última modificación: 2020-09-11

******************************************************************/

//se importan utilidades de java
import java.util.Random;
import java.util.Scanner;

//se crea la clase Diagnostico
class Diagnostico{
  //se instancian clases de utilidades de java
  Random rand = new Random();


  //se crean los atributos de la clase
  private int preguntas, num3, lec3, nivelM, nivelL;

  //constructor de la clase
  public Diagnostico(){
    nivelL = 0;
    nivelM = 0;
    preguntas = 10; 
    lec3 = 0;
    num3 = 0;
  }

  //metodo que diagnostica el nivel de lectura del usuario.
  public int examenInicialLectura(int  i){
    //pregunta 1
    if (i==0){
      System.out.println("Pregunta 1:");
      System.out.println("Mi gallina es muy bonita.\nYo le hecho siempre de comer.\nUn día se perdió y mi padre fue a buscarla.\nEstaba poniendo un huevo\n");
      System.out.println("¿Quién le echa de comer a la gallina?\n1.El narrador.\n2.El padre\n3.La madre\n4.La misma gallina.");
      lec3 = 1;
    }
    //pregunta 2
    else if (i==1){
      System.out.println("Pregunta 2:");
      System.out.println("María está feliz.\nElla esta esperando a Santa.\nMaría le dejará galletas y leches.\n");
      System.out.println("¿A quién está esperando María. \n1.A su papá.\n2.A su mamá\n3.A su perrita\n4.A Santa Claus.");
      lec3 = 4;
    }
    //pregunta 3
    else if (i==2){
      System.out.println("Pregunta 3:"); 
      System.out.println("Éste es mi ratón.\nMi ratón se llama Jacinto.\nJacinto es muy tragón.\nÉl es de color gris.\n A Jacinto le gusta comer queso\n");
      System.out.println("¿Cual es de lo siguiente es falso? \n1. El ratón se llama Jacinto.\n2.El ratón es blanco\n3.El ratón le gusta comer queso\n4.El ratón es muy tragón.");
      lec3 = 2;
    }
    //pregunta 4
    else if (i==3){
      System.out.println("Pregunta 4:");
      System.out.println("Martín es un pez.\nÉl es rojo y amarillo.\nLe gusta nadar.\nMartín puede nadar muy rápido\n");
      System.out.println("¿Cual es de lo siguiente es verdadero \n1. El pez se llama Marlín y es de color rojo.\n2.El pez le gusta nadar y nada lento.\n3.El pez se llama Martín y le gusta nadar.\n4.El pez es de color azul y amarillo y nada muy rápido.");
      lec3 = 3;
    }
    //pregunta 5
    else if (i==4){
      System.out.println("Pregunta 5:");
      System.out.println("La gata Quilla vive en un tejado muy soleado.\nTiene el pelo de color naranja y unos grandes ojos verdes que por la noche se vuelven amarillos.\nSus dientes son muy pequeños y tiene sus uñas siempre afiladas.\n");
      System.out.println("¿Cual es de lo siguiente es verdadero \n1. La gata Quilla tiene pelo naranja y vive en un tejado.\n2.La gata Quilla tiene dientes muy grandes y sus uñas siempre afiladas.\n3.La gata CosQuilla tiene ojos verdes y uñas afiladas.\n4.La gata Cosquilla tiene el pelo color negro y viven en un tejado soleado.");
      lec3 = 1;
    }
    return lec3;
  }

  //diagnostica el nivel de matematica del usuario.
  public int examenInicialMate(int i){
    //pregunta 1
    if (i==0){
      int num1 = rand.nextInt(25) +1;
      int num2 = rand.nextInt(25) +1;
      System.out.println("Pregunta 1:");
      System.out.println("¿Cuánto es "+num1+"+"+num2+"?");
      num3 = num1 + num2;
    }
    //pregunta 2
    else if (i==1){
      int num1 = rand.nextInt(10) +1;
      int num2 = rand.nextInt(10) +1;
      System.out.println("Pregunta 2:");
      System.out.println("¿Cuánto es "+num1+"*"+num2+"?");
      num3 = num1*num2;
    }
    //pregunta 3
    else if (i==2){
      int num1 = rand.nextInt(10) +1;
      int num2 = rand.nextInt(10) +1;
      int num4 = rand.nextInt(5) +2;
      System.out.println("Pregunta 3:");
      System.out.println("¿Cuánto es ("+num1+"+"+num2+")*"+num4+" ?");
      num3 = ((num1+num2)*num4);
    }
    //pregunta 4
    else if (i==3){
      int num1 = rand.nextInt(5) +1;
      int num2 = rand.nextInt(5) +1;
      int num4 = rand.nextInt(5) +2;
      System.out.println("Pregunta 4:");
      System.out.println("¿Cuánto es ("+num1+"*"+num2+"*"+num4+") ?");
      num3 = (num1*num2*num4);
    }
    //pregunta 5
    else if (i==4){
      int num1 = rand.nextInt(5) +1;
      int num2 = rand.nextInt(5) +1;
      int num4 = rand.nextInt(10) +1;
      System.out.println("Pregunta 5:");
      System.out.println("(Utilizando las reglas de PEMDAS) ¿Cuánto es ("+num1+"+"+num2+"*"+num4+") ?");
      num3 = ((num2*num4)+num1);

    }
    return num3;
  }

  //getter que retorna el nivel de lectura del usuario
  public int getNivel(int correctasL){
    nivelL = 0;
    if(correctasL <3){
      nivelL = 1;
    }
    if(correctasL == 3){
      nivelL = 2;
    }
    if(correctasL > 3){
      nivelL = 3;
    }

    return nivelL;
  }
  
  //getter que retorna el nivel de matematica del usuario
  public int getNivel2(int correctas){
    nivelM = 0;
    if(correctas <3){
      nivelM = 1;
    }
    if(correctas == 3){
      nivelM = 2;
    }
    if(correctas > 3){
      nivelM = 3;
    }

    return nivelM;
  }

}