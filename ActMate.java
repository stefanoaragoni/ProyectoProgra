import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

class ActMate{
  Random rand = new Random();
  //Preguntas determina el número de preguntas de la Actividades.
  //Correctas e incorrectas para clasificar las respuestas de los usuarios.
  //Nivel es para que dependiendo de esta variable se deplieguen actividades correspondientes.
  //Area es para definir si se trabajará en matemáticas o en lecturas. */
  int preguntas, correctas, nivel;

  int R;
  
  Scanner scan = new Scanner(System.in);

  String area;

  public ActMate() {
    preguntas = 10;
    correctas = 0;
    nivel = 1;
  }

  public void MenuNivel(int a){
    if(a == 1){
      System.out.println("Bienvenido a las actividades de matemática del nivel 1");
      System.out.println("Elija el ejecicio que desea de realizar:");
      System.out.println("1. Suma.");
      System.out.println("2. Resta");
      System.out.println("3. Suma y Resta");
      System.out.println("4. Salir.");
      int opcion1 = scan.nextInt();
      Nivel1(opcion1);
      }

    if(a == 2) {
      System.out.println("Bienvenido a las actividades de matemática del nivel 2");
      System.out.println("Elija el ejecicio que desea de realizar:");
      System.out.println("1. Multiplicación.");
      System.out.println("2. División.");
      System.out.println("3. Multiplicación y División.");
      System.out.println("4. Salir.");
      int opcion1 = scan.nextInt();
      Nivel2(opcion1);
    }

    if(a == 3) {
      System.out.println("Bienvenido a las actividades de matemática del nivel 3");
      System.out.println("Elija el ejecicio que desea de realizar:");
      System.out.println("1. Potencias.");
      System.out.println("2. Raíces.");
      System.out.println("3. Potencias y Raíces.");
      System.out.println("4. Salir.");
      int opcion1 = scan.nextInt();
      Nivel3(opcion1);

    }
    
  }

  //Actividades matemáticas 1
  public void Nivel1(int opcion){
    if (opcion == 1){
      //Sumar
      System.out.println("1, 2, 3 , 4, 5...");
      System.out.println("Los números son muy útiles para realizar tareas cotidianas.");
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

      R = 3;
      Respuestas();

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


      R = 2;
      Respuestas();

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


      R = 4;
      Respuestas();

    } else if(opcion == 4){
      System.out.println("Regresando al menu principal.\n");
    }

    else {
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
      

      R = 3;
      Respuestas();

    } else if (opcion == 2){
      //Dividir
      System.out.println("Para dividir tienes el que colocar el número que quieres dividir dentro de una caja.");
      System.out.println("Supongamos que quieres dividir 5 dentro de 2");
      System.out.println("Se coloca el 5 dentro de la caja y el 2 afuera. 2|5 .");
      System.out.println("Ahora tenemos que multiplicar.");
      System.out.println("Calculamos por cuanto se puede multiplicar el número de afuera sin pasarse del número de adentro de la caja.");
      System.out.println("En este caso si multiplicamos 2 * 2 nos da 4.");
      System.out.println("Este número es menor que 5. Así que le restamos ése 4 a 5. Y arriba de la caja colocamos el número de veces que multiplimos el número de afuera.");
      System.out.println("Entonces nos quedaría así:");
      System.out.println("    2");
      System.out.println("  2|5");
      System.out.println("   -4");
      System.out.println("");
      System.out.println("Al restar 5 - 4 nos queda 1. ");      System.out.println("Ése número que queda es el residuo. Y lo tenemos que hacer es dejar indicado que ése es el residuo.");
      System.out.println("Y el número de arriba de la caja es el resultado.");
      System.out.println("En este caso el resultado sería 2.");
      System.out.println("Otro ejemplo sería 6 / 2.");
      System.out.println("Este ejemplo nos quedaría así: ");
      System.out.println("    3");
      System.out.println("  2|6 ");
      System.out.println("   -6");
      System.out.println("   ---");
      System.out.println("    0");
      System.out.println("");
      System.out.println("¡Muy bien! Ahora hagamos un ejercicio");
      System.out.println("Ejericicio:  20 / 5");
      System.out.println("1. 2");
      System.out.println("2. 4");
      System.out.println("3. 10");
      System.out.println("4. 8");


      R = 2;
      Respuestas();

    } else if (opcion == 3){
      //Multiplicar y Dividir
      System.out.println("Muy bien. Ahora que sabemos como multiplicar y dividir vamos a porbar un ejercicio que combine ambos.");
      System.out.println("Es importante que practiques varios ejercicios antes.");
      System.out.println("Nota: Es importante que en una operación primero se tienen que hacer las multiplicaciones y divisiones, luego se hacen las sumas y restas.");
      System.out.println("Ahora sí, veamos un ejemplo.");
      System.out.println("Ejemplo:  5 / 5 * 3");
      System.out.println("Aquí primero se divide 5 / 5 y eso nos da 1, luego eso se multiplica * 3 y eso nos queda 3.");
      System.out.println("Pasemos al ejercicio...");
      System.out.println("Ejercicio: 30 / 15 * 2");
      System.out.println("1. 1");
      System.out.println("2. 2");
      System.out.println("3. 4");
      System.out.println("4. 6");


      R = 3;
      Respuestas();

    } else if(opcion == 4){
      System.out.println("Regresando al menu principal.\n");
    }

    else {
      System.out.println("Número no válido. Por favor ingrese un número entre 1 y 3.");
    }
  }

  //Actividades matemáticas 3
  public void Nivel3(int opcion){
    if (opcion == 1){
      //Potencias
      System.out.println("Ahora la cosa se complica, llegamos a la parte de las potencias.");
      System.out.println("La potencia de un número es el número multiplicado muchas veces.");
      System.out.println("Bastante simple, ¿no?");
      System.out.println("Veamos dos ejemplos para entenderlo.");
      System.out.println("9^2");
      System.out.println("Primero, debemos idenificar la base, en este caso es 9.");
      System.out.println("Luego, multiplicamos la cantidad de veces que indique la potencia");
      System.out.println("9 * 9");
      System.out.println("81.");
      System.out.println("Muy bien. Vamos al segundo ejemplo.");
      System.out.println("2^3");
      System.out.println("Nuevamente, lo primero que debemos hacer es idenificar la base, en este caso es 2.");
      System.out.println("Luego, multiplicamos la cantidad de veces que indique la potencia");
      System.out.println("2 * 2 * 2");
      System.out.println("4 * 2");
      System.out.println("8.");
      System.out.println("");
      System.out.println("Creo que estamos listos para intentar un ejercicio.");
      System.out.println("Ejercicio:  5^3");
      System.out.println("10");
      System.out.println("25");
      System.out.println("125");
      System.out.println("30");

	    //Respuesta 
      R = 3;
      Respuestas();
    }
    else if (opcion == 2){
      //Raíces
      System.out.println("Ahora que sabemos potencias podemos avanzar a raíces.");
      System.out.println("La raíz de un número es el inverso de elevarlo a una potencia.");
      System.out.println("En lecciones anteriores aprendimos las potencias de cualquier número.");
      System.out.println("Para entender las raíces, tu conocimiento en tablas de multiplicar debe estar muy elevado, epecialmente la parte donde se multiplicaba el número por el mismo.");
      System.out.println("Una raíz tiene dos puntos importantes, la base de la raíz y lo que se encuentra dentro de la raíz.");
      System.out.println("Ejemplo 1: Raíz cuadrada de 64.");
      System.out.println("Primero identificamos la base, una raíz cuadrada es base 2.");
      System.out.println("La base 2 nos indica que un número se multiplicó por él mismo para llegar a 64.");
      System.out.println("¿Qué número multiplicado por el mismo es 64?");
      System.out.println("¡Correcto! Es 8.");
      System.out.println("Ejemplo 2: Raíz cúbica de 8.");
      System.out.println("Primero identificamos la base, una raíz cúbica es base 3.");
      System.out.println("La base 3 nos indica que un número se multiplicó por él mismo  y luego otra vez para llegar a 8.");
      System.out.println("¿Qué número multiplicado 3 veces es 8?");
      System.out.println("¡Correcto! Es 2. Fue un poco mas difícil no?");
      System.out.println("Bien, ahora es hora del ejercicio.");
      System.out.println("Ejercicio: Raíz cuadrada de 81.");
      System.out.println("1. 3");
      System.out.println("2. 9");
      System.out.println("3. 8");
      System.out.println("4. 5");

      //Respuesta
      R = 2;
      Respuestas();
    }
    else if (opcion == 3){
      //Potencias y raíces
      System.out.println("Si estás aquí es porque quieres un reto. ¡Muy bien!");
      System.out.println("Al trabajar raíces y potencas al mismo tiempo es importante saber que podemos simplificar la expresión antes de ponernos a multiplicar y dividir sin sentido.");
      System.out.println("Ejemplo 1: Raíz cuadrada de 9^4");
      System.out.println("Antes de empezar a multiplicar 9 cuatro veces, párate a pensar, ¿es realmente necesario?");
      System.out.println("Pensemos en la raíz primero, nuetra raíz de base 2 nos indica que nuestro exponente será partido por la mitad.");
      System.out.println("Simplificando, hallamos que la expresión es equivalente a 9^2.");
      System.out.println("Este resultado lo conocemos y es 81.");
      System.out.println("");
      System.out.println("Ejemplo 2: Raíz cúbica de 5^9");
      System.out.println("Antes de empezar a multiplicar 5 nueve veces como loco, pensemos como en el otro ejemplo.");
      System.out.println("Pensemos en la raíz primero, nuetra raíz de base 3 nos indica que nuestro exponente será partido por 3.");
      System.out.println("Simplificando, hallamos que la expresión es equivalente a 5^3.");
      System.out.println("Para hallar este resultado multiplicamos 5 tres veces.");
      System.out.println("5 * 5 * 5");
      System.out.println("25 * 5");
      System.out.println("125.");
      System.out.println("Ahora, podemos pasar al ejercicio");
      System.out.println("Raiz cuarta de 6^8");
      System.out.println("1. 36");
      System.out.println("2. 1296");
      System.out.println("3. 6");
      System.out.println("4. 1000");

      //Respuesta
      R =1;
      Respuestas();

    }
    else if(opcion == 4){
      System.out.println("Regresando al menu principal.\n");
    }
    else{
      System.out.print("Número no válido. Por favor ingrese un número entre 1 y 3.");
    }
  } 

  //Actividades matemáticas 3

  public void Respuestas(){
    int b = scan.nextInt();
    if (b == R){
      System.out.println("¡Correcto! Muy bien hecho.\n\n");
      correctas++;
    }
    else {
      System.out.println("Eh. Incorrecto. La respuesta correcta era: "+R+"\n\n");
    }
  }

  public int correctas(){
    return correctas;
  }

} 
 