/******************************************************************

usuario.java
Autores: Stefano Aragoni, Rebecca Smith, Roberto Vallecillos, Cayetano molina, Daniel Cabrera, Diego Ruiz
Última modificación: 2020-09-11

******************************************************************/

//se crea la clase
class usuario{
  //se declaran los atributos
  private String nombre;
  private String apellido;
  private String correo;
  private int age = 0;
  private String usuario;
  private String pass;

  private int nivelLec;
  private int nivelMat;

  //constructor que le asigna valores a varios atributos.
  public usuario(String nombre, String apellido, String correo, int age, String usuario, String pass, int nivelLec, int nivelMat){
    this.nombre = nombre;
    this.apellido = apellido;
    this.correo = correo;
    this.age = age;
    this.usuario = usuario;
    this.pass = pass;
    this.nivelLec = nivelLec;
    this.nivelMat = nivelMat;

  }

  //setter que cambia el nivel de lectura de una persona
  public void nivelUpgradeLec(int a){
    nivelLec = a;
  }

  //setter que cambia el nivel de matemática de una persona
  public void nivelUpgradeMat(int a){
    nivelMat = a;
  }

  //getter que retorna el nivel de lectura
  public int getNivelLec(){
      return nivelLec;
  }

  //getter que retorna el nivel de matemática
  public int getNivelMat(){
      return nivelMat;
  }

  //getter que retorna la contrase;a del usuario
  public String getContra(){

      return pass;
  }
 
  //getter que retorna el nombre de usuario. 
  public String getNombre(){
    return usuario;
  }


}