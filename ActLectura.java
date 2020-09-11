import java.util.concurrent.TimeUnit;
import java.util.Scanner;

class ActLectura{
  int opcion1;
  int l1;
  int correctas;

  Scanner scan = new Scanner(System.in);

  public ActLectura(){

  }
 
 //Pensaba hacer algo parecido a lo que se hizo en el diagnóstico 

  //Menú del nivel 1 de lectura para que se muestre en el driver
  public void MenuNivel(int a){
    if(a == 1){
      System.out.println("Bienvenido a las actividades de lectura del nivel 1.\n");
      System.out.println("Por favor eliga lo que quiere resolver.");
      System.out.println("1. ¿Qué es un sustantivo?");
      System.out.println("2. ¿Qué es un verbo?");
      System.out.println("3. ¿Qué es un adjetivo?");
      System.out.println("4. Salir");
      opcion1 = scan.nextInt();
      Nivel1(opcion1);
    }

    //Menú del nivel 2 de lectura para que se muestre en el driver
    if(a ==2){
      System.out.println("Bienvenido a las actividades de lectura del nivel 2.\n");
      System.out.println("Para empezar se dará la definición de una sílaba tónica.");
      System.out.println("La sílaba tónica, es aquella sílaba que se pronuncia más fuerte o con mayor acentuación en una palabra.");
      System.out.println("Dicho esto, dependiendo en qué sílaba caiga la sílaba tónica, las palabras de dividen es agudas, graves y esdrújulas.\n");
      System.out.println("Por favor eliga lo que quiere resolver");
      System.out.println("1. Palabras Agudas");
      System.out.println("2. Palabras Graves");
      System.out.println("3. Palabras Esdrújulas");
      System.out.println("4. Salir");
      opcion1 = scan.nextInt();
      Nivel2(opcion1);
    }

    //Menú del nivel 3 de lectura para que se muestre en el driver
    if(a == 3){
      System.out.println("Bienvenido a las actividades de lectura del nivel 3.\n");
      System.out.println("Por favor eliga lo que quiere resolver");
      System.out.println("1. El uso de la coma");
      System.out.println("2. El uso del punto");
      System.out.println("3. El uso de los signos de exclamación y admiración");
      System.out.println("4. Salir");
      opcion = scan.nextInt();
      Nivel3(opcion1);
    }
  }

  public void Nivel1(int opcion){
    if (opcion == 1){
      System.out.println("El niño energico fue a jugar futbol.");
      System.out.println("En la anterior oración, niño es el sustantivo de la oración");
      System.out.println("Dicho esto, ¿Qué es un sustantivo? ");
      System.out.println("1. El sustantivo en una oración, es la acción que hace la persona");
      System.out.println("2. El sustantivo describe al personaje del cual se habla en una oración");
      System.out.println("3. El sustantivo es el personaje del cual se habla en una oración");
      System.out.println("4. El sustantivo describe al verbo del cual se habla en la oración");

    //Respuesta 
      l1 = 3;
      Respuestas();
    }
    else if (opcion == 2){
      System.out.println("El niño enérgico fue a jugar futbol");
      System.out.println("En la anterior oración, jugar es el verbo de la oración");
      System.out.println("Dicho esto, ¿Qué es un verbo? ");
      System.out.println("1. El verbo en una oración, es la acción que hace la persona");
      System.out.println("2. El verbo describe al personaje del cual se habla en una oración");
      System.out.println("3. El verbo es el personaje del cual se habla en una oración");
      System.out.println("4. El verbo describe al verbo del cual se habla en la oración");
      l1 = 1;
      Respuestas();
    }
    else if (opcion == 3){
      System.out.println("El niño enérgico fue a jugar futbol");
      System.out.println("En la anterior oración, enérgico es el adjetivo para el sustantivo dado");
      System.out.println("Dicho esto, ¿Qué es un adjetivo? ");
      System.out.println("1. El adjetivo en una oración, es la acción que hace la persona");
      System.out.println("2. El adjetivo describe al personaje del cual se habla en una oración");
      System.out.println("3. El adjetivo es el personaje del cual se habla en una oración");
      System.out.println("4. El adjetivo describe al verbo del cual se habla en la oración");
      l1 = 2;
      Respuestas();

    }
    else if(opcion == 4){
      System.out.println("Regresango al menu principal.\n");
    }
    else{
      System.out.print("Usted no ha elegido ninguna de las opciones disponibles");
    }
  } 


  public void Nivel2(int opcion){
    if (opcion == 1){
      System.out.println("La palabra cantar es aguda");
      System.out.println("Dicho esto, ¿Qué es una palabra aguda?");
      System.out.println("1. Una palabra aguda es aquella que tiene la sílaba tónica en la penúltima sílaba");
      System.out.println("2. Una palabra aguda es aquella que tiene la sílaba tónica en cualquier sílaba antes de la penúltima");
      System.out.println("3. Una palabra aguda es aquella que no tiene sílaba tónica");
      System.out.println("4. Una palabra aguda es aquella que tiene la sílaba tónica en la última sílaba");

    //Respuesta 
      l1 = 4;
      Respuestas();
    }
    else if(opcion==2){
      System.out.println("La palabra banco es grave");
      System.out.println("Dicho esto, ¿Qué es una palabra grave?");
      System.out.println("1. Una palabra grave es aquella que tiene la sílaba tónica en la penúltima sílaba");
      System.out.println("2. Una palabra grave es aquella que tiene la sílaba tónica en cualquier sílaba antes de la penúltima");
      System.out.println("3. Una palabra grave es aquella que no tiene sílaba tónica");
      System.out.println("4. Una palabra grave es aquella que tiene la sílaba tónica en la última sílaba");

      l1 = 1;
      Respuestas();
    }
    
    else if(opcion==3){
      System.out.println("La palabra película es esdrújula");
      System.out.println("Dicho esto, ¿Qué es una palabra esdrújula?");
      System.out.println("1. Una palabra esdrújula es aquella que tiene la sílaba tónica en la penúltima sílaba");
      System.out.println("2. Una palabra esdrújula es aquella que tiene la sílaba tónica en cualquier sílaba antes de la penúltima");
      System.out.println("3. Una palabra esdrújula es aquella que no tiene sílaba tónica");
      System.out.println("4. Una palabra esdrújula es aquella que tiene la sílaba tónica en la última sílaba");

      l1 = 2;
      Respuestas();
    } else if(opcion == 4){
      System.out.println("Regresango al menu principal.\n");
    }
    else{
      System.out.print("Usted no ha elegido ninguna de las opciones disponibles");
    }
  }

  public void Nivel3(int opcion){
    if (opcion == 1){
      System.out.println("El Sr. Manuel es doctor.");
      System.out.println("La oración utiliza el punto corectamente.");
      System.out.println("Habiendo dicho esto, ¿para qué sirve el punto?");
      System.out.println("1. Su único proposito es finalizar una orración o párrafo.");
      System.out.println("2. Sirve para separar una enumeración.");
      System.out.println("3. Se utiliza para describir al personaje de una oración.");
      System.out.println("4. Sire para finalizar una oración o párrafo, y además, se coloca detrás de abreviaciones.");

    //Respuesta 
      l1 = 2;
      Respuestas();
    }
    else if(opcion==2){
      System.out.println("En mi casa tengo perros, gatos, conejos y pajaritos.");
      System.out.println("La oración utiliza la coma corectamente.");
      System.out.println("Habiendo dicho esto, ¿para qué sirve la coma?");
      System.out.println("1. Se utiliza para finalizar una oración o párrafo.");
      System.out.println("2. Sirve para describir la acción que se está realizando en una oración.");
      System.out.println("3. La coma nos ayuda para describir los atributos de una persona o lugar.");
      System.out.println("4. Es utilizada para separar y hacer pequeñas pausas en un texto.");

      l1 = 4;
      Respuestas();
    }
    
    else if(opcion==3){
      System.out.println("Hoy es mi cumpleaños!");
      System.out.println("Una oración utiliza los signos de exclamación y la otra los signos de interrogación corectamente.");
      System.out.println("Habiendo dicho esto, ¿para qué sirven estos dos signos?");
      System.out.println("1. Se utilizan para cualquier tipo de oración");
      System.out.println("2. Se utilizan para preguntas unicamente.");
      System.out.println("3. Se utilizan para representar el tono de la oración, sea esta una pregunta o una exclamación.");
      System.out.println("4. Se utilizan para exclamaciones unicamente.");

      l1 = 3;
      Respuestas();
    } else if(opcion == 4){
      System.out.println("Regresango al menu principal.\n");
    }
    else{
      System.out.print("Usted no ha elegido ninguna de las opciones disponibles");
    }

  }

  public void Respuestas(){
    int b = scan.nextInt();
    if (b == l1){
      System.out.println("¡Correcto! Muy bien hecho.\n\n");
      correctas++;
    }
    else {
      System.out.println("Eh. Incorrecto. La respuesta correcta era: "+l1+"\n\n");
    }
  }

  public int correctas(){
    return correctas;
  }


}
