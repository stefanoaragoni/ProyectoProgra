import java.util.Random;
class ActividadesMate{
   Random rand = new Random();
   //Preguntas determina el número de preguntas de la Actividades.
   //Correctas e incorrectas para clasificar las respuestas de los usuarios.
   //Nivel es para que dependiendo de esta variable se deplieguen actividades correspondientes.
   //Area es para definir si se trabajará en matemáticas o en lecturas. */
   int preguntas, correctas, incorrectas, nivel;
   String area;

  public ActividadesMate() {
    preguntas = 10;
    correctas = 0;
    incorrectas = 0;
    nivel = 1;
  }

  public void MenuNivel1() {
    System.out.println("Bienvenido a las actividades de matemática del nivel 1");
    System.out.println("Elija el ejecicio que desea de realizar:");
    System.out.println("1. Suma.");
    System.out.println("2. Resta");
    System.out.println("3. Suma y Resta");

  }

  public void MenuNivel2() {
    System.out.println("Bienvenido a las actividades de matemática del nivel 1");
    System.out.println("Elija el ejecicio que desea de realizar:");
    System.out.println("1. Multiplicación.");
    System.out.println("2. División.");
    System.out.println("3. Multiplicación y División.");
  }

  public void MenuNivel3() {
    System.out.println("Bienvenido a las actividades de matemática del nivel 1");
    System.out.println("Elija el ejecicio que desea de realizar:");
    System.out.println("1. Potencias.");
    System.out.println("2. Raíces.");
    System.out.println("3. Potencias y Raíces.");

  }

  //Getters

  //Setters
  
  //Actividades matemáticas 1
  public void Nivel1(int opcion){
    if (opcion == 1){

    } else if (opcion == 2){

    } else if (opcion == 3){

    } else {
      System.out.println("Número no válido. Por favor ingrese un número entre 1 y 3.");
    }
  }
  //Actividades matemáticas 2
  //Actividades matemáticas 3


} 
