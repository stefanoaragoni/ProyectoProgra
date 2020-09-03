
class ActLectura{
  int opcion;
  int l1;

  public ActLectura(){

  }
 
 //Pensaba hacer algo parecido a lo que se hizo en el diagnóstico 
 //Se va a recibir el 
  public void MenuNivel1(){
    System.out.println("Bienvenido a las actividades de lectura del nivel 1");
    System.out.println("Por favor eliga lo que quiere resolver");
    System.out.println("1. ¿Qué es un sustantivo?");
    System.out.println("2. ¿Qué es un verbo?");
    System.out.println("3. ¿Qué es un adjetivo?");
    System.out.println("4. Salir");
  }
  public void MenuNivel2(){

  }

  public void setOpcion1(int opcion){
    this.opcion = opcion;
  }

  public void Nivel1(int opcion){
    if (opcion == 1){
      System.out.println("1. El sustantivo en una oración, es la acción que hace la persona");
      System.out.println("2. El sustantivo ")
    }
    else if (opcion == 2){
      
    }
    else if (opcion == 3){

    }
    else{
      System.out.print("Usted no ha elegido ninguna de las opciones disponibles")
    }
  } 


}
