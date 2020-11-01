/******************************************************************
ActMate.java
Autores: Stefano Aragoni, Rebecca Smith, Roberto Vallecillos, Cayetano molina, Daniel Cabrera, Diego Ruiz
Última modificación: 2020-10-05

******************************************************************/

//se importan las utilidades de java
import java.util.Random;
import java.util.concurrent.TimeUnit;


//crea la clase
class ActMate{
  //se instancian las clases de utilidades de java
  Random rand = new Random();

  private int correctas, opcion, R;
  

  escaner scan = new escaner();

  //constructor
  public ActMate() {
    correctas = 0;
  }

  //metodo que presenta el menu de las posibles actividades a realizar dependiendo del nivel
  public void MenuNivel(int a){
    //menu 1
    if(a == 1){
      System.out.println("Bienvenido a las actividades de matemática del nivel 1");
      System.out.println("Elija la actividad que desea de realizar:");
      System.out.println("1. Introducción a suma.");
      System.out.println("2. Introducción a resta");
      System.out.println("3. Suma y Resta");
      System.out.println("4. Salir.");

      }
    //menu 2
    if(a == 2) {
      System.out.println("Bienvenido a las actividades de matemática del nivel 2");
      System.out.println("Elija el ejecicio que desea de realizar:");
      System.out.println("1. Multiplicación.");
      System.out.println("2. División.");
      System.out.println("3. Multiplicación y División.");
      System.out.println("4. Salir.");

    }
    //menu 3
    if(a == 3) {
      System.out.println("Bienvenido a las actividades de matemática del nivel 3");
      System.out.println("Elija el ejecicio que desea de realizar:");
      System.out.println("1. Potencias.");
      System.out.println("2. Raíces.");
      System.out.println("3. Potencias y Raíces.");
      System.out.println("4. Salir.");

    }

    if(a == 4){
      System.out.println("Bienvenido a las actividades de matemática del nivel 4");
      System.out.println("Elija el ejecicio que desea de realizar:");
      System.out.println("1. Potencias.");
      System.out.println("2. Raíces.");
      System.out.println("3. Potencias y Raíces.");
      System.out.println("4. Salir.");
    } 

    if(a == 5){
      System.out.println("Bienvenido a las actividades de matemática del nivel 5");
      System.out.println("Elija el ejecicio que desea de realizar:");
      System.out.println("1. Polinomios.");
      System.out.println("2. Factor Común.");
      System.out.println("3. Multiplicación de Polinomios.");
      System.out.println("4. Salir.");
    } 
    
  }

  //metodo que instancia las preguntas del nivel 1
  public int Nivel1(int opcion){
    if (opcion == 1){
      //Sumar
      System.out.println("\n1, 2, 3 , 4, 5...");
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

    } else if (opcion == 2){
      //Restar
      System.out.println("\nRestar es una operación facil de hacer.");
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

    } else if (opcion == 3){
      //Suma y Resta
      System.out.println("\nEn los módulos anteriores hemos repasado los conceptos básicos de suma y de resta.");
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

    } else if(opcion == 4){
      System.out.println("Regresando al menu principal.\n");
    }

    else {
      System.out.println("Número no válido. Por favor ingrese un número entre 1 y 3.");
    }
    return R;
  }
  //Actividades matemáticas 2
  public int Nivel2(int opcion){
    if (opcion == 1){
      //Multiplicar
      System.out.println("\nLlegamos a la parte de multiplicar");
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

    } else if (opcion == 2){
      //Dividir
      System.out.println("\nPara dividir tienes el que colocar el número que quieres dividir dentro de una caja.");
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

    } else if (opcion == 3){
      //Multiplicar y Dividir
      System.out.println("\nMuy bien. Ahora que sabemos como multiplicar y dividir vamos a porbar un ejercicio que combine ambos.");
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

    } else if(opcion == 4){
      System.out.println("Regresando al menu principal.\n");
    }

    else {
      System.out.println("Número no válido. Por favor ingrese un número entre 1 y 3.");
    }
    return R;
  }

  //Actividades matemáticas 3
  public int Nivel3(int opcion){
    if (opcion == 1){
      //Potencias
      System.out.println("\nAhora la cosa se complica, llegamos a la parte de las potencias.");
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
      System.out.println("1. 10");
      System.out.println("2. 25");
      System.out.println("3. 125");
      System.out.println("4. 30");

	    //Respuesta 
      R = 3;
  
    }
    else if (opcion == 2){
      //Raíces
      System.out.println("\nAhora que sabemos potencias podemos avanzar a raíces.");
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

    }
    else if (opcion == 3){
      //Potencias y raíces
      System.out.println("\nSi estás aquí es porque quieres un reto. ¡Muy bien!");
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

    }
    else if(opcion == 4){
      System.out.println("Regresando al menu principal.\n");

    } else{
      System.out.print("Número no válido. Por favor ingrese un número entre 1 y 3.");
    }
    return R;
  } 
  //Nivel 4 de matemática.
  public int Nivel4(int opcion){
    //ACTIVIDADES DE ÁLGEBRA
    if (opcion == 1){
      System.out.println("Ya que hemos visto las bases de aritmetica, ¡Empezemos a ver álgebra!");
      System.out.println("El álgebra es donde se empieza la apliación de la aritmetica al mundo real.");
      System.out.println("Tratemos de resolver un problema así.");
      System.out.println("Digamos que tengo 2 globos y me regalan más globos mis amigos. Al final del día, me tengo 10 globos. ¿Cuantos globos me dieron?");
      System.out.println("Pensemos este problema. Sabemos que nos teniamos dos globos al principio, y que tenemos 10 al final. Solo hay que saber cuantos nos dieron");
      System.out.println("Podemos hacer una ecuació para poder determinar eso.\n2 + x = 10");
      System.out.println("En el algebra, hay que resolver por el valor desconocido en este caso la x");
      System.out.println("Se puede despejar la x al restar 2 en ambos lados. Así, que si resta 2 del 10, me duedan 8. Así que me dieron 8 globos en total.\n");
      System.out.println("Tratemos otro. Digamos que tenemos una cierta cantidad de manzanas, y tuve que darle 3 a mis amigos, y ahora me quedan 4 manzanas. ¿Cuantas me quedan ahora?");
      System.out.println("En esta caso, seria x - 3 = 4. Sería hay que sumar 3 en ambor lados para despejar a la x. Al sumar 4 + 3 da 7. Así que teniamos 7 manzanas.");
      System.out.println("Okay! Ya con todo esto hagamos un ejercicio");
      System.out.println("Ejercicio: x + 5 = 6");
      System.out.println("1. 11\n2. 1\n3. 7\n4. 5");
      R = 2;
    }
  
  else if(opcion == 2){
    System.out.println("Ahora sabemos el algebra con la suma y la resta. Ahora con la multiplicación y división.");
    System.out.println("Tratemos una pregunta en forma de ecuación. Tratemos de resolver 2 * x = 8");
    System.out.println("Si quisieramos despejar a la x, habría que dividir dos en ambos lados. Recordar: Cualquier numero divido entre si miso da 1, y eso por cualquier numero de ese numero.");
    System.out.println("Entonces sería 2*x/2 = 8/2, y se simplifica a x = 4. Entonces la respuesta sería 4!");
    System.out.println("Ahora tratemos esto, x/3 = 2.\n Como hemos visto, sabemos que habria que multiplicar para cancelar la multiplicación. Para esto hay que multiplicar 3 para ambos lados.");
    System.out.println("Habria que multiplicar 3 en ambos lados. En esto, sería x/3 * 3 = 2 * 3. Al simplificar esto equivale a x = 6.");
    System.out.println("Ahora que entedemos, hagamos un ejercicio.");
    System.out.println("Ejercicio: 4x = 16");
    System.out.println("1. 1\n2. 2\n3. 3\n4. 4");
    R = 4;
    }
  else if(opcion == 3){
    System.out.print("Ahora sabemos las bases del algebra! Tratemos de usar todas las operaciones en un problema!");
    System.out.println("Tratemos de resolver 2x + 1 = 7");
    System.out.println("Primero hay que restar de 7, 1. Así, se da 6. Y esto da 2x = 6.");
    System.out.println("Ahora asi, ya se puede dividir de forma normal. Al dividir 2 en ambos lados, y al dividir 6 entre 2 equivales a 3.");
    System.out.println("Bueno, tratemos con otras operaciones: x/3 - 2 = 2");
    System.out.println("Ahora con esto, primero hay que sumar 2 en ambos lados. Sumar 2 +2 equivale a 4. Y después de multiplicarlo por 3 equivale a 12. Así que la respuesta es 12!");
    System.out.println("Ahora que ya entendemos, tratemos un problema.");
    System.out.println("4x - 11 = 1");
    System.out.println("1. 3\n2. 9\n3. 6\n4. 5");
    R = 1;
    }
  else if(opcion == 4){
    System.out.println("Regresando al menu principal");
  }else{
    System.out.println("Ingrese un valor válido entre 1 y 4.");
  }
  return R;
  }
  //Nivel  de matemática 5
  public int Nivel5(int opcion){
    if (opcion == 1){
      //Polinomios
      System.out.println("\nAhora que ya conoces las bases de la algebra. Vamos aprender que es un polinomio.");
      System.out.println("Un polinomio es una combinación de varios elementos alegebraicos separados por + o -.");
      System.out.println("De la siguiente manera: 6x² + 4x - 6");
      System.out.println("Este es un polinomio de tres términos. O trinomio.");
      System.out.println("Cada se término se cuenta como una variable o constante. Separada por + o -.");
      System.out.println("Otro ejemplo sería: 4x + 6.");
      System.out.println("Este es un binomio.");
      System.out.println("Ente los polinomios también existen operaciones de suma y de resta.");
      System.out.println("Por ejemplo.");
      System.out.println(" 5x³ + 3x² + 4x + (5x² + 3x + 4)");
      System.out.println("En este caso lo que tiene que suceder es que los términos de igual grado se suman o resta con los que se encuentran dentro del paréntesis.");
      System.out.println("Entonces los que tiene x² se suman entre sí y los que tiene x también.");
      System.out.println("De la siguiente manera: 5x³ + 3x² + 5x² + 4x + 3x +4.");
      System.out.println("Esto quedaría como resultado: 5x³ + 8x² + 7x + 4");
      System.out.println("");
      System.out.println("Con la resta es igual. La única diferencia es que lo que esta dentro del paréntesis cambia de signo.");
      System.out.println("Ejemplo: 4x² + 5x - (2x) = 4x² + 3x.");
      System.out.println("Analiza con cuidado lo que se esta haciendo. Miremos otros ejemplos: ");
      System.out.println("4x - 6x + 7x = 5x");
      System.out.println("3x² + 4x - x² + 5x + 1 = 2x² + 9x + 1.");
      System.out.println("6x + 36 - (6x²) = -6x² + 6x + 36");
      System.out.println("");
      System.out.println("¿Listo? Vamos a hacer un ejercio.");
      System.out.println("Ejercicio: 10x³ + 6x² + 3x - (5x³ + 3x² + x)");
      System.out.println("1. 5x³ + 3x² + x");
      System.out.println("2. 5x³ + 3x² + 2x");
      System.out.println("3. 15x³ + 9x² + 4x");
      System.out.println("4. 5x³ + 9x² + 4x");

	    //Respuesta 
      R = 2;
  
    }
    else if (opcion == 2){
      //Factor común
      System.out.println("\n¡Felicidades por haber llegado a este punto! Ahora veremos el tema de la factorización.");
      System.out.println("Puede ser complicado, así que presta atención a los que veremos.");
      System.out.println("Ya conoces que es un polimomio.");
      System.out.println("Así: 6x² + 4x + 8");
      System.out.println("Te daras cuenta que todos los elementos se pueden dividir dentro de 2.");
      System.out.println("Así que se puede sacar el 2 hacia afuera.");
      System.out.println("De esta manera: 2 (3x² + 2x + 4).");
      System.out.println("Lo mismo se puede hacer con variables. ");
      System.out.println("De la siguiente manera:");
      System.out.println(" 5x³ + 3x² + 4x --> x(5x² + 3x + 4)");
      System.out.println("Entonces tanto los números o variables se pueden sacar hacia afuera del paréntesis.");
      System.out.println("A esto se le conoce como factor común.");
      System.out.println("Es importante que TODOS los elementos compartan el valor que vas a sacar del paréntesis.");
      System.out.println("Veamos otros ejemplos de esto:");
      System.out.println("4x² + 2x  -->  2x(2x + 1)");
      System.out.println("10x³ - 3x² + x  -->  x(10x² - 3x +1)");
      System.out.println("-3x + 6  -->  -3(x - 2)");
      System.out.println("");
      System.out.println("Ahora probaremos con un ejercicio.");
      System.out.println("");
      System.out.println("Ejercicio: 5x³ - 10x² + 25");
      System.out.println("1. -5(-x³ + 2x² - 5)");
      System.out.println("2. -5x(-x² + 2x - 5)");
      System.out.println("3. 5x(x - 2x + 5)");
      System.out.println("4. 5(x³ - 2x² + 5");

	    //Respuesta 
      R = 4;

    }
    else if (opcion == 3){
      //Potencias y raíces
      System.out.println("\nAhora vamos a ver un último tema de polinomios.");
      System.out.println("Esta es la multiplicación de polinomios. Vamos a multiplicar dos binomios.");
      System.out.println("Es un proceso algo complicado. Así que presta atención. ");
      System.out.println("(5x + 6)(2x + 1)");
      System.out.println("Vemos que el polinomio de la derecha tiene dos términos. Vamos a multiplicar el primer término del paréntesis a la izquierda por los términos dentro del paréntesis de la derecha. ");
      System.out.println("Nos queda así: 10x² + 5x.");
      System.out.println("Luego hacemos el mismo proceso con el segundo término. Eso lo sumamos a lo anterior.");
      System.out.println("Nos quedaría así: ");
      System.out.println("10x² + 5x + 12x + 6 = 10x² + 17x + 6");
      System.out.println("Entoces nuestra respuesta es: 10x² + 17x + 6");
      System.out.println("Un ejemplo más: ");
      System.out.println("(2x + 1)(3x - 1)");
      System.out.println(" 6x² - 2x + 3x - 1 = 6x² + x - 1 ");
      System.out.println("");
      System.out.println("Okay. Ahora haremos un repaso de los temas vistos anteriormente.");
      System.out.println("");
      System.out.println("Selecciona la opción con las dos respuestas correctas.");
      System.out.println("1. (5x + 6)(3x + 2)");
      System.out.println("2. 4x² + 12x + 6x ");
      System.out.println("");
      System.out.println("Respuestas:");
      System.out.println("1. 15x² + 28x + 12  Y  2x(2x + 9)");
      System.out.println("2. 15x² + 28x + 12  Y  2x(2x + 6x + 3)");
      System.out.println("3. 15x² + 10x + 18x + 12  Y  2x(2x + 6x + 3)");
      System.out.println("4. 15x² + 10x + 18x + 12  Y  2x(2x + 9)");

      //Respuesta
      R =1;

    }
    else if(opcion == 4){
      System.out.println("Regresando al menu principal.\n");

    } else{
      System.out.print("Número no válido. Por favor ingrese un número entre 1 y 3.");
    }
    return R;
  }
} 
 