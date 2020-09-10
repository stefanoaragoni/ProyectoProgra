/******************************************************************
Almacen.java
Autor: Stefano Alberto Aragoni
Última modificación: 2020-08-4

******************************************************************/

import java.util.ArrayList;

class almacen{
  private ArrayList<String> storeList;
	private ArrayList<usuario> store;
	
	public almacen(){
		store = new ArrayList<usuario>();
    storeList = new ArrayList<String>();
	}

  public boolean agregar(String a){
    boolean completado = false;
    if (obtenerUsu(a) == ""){
			storeList.add(a);
			completado = true;
		}
    return completado;
  }

	public String obtenerUsu(String a){
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



	
	public int limpiar(){
		store.clear();
		return store.size();
	}
	
	public int agregar1(usuario a){
		int resultado = -1;
		if (obtener(a) == null){
			store.add(a);
			resultado = store.size();
		}
		return resultado;
	}

	public int quitar(usuario a){
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
	
	public usuario obtener(String nombreNuevo){
		usuario resultado = null;
		usuario temp;
		for (int i = 0; i < store.size(); i++){
			temp = store.get(i);
			if (nombreNuevo == (temp.getNombre())){
				return temp;
			}
		}
		
		return resultado;
	}
	
	
	public int cantidad(){
		return store.size();
	}
}