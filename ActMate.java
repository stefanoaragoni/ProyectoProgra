import java.util.Random;
class ActMate{
   Random rand = new Random();
   //Preguntas determina el número de preguntas de la Actividades.
   //Correctas e incorrectas para clasificar las respuestas de los usuarios.
   //Nivel es para que dependiendo de esta variable se deplieguen actividades correspondientes.
   //Area es para definir si se trabajará en matemáticas o en lecturas. */
   int preguntas, correctas, incorrectas, nivel, opcion;
   int R1, R2, R3;
   String area;

  public ActMate() {
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
    System.out.println("4. Salir.");

  }

  public void MenuNivel2() {
    System.out.println("Bienvenido a las actividades de matemática del nivel 1");
    System.out.println("Elija el ejecicio que desea de realizar:");
    System.out.println("1. Multiplicación.");
    System.out.println("2. División.");
    System.out.println("3. Multiplicación y División.");
    System.out.println("4. Salir.");
  }

  public void MenuNivel3() {
    System.out.println("Bienvenido a las actividades de matemática del nivel 1");
    System.out.println("Elija el ejecicio que desea de realizar:");
    System.out.println("1. Potencias.");
    System.out.println("2. Raíces.");
    System.out.println("3. Potencias y Raíces.");
    System.out.println("4. Salir.");

  }
  public void setOpcion2(int opcion){
    this.opcion = opcion;
  }
  //Getters

  //Setters
  
  //Actividades matemáticas 1
  public void Nivel1(int opcion){
    if (opcion == 1){
      //Sumar
      System.out.println("1, 2, 3 , 4, 5...");
      System.out.println("Los números son muy útiles para realizar tareas cotidianas");
      System.out.println("Por eso es MUY IMPORTANTE que aprendamos a manejar bien estos.");
      System.out.println("Un ejemplo sencillo de esto es lo siguiente: ");
      System.out.println("Si Pedro tiene 3 manzanas y decide comprar otra manzana, Pedro ahora tiene 4 manzanas. ");
      System.out.println("Fácil, ¿no?");
      System.out.println("");
      System.out.println("Pues todavía falta un poco más...");
      System.out.println("Juan tiene 15 naranjas y le regalan otras 5 naranjas. ");
      System.out.println("  15");
      System.out.println("+ 05");
      System.out.println("  ---");
      System.out.println("En este caso hay que sumar primero los número de hasta la derecha.");
      System.out.println("Eso sería 5 + 5 = 10. ¡Perfecto!");
      System.out.println("Ahora escribimos el 0 abajo de la línea y sumamos el 1 con el otra 1.");
      System.out.println("Eso nos quedaría algo así: ");
      System.out.println("  15");
      System.out.println("+ 05");
      System.out.println("  ---");
      System.out.println("  20");
      System.out.println("Este mismo proceso se tiene que repetir con número que sean más grandes o más pequeños.");
      System.out.println("");
      System.out.println("Creo que estamos listos para intentar algunos ejercicio.");
      System.out.println("Ejercicio:  35 + 25 ");
      System.out.println("1. 510");
      System.out.println("2. 65");
      System.out.println("3. 60");
      System.out.println("4. 55");
      
      R1 = 3;


    } else if (opcion == 2){
      //Restar
      System.out.println("Restar es una operación facil de hacer.");
      System.out.println("Si tienes 3 monedas y le regalas una a Juanito te quedarán 2 monedas.");
      System.out.println("Si tienes un billete de Q10.00 y te compras algo de Q5.00 te quedarán Q5.00 .");
      System.out.println("Lo importantes para aprender a restar es el concepto de PRESTAR ");
      System.out.println("Por ejemplo: ");
      System.out.println("  12 ");
      System.out.println("-  5");
      System.out.println("  --");
      System.out.println("Siempre vamos a empezar de derecha a izquierda.");
      System.out.println("Al 2 le tenemos que restar 5. Sabemos que eso eso no se puede.");
      System.out.println("Así que le vamos a prestar el uno de la derecha. Entonces lo tomamos ahora como 12 - 5 y esto nos dará 7. Puede ser algo confuso al principio, pero daremos otro ejemplo.");
      System.out.println("  24 ");
      System.out.println("-  7");
      System.out.println("  --");
      System.out.println("Aquí le tenemos que restar 7 al 4. No se puede. Así que le vamos a prestar al número de la izquierda. Entonces el 2 de la izquierda va a prestar 1 a la derecha. Como presto uno entonces el número de la izquierda ahora es 1.");
      System.out.println("Y el otro 1 que prestamos pasa a la derecha. Entonces ahora se vuelve 14 - 7. Esto da como resultado 7.");
      System.out.println("De lado izquiera queda el número 1 y se le resta el número 0. Entonces va a quedar el número uno.");
      System.out.println("Si a un número le restas 0 te queda el mismo número. ");
      System.out.println("Coloquemos un ejercicio.");
      System.out.println(" ");
      System.out.println("Ejericicio:  35 - 20");
      System.out.println("1. 25");
      System.out.println("2. 15");
      System.out.println("3. 20");
      System.out.println("4. 05");

      R2 = 2;

    } else if (opcion == 3){
      //Suma y Resta
      System.out.println("En los módulos anteriores hemos repasado los conceptos básicos de suma y de resta.");
      System.out.println("Ahora haremos la prueba con algunos ejercicios combinados.");
      System.out.println("Si tenemos 7 manzanas y nos regalan 2, pero luego perdemos 4. ¿Cuántas manzanas nos quedan?");
      System.out.println("Las operaciones se hacen de izquierda a derecha.");
      System.out.println("Sabemos que si a 7 le añades 2 te quedan 9 y si le quitas 4 te van a quedar 5.");
      System.out.println("Así que probemos con un ejercicio.");
      System.out.println("Ejercicio: 40 + 60 - 15");
      System.out.println("1. 90");
      System.out.println("2. 105");
      System.out.println("3. 45");
      System.out.println("4. 85");

      R3 = 4;
    } else {
      System.out.println("Número no válido. Por favor ingrese un número entre 1 y 3.");
    }
  }
  //Actividades matemáticas 2
  public void Nivel2(int opcion){
    if (opcion == 1){
      //Multiplicar
      System.out.println("Llegamos a la parte de multiplicar");
      System.out.println("Multiplicar es sumar un mismo número por x veces.");
      System.out.println("Para esta parte es fundamental que te repases las tablas de multiplicar.");
      System.out.println("Puede que tome un par de chanclazos pero las aprenderas.");
      System.out.println("Un ejemplo: 3 * 2 = 6 ");
      System.out.println("4 * 3 = 4 + 4 + 4 Aquí tienes que sumar el 4 durante 3 veces seguidas. ");
      System.out.println("");
      System.out.println("A veces puede ser díficil memorizar las tablas. Pero las principales son: ");
      System.out.println("La tabla del 1, 2, 3, 5, 9 y 10 ");
      System.out.println("");
      System.out.println("Cuando una multiplicación vaya más alla de lo visto en la tabla, tenemos que seguir un proceso.");
      System.out.println("  25");
      System.out.println("* 14");
      System.out.println("  -- ");
      System.out.println("");
      System.out.println("Aquí lo que tenemos que hacer es multiplicar los número de la derecha 5 * 4. ");
      System.out.println("Esto nos da como resultado 20. Copiamos el 0 abajo de los números y ponemos arriba el 2. ");
      System.out.println("Ahora tenemos que multiplicar el 2 * 4 esto da como resultado 8. A este 8 le sumamos el 2 de antes. ");
      System.out.println("Esto nos da 10. Este 10 lo colocamos a la par del 0 abajo de la línea. De modo que queda 100. ");
      System.out.println("Ahora vamos a multiplicar el 1 * 25 de arriba. Esto nos va a dar 25. Este 25 lo colocamos un número desplazado a hacia la izquierda. De modo que queda: ");
      System.out.println("  25");
      System.out.println("* 14");
      System.out.println(" --- ");
      System.out.println(" 100 ");
      System.out.println(" 25 ");
      System.out.println(" --- ");
      System.out.println("");
      System.out.println("Ahora tenemos que sumar estos dos números conforme a los números y su correspondiente. ");
      System.out.println("La suma de estos te va a quedar 350. Y ese va a ser tu resultado final. ");
      System.out.println("Recuerda que todo número multiplicado por 0 te da 0 y que todo número multiplicado por 1 te da el mismo número.");
      System.out.println("Y si algo no te queda claro vuelve a leer esta explicación.");
      System.out.println("");
      System.out.println("Intentemos con un ejercicio.");
      System.out.println("Ejercicio:  66 * 20 ");
      System.out.println("1. 12");
      System.out.println("2. 120");
      System.out.println("3. 1320");
      System.out.println("4. 152");
      
      R1 = 3;


    } else if (opcion == 2){
      //Dividir
      System.out.println("Para dividir tienes el que colocar el número que quieres dividir dentro de una caja.");
      System.out.println("Supongamos que quieres dividir 5 dentro de 2");
      System.out.println("Se coloca el 5 dentro de la caja y el 2 afuera. 2|5 .");
      System.out.println("Lo");
      System.out.println("Por ejemplo: ");
      System.out.println("  12 ");
      System.out.println("-  5");
      System.out.println("  --");
      System.out.println("Siempre vamos a empezar de derecha a izquierda.");
      System.out.println("Al 2 le tenemos que restar 5. Sabemos que eso eso no se puede.");
      System.out.println("Así que le vamos a prestar el uno de la derecha. Entonces lo tomamos ahora como 12 - 5 y esto nos dará 7. Puede ser algo confuso al principio, pero daremos otro ejemplo.");
      System.out.println("  24 ");
      System.out.println("-  7");
      System.out.println("  --");
      System.out.println("Aquí le tenemos que restar 7 al 4. No se puede. Así que le vamos a prestar al número de la izquierda. Entonces el 2 de la izquierda va a prestar 1 a la derecha. Como presto uno entonces el número de la izquierda ahora es 1.");
      System.out.println("Y el otro 1 que prestamos pasa a la derecha. Entonces ahora se vuelve 14 - 7. Esto da como resultado 7.");
      System.out.println("De lado izquiera queda el número 1 y se le resta el número 0. Entonces va a quedar el número uno.");
      System.out.println("Si a un número le restas 0 te queda el mismo número. ");
      System.out.println("Coloquemos un ejercicio.");
      System.out.println(" ");
      System.out.println("Ejericicio:  35 - 20");
      System.out.println("1. 25");
      System.out.println("2. 15");
      System.out.println("3. 20");
      System.out.println("4. 05");

      R2 = 2;

    } else if (opcion == 3){
      //Multiplicar y Dividir
      System.out.println("En los módulos anteriores hemos repasado los conceptos básicos de suma y de resta.");
      System.out.println("Ahora haremos la prueba con algunos ejercicios combinados.");
      System.out.println("Si tenemos 7 manzanas y nos regalan 2, pero luego perdemos 4. ¿Cuántas manzanas nos quedan?");
      System.out.println("Las operaciones se hacen de izquierda a derecha.");
      System.out.println("Sabemos que si a 7 le añades 2 te quedan 9 y si le quitas 4 te van a quedar 5.");
      System.out.println("Así que probemos con un ejercicio.");
      System.out.println("Ejercicio: 40 + 60 - 15");
      System.out.println("1. 90");
      System.out.println("2. 105");
      System.out.println("3. 45");
      System.out.println("4. 85");

      R3 = 4;
    } else {
      System.out.println("Número no válido. Por favor ingrese un número entre 1 y 3.");
    }
  }
  
  //Actividades matemáticas 3


} 
 