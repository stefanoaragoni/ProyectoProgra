/******************************************************************
ActLectura.java
Autores: Stefano Aragoni, Rebecca Smith, Roberto Vallecillos, Cayetano molina, Daniel Cabrera, Diego Ruiz
Última modificación: 2020-09-11

******************************************************************/

import java.util.concurrent.TimeUnit;
import java.util.Scanner;


class ActLectura {
  private int opcion1;
  private int l1;
  private int correctas;

  Scanner scan = new Scanner(System.in);
  Verificador verify = new Verificador();

  public ActLectura() {

  }

  // Menú del nivel 1 de lectura para que se muestre en el driver
  public void MenuNivel(int a) {
    if (a == 1) {
      System.out.println("Bienvenido a las actividades de lectura del nivel 1.\n");
      System.out.println("Por favor eliga lo que quiere resolver.");
      System.out.println("1. ¿Qué es un sustantivo?");
      System.out.println("2. ¿Qué es un verbo?");
      System.out.println("3. ¿Qué es un adjetivo?");
      System.out.println("4. Salir");
    }

    // Menú del nivel 2 de lectura para que se muestre en el driver
    if (a == 2) {
      System.out.println("Bienvenido a las actividades de lectura del nivel 2.\n");
      System.out.println("Para empezar se dará la definición de una sílaba tónica.");
      System.out.println(
          "La sílaba tónica, es aquella sílaba que se pronuncia más fuerte o con mayor acentuación en una palabra.");
      System.out.println(
          "Dicho esto, dependiendo en qué sílaba caiga la sílaba tónica, las palabras de dividen es agudas, graves y esdrújulas.\n");
      System.out.println("Por favor eliga lo que quiere resolver");
      System.out.println("1. Palabras Agudas");
      System.out.println("2. Palabras Graves");
      System.out.println("3. Palabras Esdrújulas");
      System.out.println("4. Salir");
    }

    // Menú del nivel 3 de lectura para que se muestre en el driver
    if (a == 3) {
      System.out.println("Bienvenido a las actividades de lectura del nivel 3.\n");
      System.out.println("Por favor eliga lo que quiere resolver");
      System.out.println("1. El uso del punto");
      System.out.println("2. El uso de la coma");
      System.out.println("3. El uso de los signos de exclamación e interrogacion");
      System.out.println("4. Salir");
    }
    
    //Menú del nivel 4 de lectura que se muestra en el driver
    if(a==4){
      System.out.println("Bienvenido a las actividades de lectura del nivel 4.\n");
      System.out.println("Por favor eliga lo que quiere resolver");
      System.out.println("1. Nivel de comprensión literal");
      System.out.println("2. Nivel de comprensión inferencial");
      System.out.println("3. Nivel de comprensión crítico");
      System.out.println("4. Salir");
    }
    //Menú del nivel 5 de lectura que se muestra en el driver
    if(a==5){
      System.out.println("Bienvenido a las actividades de lectura del nivel 5.\n");
      System.out.println("Por favor eliga lo que quiere resolver");
      System.out.println("1. Cuento");
      System.out.println("2. Fabula");
      System.out.println("3. Texto cientifico");
      System.out.println("4. Salir");
    }
  }


  //actividades del nivel 1 de lectura
  public int Nivel1(int opcion) {
    if (opcion == 1) {
      System.out.println("\nEl niño energico fue a jugar futbol.");
      System.out.println("En la anterior oración, niño es el sustantivo de la oración");
      System.out.println("Dicho esto, ¿Qué es un sustantivo? ");
      System.out.println("1. El sustantivo en una oración, es la acción que hace la persona");
      System.out.println("2. El sustantivo describe al personaje del cual se habla en una oración");
      System.out.println("3. El sustantivo es el personaje del cual se habla en una oración");
      System.out.println("4. El sustantivo describe al verbo del cual se habla en la oración");

      // Respuesta
      l1 = 3;

    } else if (opcion == 2) {
      System.out.println("\nEl niño enérgico fue a jugar futbol");
      System.out.println("En la anterior oración, jugar es el verbo de la oración");
      System.out.println("Dicho esto, ¿Qué es un verbo? ");
      System.out.println("1. El verbo en una oración, es la acción que hace la persona");
      System.out.println("2. El verbo describe al personaje del cual se habla en una oración");
      System.out.println("3. El verbo es el personaje del cual se habla en una oración");
      System.out.println("4. El verbo describe al verbo del cual se habla en la oración");
      l1 = 1;
  
    } else if (opcion == 3) {
      System.out.println("\nEl niño enérgico fue a jugar futbol");
      System.out.println("En la anterior oración, enérgico es el adjetivo para el sustantivo dado");
      System.out.println("Dicho esto, ¿Qué es un adjetivo? ");
      System.out.println("1. El adjetivo en una oración, es la acción que hace la persona");
      System.out.println("2. El adjetivo describe al personaje del cual se habla en una oración");
      System.out.println("3. El adjetivo es el personaje del cual se habla en una oración");
      System.out.println("4. El adjetivo describe al verbo del cual se habla en la oración");
      l1 = 2;


    } else if (opcion == 4) {
      System.out.println("Regresando al menu principal.\n");
    } else {
      System.out.print("Usted no ha elegido ninguna de las opciones disponibles");

    }
    return l1;
    
    
    }
  
  //Actividades nivel 2 de lectura
  public int Nivel2(int opcion) {
    if (opcion == 1) {
      System.out.println("\nLa palabra cantar es aguda");
      System.out.println("Dicho esto, ¿Qué es una palabra aguda?");
      System.out.println("1. Una palabra aguda es aquella que tiene la sílaba tónica en la penúltima sílaba");
      System.out.println("2. Una palabra aguda es aquella que tiene la sílaba tónica en cualquier sílaba antes de la penúltima");
      System.out.println("3. Una palabra aguda es aquella que no tiene sílaba tónica");
      System.out.println("4. Una palabra aguda es aquella que tiene la sílaba tónica en la última sílaba");

      // Respuesta
      l1 = 4;
  
    } else if (opcion == 2) {
      System.out.println("\nLa palabra banco es grave");
      System.out.println("Dicho esto, ¿Qué es una palabra grave?");
      System.out.println("1. Una palabra grave es aquella que tiene la sílaba tónica en la penúltima sílaba");
      System.out.println(
          "2. Una palabra grave es aquella que tiene la sílaba tónica en cualquier sílaba antes de la penúltima");
      System.out.println("3. Una palabra grave es aquella que no tiene sílaba tónica");
      System.out.println("4. Una palabra grave es aquella que tiene la sílaba tónica en la última sílaba");

      l1 = 1;
 
    }

    else if (opcion == 3) {
      System.out.println("\nLa palabra película es esdrújula");
      System.out.println("Dicho esto, ¿Qué es una palabra esdrújula?");
      System.out.println("1. Una palabra esdrújula es aquella que tiene la sílaba tónica en la penúltima sílaba");
      System.out.println(
          "2. Una palabra esdrújula es aquella que tiene la sílaba tónica en cualquier sílaba antes de la penúltima");
      System.out.println("3. Una palabra esdrújula es aquella que no tiene sílaba tónica");
      System.out.println("4. Una palabra esdrújula es aquella que tiene la sílaba tónica en la última sílaba");

      l1 = 2;

    } else if (opcion == 4) {
      System.out.println("Regresando al menu principal.\n");
    } else {
      System.out.print("Usted no ha elegido ninguna de las opciones disponibles");
    }
    return l1;

  }
  // Nivel de lectura 3
  public int Nivel3(int opcion) {
    if (opcion == 1) {
      System.out.println("\nEl Sr. Manuel es doctor.");
      System.out.println("La oración utiliza el punto corectamente.");
      System.out.println("Habiendo dicho esto, ¿para qué sirve el punto?");
      System.out.println("1. Su único proposito es finalizar una oración o párrafo.");
      System.out.println("2. Sirve para separar una enumeración.");
      System.out.println("3. Se utiliza para describir al personaje de una oración.");
      System.out.println("4. Sire para finalizar una oración o párrafo, y además, se coloca detrás de abreviaciones.");

      // Respuesta
      l1 = 4;

    } else if (opcion == 2) {
      System.out.println("\nEn mi casa tengo perros, gatos, conejos y pajaritos.");
      System.out.println("La oración utiliza la coma corectamente.");
      System.out.println("Habiendo dicho esto, ¿para qué sirve la coma?");
      System.out.println("1. Se utiliza para finalizar una oración o párrafo.");
      System.out.println("2. Sirve para describir la acción que se está realizando en una oración.");
      System.out.println("3. La coma nos ayuda para describir los atributos de una persona o lugar.");
      System.out.println("4. Es utilizada para separar y hacer pequeñas pausas en un texto.");

      l1 = 4;
  
    }

    else if (opcion == 3) {
      System.out.println("\nHoy es mi cumpleaños!");
      System.out.println("Una oración utiliza los signos de exclamación y la otra los signos de interrogación corectamente.");
      System.out.println("Habiendo dicho esto, ¿para qué sirven estos dos signos?");
      System.out.println("1. Se utilizan para cualquier tipo de oración");
      System.out.println("2. Se utilizan para preguntas unicamente.");
      System.out.println("3. Se utilizan para representar el tono de la oración, sea esta una pregunta o una exclamación.");
      System.out.println("4. Se utilizan para exclamaciones unicamente.");

      l1 = 3;

    } else if (opcion == 4) {
      System.out.println("Regresando al menu principal.\n");
    } else {
      System.out.print("Usted no ha elegido ninguna de las opciones disponibles");
    }
    return l1;
  }

  public int Nivel4(int opcion) {
    if (opcion == 1) {
      System.out.println("Usted ha elegido el nivel de comprensión literal.");
      System.out.println("Este nivel de comprensión se refiere a todo aquello que se puede sacar de lo leído");
      System.out.println("Es decir, todo la información que está explicitamente observada en el texto leído");
      System.out.println("Por ejemplo:");
      System.out.println("'Según una encuesta, se ha comprobado que el 50% de los estudiantes de secundaria, les gusta practicar algun deporte.'");
      System.out.println("La información que se puede sacar de la oración es la siguiente:");
      System.out.println("- El porcentaje de estudiantes a los que les gusta practicar un deporte");
      System.out.println("- El nivel de educación de los estudiantes");
      System.out.println("- De donde se obtuvo el porcentaje de estudiantes.");
      System.out.println("\nAhora tendremos una pregunta para saber si se entendió bien el tema.");
      System.out.println("\nLos jovenes de latinoamerica son más propensos a saludar con un abrazo a un extraño.");
      System.out.println("\nDicho esto, ¿Qué información se puede obtener de la anterior oración desde un punto de vista literal?");
      System.out.println("1. Los jovenes de latinoamerica son mas afectivos.");
      System.out.println("2. Los jovenes son de Canadá");
      System.out.println("3. Los jovenes de latinoamerica usualmente saludan con un abrazo.");
      System.out.println("4. Es inaudito que los jovenes de latinoamérica saluden con un abrazo usualmente; en especial en tiempos de pandemia.");

      // Respuesta
      l1 = 3;

    } else if (opcion == 2) {
      System.out.println("Usted ha elegido el nivel de comprensión inferencial.");
      System.out.println("Este nivel de comprensión se refiere a todo aquello que se puede sacar más allá de lo leído");
      System.out.println("Es decir, todo la información que se puede obtener una vez se investiga el contexto de lo leído. En otras palabras que se puede inferir de lo leído, que podemos asumir.");
      System.out.println("Por ejemplo:");
      System.out.println("'Según una encuesta, se ha comprobado que el 50% de los estudiantes de secundaria, les gusta practicar algun deporte.'");
      System.out.println("Lo que se puede inferir de la oración es la siguiente:");
      System.out.println("- Los estudiantes de secundaria por lo general son más activos ya que poseen mucha energía y además quieren disfrutar de su juventud.");
      System.out.println("Por lo tanto, se podría decir que debido a esto, a los estudiantes de secundaria les gusta practicar un deporte porque deben sacar su energía almacenada de algún modo u otro.");
      System.out.println("Siendo la practica de un deporte, la forma más eficiente, divertida y fácil de lograr esto.");
      System.out.println("\nAhora tendremos una pregunta para saber si se entendió bien el tema.");
      System.out.println("\nLos jovenes de latinoamerica son más propensos a saludar con un abrazo a un extraño.");
      System.out.println("\nDicho esto, ¿Qué información se puede inferir de la anterior oración desde un punto de vista inferencial?");
      System.out.println("1. Los jovenes de latinoamerica son mas afectivos debido a que desde su crianza sus padres fueron más afectivos con ellos.");
      System.out.println("2. Los jovenes son de Canadá");
      System.out.println("3. Los jovenes de latinoamerica usualmente saludan con un abrazo.");
      System.out.println("4. Es inaudito que los jovenes de latinoamérica saluden con un abrazo usualmente; en especial en tiempos de pandemia.");

      // Respuesta
      l1 = 1;
  
    }

    else if (opcion == 3) {
      System.out.println("Usted ha elegido el nivel de comprensión crítico.");
      System.out.println("Este nivel de comprensión se refiere a todo aquello que aporte a la discusión acerca de por que algo ocurre o como se da algo.");
      System.out.println("Es decir, toda aquella opinion que uno tenga acerca de un tema la cual aporte un argumento para alguna situación específica.");
      System.out.println("Por ejemplo:");
      System.out.println("'Según una encuesta, se ha comprobado que el 50% de los estudiantes de secundaria, les gusta practicar algun deporte.'");
      System.out.println("Lo que se puede obtener críticamente de la oración es la siguiente:");
      System.out.println("- Más estudiantes deberían de unirse a este grupo que practica algún deporte pues es algo sano de hacer.");
      System.out.println("- Es bueno que los estudiantes se interesen en una actividad sana, enves de promover los vicios que arruinan la vida como lo pueden ser las drogas.");
      System.out.println("- Debe considerarse que pese a ser una encuesta, este resultado puede o no ser cierto ya que la gente puede mentir en la misma.");
      System.out.println("\nAhora tendremos una pregunta para saber si se entendió bien el tema.");
      System.out.println("\nLos jovenes de latinoamerica son más propensos a saludar con un abrazo a un extraño.");
      System.out.println("\nDicho esto, ¿Qué información se puede inferir de la anterior oración desde un punto de vista inferencial?");
      System.out.println("1. Los jovenes de latinoamerica son mas afectivos debido a que desde su crianza sus padres fueron más afectivos con ellos.");
      System.out.println("2. Los jovenes son de Canadá");
      System.out.println("3. Los jovenes de latinoamerica usualmente saludan con un abrazo.");
      System.out.println("4. Es inaudito que los jovenes de latinoamérica saluden con un abrazo usualmente; en especial en tiempos de pandemia.");

      // Respuesta
      l1 = 4;
    }else if (opcion == 4) {
      System.out.println("Regresando al menu principal.\n");

    } else {
      System.out.print("Usted no ha elegido ninguna de las opciones disponibles");
      
    }
    return l1;
  }
  // Nivel de lectura 5
  public int Nivel5(int opcion) {
    if (opcion == 1) {
      System.out.println("\nEl Cuento.");
      System.out.println("Un ejemplo de un cuento es Pinocho.");
      System.out.println("¿Cuáles de estas son características de un cuento?");
      System.out.println("1. Relaciona situaciones que viven los humanos y las protagonizan animales. Tienen una moraleja al final.");
      System.out.println("2. Se relata en versos que riman entre sí.");
      System.out.println("3. Es breve, requiere de interés, viveza y acción, normalmente solo tiene unos cuantos personajes.");
      System.out.println("4. Un texto dramático en el cual los personajes pasan de un estado desfavorable a uno favorable.");

      // Respuesta
      l1 = 3;

    } else if (opcion == 2) {
      System.out.println("\nLa Fábula");
      System.out.println("Un ejemplo de una fábula es La Liebre y la Tortuga.");
      System.out.println("¿Cuáles de estas son características de una fábula?");
      System.out.println("1. Relaciona situaciones que viven los humanos y las protagonizan animales. Tienen una moraleja al final.");
      System.out.println("2. Un texto dramático en el cual los personajes pasan de un estado favorable a uno desfavorable.");
      System.out.println("3. Narra una acción extraordinaria en la que el héroe es recordado por toda su comunidad.");
      System.out.println("4. Sucesos fabulosos con base histórica que se transmiten por tradición.");

      l1 = 1;
  
    }

    else if (opcion == 3) {
      System.out.println("\nTexto Científico");
      System.out.println("El Origen de las especies de Charles Darwin es un ejemplo de un texto científico.");
      System.out.println("¿Cuáles de estas son características de un texto científico?");
      System.out.println("1. Posee introducción, nudo y desenlace.");
      System.out.println("2. Busca transmitir las emociones del poeta.");
      System.out.println("3. Está escrito en versos con un hablante lírico.");
      System.out.println("4. Lenguaje claro, palabras de carácter académico, breve y se concentra en un solo tema.");

      l1 = 4;

    } else if (opcion == 4) {
      System.out.println("Regresando al menu principal.\n");
    } else {
      System.out.print("Usted no ha elegido ninguna de las opciones disponibles");
    }
    return l1;
  }
  

}
