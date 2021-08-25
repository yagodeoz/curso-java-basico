package com.taller.curso04;

import java.util.Date;

public class Principal {
	
	
	public static void main(String[] args) {
		
		Competidor competidor1 = new Competidor("Hinojosa", "0005");
		Competidor competidor2 = new Competidor("Briones", "0006");
		Competidor competidor3 = new Competidor("Kelvincito", "0666");
		
		
		//start
		
		System.out.println("Incio de competencia "  + new Date());
	
		competidor1.setPriority(1);
		competidor2.setPriority(10);
		competidor3.setPriority(5);
		competidor1.start();
		competidor2.start();
		competidor3.start();
		
		System.out.println("Fin de la ejecución competencia "  + new Date());
		
	}

}
