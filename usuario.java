
class usuario{
      String nombre;
      String apellido;
      String correo;
      int age = 0;
      String usuario;
      String pass;
      String user;
      String contra;
      int nivel;

  public usuario(String nombre, String apellido, String correo, int age, String usuario, String pass, String user, String contra){
    this.nombre = nombre;
    this.apellido = apellido;
    this.correo = correo;
    this.age = age;
    this.usuario = usuario;
    this.pass = pass;
    this.user = user;
    this.contra = contra;
    this.nivel = nivel;
    nivel = 0;
  }

  public void nivelUpgrade(int a){
    nivel = a;
  }

  public int getNivel(){
      return nivel;
  }

  public String getContra(){
      return contra;
  }

  public String getNombre(){
    return user;
  }


}