
import java.util.ArrayList;



class Almacenamiento{

 ArrayList<String> pipols =  new ArrayList<String>(1);
 
 ArrayList<String> passw = new ArrayList<String> (1);

 ArrayList<String> email = new ArrayList<String> (1);

 ArrayList<Integer> eda = new ArrayList<Integer> (1);

 ArrayList<String> nombres = new ArrayList<String> (1);

 ArrayList<String> apellidos = new ArrayList<String> (1);



  public Almacenamiento(){

  String usuario = "user";
  String pass = "pass";
  String emails = "correo";
  int edaes = 0;
  String nombres = "names";
  String apellidos = "last";
  String noname = "wot";
  
  }
  

  
  public void agreap(String last){
    apellidos.add(last);
  }

  public void agrenom(String names){
    nombres.add(names);
  }

  public void agregar(String usuario){
    pipols.add(usuario);
  }

  public void agregue(String pass){
    passw.add(pass);
  }

  public void agrema(String emails){
    email.add(emails);
  }

  public void agreda(int edaes){
    eda.add(edaes);
  }

  

}




  //          (.)            (.)
 //           |
//            |     / \         
//            |     - -
//                  ___
//                 /   \
 //                \___/
                