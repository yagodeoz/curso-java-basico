package com.taller.curso04;

//POJO
//Plain old java object

public class CompetidorRunnable  implements Runnable {
	
	private String nombre;
	private String codigo;
	
	public CompetidorRunnable(String nombre, String codigo) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void run() {
		
		for (int i = 0; i < 1000; i++){
			
			System.out.println("Competidor Runnable " + nombre + ", codigo :" + codigo);
			
		}
		
	}
	
	
	
	

}
