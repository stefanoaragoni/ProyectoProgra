
class usuario{
      String nombre;
      String apellido;
      String correo;
      int age = 0;
      String usuario;
      String pass;

      int nivelLec;
      int nivelMat;

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

  public void nivelUpgradeLec(int a){
    nivelLec = a;
  }

  public void nivelUpgradeMat(int a){
    nivelMat = a;
  }

  public int getNivelLec(){
      return nivelLec;
  }

  public int getNivelMat(){
      return nivelMat;
  }

  public String getContra(){

      return pass;
  }

  public String getNombre(){
    return usuario;
  }


}