
class usuario{
      String nombre;
      String apellido;
      String correo;
      int age = 0;
      String usuario;
      String pass;
      String user;
      int nivel;

  public usuario(String nombre, String apellido, String correo, int age, String usuario, String pass, int nivel){
    this.nombre = nombre;
    this.apellido = apellido;
    this.correo = correo;
    this.age = age;
    this.usuario = usuario;
    this.pass = pass;
    this.user = user;
    this.nivel = nivel;
  }

  public void nivelUpgrade(int a){
    nivel = a;
  }

  public int getNivel(){
      return nivel;
  }

  public String getContra(){
      return pass;
  }

  public String getNombre(){
    return user;
  }


}