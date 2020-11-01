/******************************************************************

Verificador.java
Autores: Stefano Aragoni, Rebecca Smith, Roberto Vallecillos, Cayetano molina, Daniel Cabrera, Diego Ruiz
Última modificación: 2020-10-04

******************************************************************/
class Verificador{

public Verificador(){}

public boolean Respuestas(int a, int b) {
  boolean c;
  if (a == b) {
    System.out.println("¡Correcto! Muy bien hecho.\n\n");
    c = true;
  } else {
    System.out.println("Eh. Incorrecto. La respuesta correcta era: " + a + "\n\n");
    c = false;
  }
  return c;
}

public boolean Respuestas2(int a, int b) {
  boolean c;
  if (a == b) {
    System.out.println("¡Correcto! Muy bien hecho.\n\n");
    c = true;
  } else {
    System.out.println("Eh. Incorrecto. La respuesta correcta era la opicón " + a + "\n\n");
    c = false;
  }
  return c;
}



}