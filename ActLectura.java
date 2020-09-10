
class ActLectura{
  int opcion;
  int l1;
  int l2;
  int l3;
  int correctas;

  public ActLectura(){

  }
 
 //Pensaba hacer algo parecido a lo que se hizo en el diagnóstico 

  //Menú del nivel 1 de lectura para que se muestre en el driver
  public void MenuNivel1(){
    System.out.println("Bienvenido a las actividades de lectura del nivel 1");
    System.out.println("Por favor eliga lo que quiere resolver");
    System.out.println("1. ¿Qué es un sustantivo?");
    System.out.println("2. ¿Qué es un verbo?");
    System.out.println("3. ¿Qué es un adjetivo?");
    System.out.println("4. Salir");
  }

  //Menú del nivel 2 de lectura para que se muestre en el driver
  public void MenuNivel2(){
    System.out.println("Bienvenido a las actividades de lectura del nivel 1");
    System.out.println("Para empezar se dará la definición de una sílaba tónica");
    System.out.println("La sílaba tónica, es aquella sílaba que se pronuncia más fuerte o con mayor acentuación en una palabra");
    System.out.println("Dicho esto, dependiendo en qué sílaba caiga la sílaba tónica, las palabras de dividen es agudas, graves y esdrújulas");
    System.out.println("Por favor eliga lo que quiere resolver");
    System.out.println("1. Palabras Agudas");
    System.out.println("2. Palabras Graves");
    System.out.println("3. Palabras Esdrújulas");
    System.out.println("4. Salir");
  }

  //Menú del nivel 3 de lectura para que se muestre en el driver
  public void MenuNivel3(){
    System.out.println("Bienvenido a las actividades de lectura del nivel 1");
    System.out.println("Por favor eliga lo que quiere resolver");
    System.out.println("1. El uso de la coma");
    System.out.println("2. El uso del punto");
    System.out.println("3. El uso de los signos de exclamación y admiración");
    System.out.println("4. Salir");
  }

    //Menú del nivel 4 de lectura para que se muestre en el driver
  public void MenuNivel4(){
    System.out.println("Bienvenido a las actividades de lectura del nivel 4");
    System.out.println("Por favor eliga lo que quiere resolver");
    System.out.println("1. ");
    System.out.println("2. ");
    System.out.println("3. ");
    System.out.println("4. Salir");
  }



  public void setOpcion1(int opcion){
    this.opcion = opcion;
  }

  public void Nivel1(int opcion){
    if (opcion == 1){
      System.out.println("El niño energico fue a jugar futbol");
      System.out.println("En la anterior oración, niño es el sustantivo de la oración");
      System.out.println("Dicho esto, ¿Qué es un sustantivo? ");
      System.out.println("1. El sustantivo en una oración, es la acción que hace la persona");
      System.out.println("2. El sustantivo describe al personaje del cual se habla en una oración");
      System.out.println("3. El sustantivo es el personaje del cual se habla en una oración");
      System.out.println("4. El sustantivo describe al verbo del cual se habla en la oración");

    //Respuesta 
      l1 = 3;
    }
    else if (opcion == 2){
      System.out.println("El niño enérgico fue a jugar futbol");
      System.out.println("En la anterior oración, jugar es el verbo de la oración");
      System.out.println("Dicho esto, ¿Qué es un verbo? ");
      System.out.println("1. El verbo en una oración, es la acción que hace la persona");
      System.out.println("2. El verbo describe al personaje del cual se habla en una oración");
      System.out.println("3. El verbo es el personaje del cual se habla en una oración");
      System.out.println("4. El verbo describe al verbo del cual se habla en la oración");
      l2 = 1;
    }
    else if (opcion == 3){
      System.out.println("El niño enérgico fue a jugar futbol");
      System.out.println("En la anterior oración, enérgico es el adjetivo para el sustantivo dado");
      System.out.println("Dicho esto, ¿Qué es un adjetivo? ");
      System.out.println("1. El adjetivo en una oración, es la acción que hace la persona");
      System.out.println("2. El adjetivo describe al personaje del cual se habla en una oración");
      System.out.println("3. El adjetivo es el personaje del cual se habla en una oración");
      System.out.println("4. El adjetivo describe al verbo del cual se habla en la oración");
      l3 = 2;

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
    }
    else if(opcion==2){
      System.out.println("La palabra banco es grave");
      System.out.println("Dicho esto, ¿Qué es una palabra grave?");
      System.out.println("1. Una palabra grave es aquella que tiene la sílaba tónica en la penúltima sílaba");
      System.out.println("2. Una palabra grave es aquella que tiene la sílaba tónica en cualquier sílaba antes de la penúltima");
      System.out.println("3. Una palabra grave es aquella que no tiene sílaba tónica");
      System.out.println("4. Una palabra grave es aquella que tiene la sílaba tónica en la última sílaba");

      l2 = 1;
    }
    
    else if(opcion==3){
      System.out.println("La palabra película es esdrújula");
      System.out.println("Dicho esto, ¿Qué es una palabra esdrújula?");
      System.out.println("1. Una palabra esdrújula es aquella que tiene la sílaba tónica en la penúltima sílaba");
      System.out.println("2. Una palabra esdrújula es aquella que tiene la sílaba tónica en cualquier sílaba antes de la penúltima");
      System.out.println("3. Una palabra esdrújula es aquella que no tiene sílaba tónica");
      System.out.println("4. Una palabra esdrújula es aquella que tiene la sílaba tónica en la última sílaba");

      l3 = 2;
    }
  }

  public void Nivel3(int opcion){

  }

  public void Nivel4(int opcion){
    if (opcion == 1){
    
    
    //Respuesta 
      l1 = 1;
    }
    else if(opcion==2){

      l2 = 1;
    }
    
    else if(opcion==3){



      l3 = 1;
    }
  }

  public void correctas(){
    System.out.println("Muy Bien!");
    correctas++;
  }


}
