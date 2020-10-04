/******************************************************************
escaner.java
Autores: Stefano Aragoni, Rebecca Smith, Roberto Vallecillos, Cayetano molina, Daniel Cabrera, Diego Ruiz
Última modificación: 2020-09-11

******************************************************************/
import java.util.Scanner;

class escaner{

  Scanner scan = new Scanner(System.in);

  escaner(){

  }

  public int nextInt(){
    int opcion = scan.nextInt();
    return opcion;
  }

  public String next(){
    String opcion = scan.next();
    return opcion;
  }

}