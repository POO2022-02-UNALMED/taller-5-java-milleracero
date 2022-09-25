package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {

	private static ArrayList<Ave> listado = new ArrayList<Ave>();    
	public static int halcones; 
	public static int aguilas;
	private String colorPlumas;

	public Ave() {                                                                                  
		this(null,0,null,null,null);                                                                
	}                                                                                               
	               
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre,edad,habitat,genero);
		this.colorPlumas=colorPlumas;
		listado.add(this);
	}

	public ArrayList<Ave> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public static Animal crearHalcon(String nombre, int edad, String genero) {
		halcones++;
		return new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
	}
	public static Animal crearAguila(String nombre, int edad, String genero) {
		aguilas++;
		return new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
	}
	
	public static int cantidadAves() {
		return listado.size();
	}
	@Override
	public String movimiento() {
		return "volar";
	}
}