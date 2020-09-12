/******************************************************************
almacen.java
Autores: Stefano Aragoni, Rebecca Smith, Roberto Vallecillos, Cayetano molina, Daniel Cabrera, Diego Ruiz
Última modificación: 2020-09-11

******************************************************************/

import java.util.ArrayList;

class almacen{
  //Se crean arraylists
  private ArrayList<String> storeList;
	private ArrayList<usuario> store;
	
	public almacen(){//metodo para llamar listas nuevas
		store = new ArrayList<usuario>();
    storeList = new ArrayList<String>();
	}

  public boolean agregar(String a){//se guarda a los usuarios en la lista
    boolean completado = false;

    if (obtenerUsu(a) == ""){

			storeList.add(a);
			completado = true;
		}
    return completado;
  }


	public String obtenerUsu(String a){// se obtiene al usuario

		String resultado = "";
		String temp;
		for (int i = 0; i < storeList.size(); i++){
			temp = storeList.get(i);
			if (a.equals(temp)){
				return temp;
			}
		}
		
		return resultado;
	}
	
	public int agregar1(usuario a){

		int resultado = -1;
		if (obtener(a) == null){
			store.add(a);
			resultado = store.size();
		}
		return resultado;
	}

	public int quitar(usuario a){//borra usuarios de la lista
		usuario temp;
		for (int i = 0; i < store.size(); i++){
			temp = store.get(i);
			if (a.getNombre() == (temp.getNombre())){
				store.remove(i);
				return store.size();
			}
		}
		
		return -1;
	}
	
	public usuario obtener(usuario a){
		usuario resultado = null;
		usuario temp;
		for (int i = 0; i < store.size(); i++){
			temp = store.get(i);
			if (a.getNombre() == (temp.getNombre())){
				return temp;
			}
		}
		
		return resultado;
	}
	//
	public usuario obtener4(String nombreNuevo){
		usuario resultado = null;
		usuario temp;
		for (int i = 0; i < store.size(); i++){
			temp = store.get(0);
			if (nombreNuevo.equals(temp.getNombre())){
				return temp;
			}
		}
		
		return resultado;
	}

}