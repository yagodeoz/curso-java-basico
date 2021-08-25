package com.taller.curso04;

import java.util.Date;

public class Principal {

	public static void main(String[] args) {

		// ****************************************
		// Extendiendo de la clase thread

//		Competidor competidor1 = new Competidor("Hinojosa", "0005");
//		Competidor competidor2 = new Competidor("Briones", "0006");
//		Competidor competidor3 = new Competidor("Kelvincito", "0666");
//		
//		
//		//start
//		
//		System.out.println("Incio de competencia "  + new Date());
//	
//		competidor1.setPriority(1);
//		competidor2.setPriority(10);
//		competidor3.setPriority(5);
//		competidor1.start();
//		competidor2.start();
//		competidor3.start();
//		
//		System.out.println("Fin de la ejecución competencia "  + new Date());

		// ****************************************
		// Implementado la interfaz runnable

//		CompetidorRunnable comp1 = new CompetidorRunnable("JAVA", "0001");
//		CompetidorRunnable comp2 = new CompetidorRunnable("Python", "0002");
//		CompetidorRunnable comp3 = new CompetidorRunnable("Angular", "0003");
//		
//		Thread hilo1 = new Thread(comp1);
//		Thread hilo2 = new Thread(comp2);
//		Thread hilo3 = new Thread(comp3);
//		
//		System.out.println("Incio de competencia "  + new Date());
//		hilo1.start();
//		hilo2.start();
//		hilo3.start();
//		
//		System.out.println("Fin de la ejecución competencia "  + new Date());

		// ****************************************
		// Usando objetos anonimos

//		Thread hilo1 = new Thread( new Runnable() {
//			@Override
//			public void run() {
//				for (int i=0; i < 1000; i++){
//					System.out.println("Competidor: Byron, número: 555");
//				}
//				
//			}
//		});
//		
//		
//		Thread hilo2 = new Thread( new Runnable() {
//			@Override
//			public void run() {
//				for (int i=0; i < 1000; i++){
//					System.out.println("Competidor: Judith, número: 111");
//				}
//				
//			}
//		});
//		
//		Thread hilo3 = new Thread( new Runnable() {
//			@Override
//			public void run() {
//				for (int i=0; i < 1000; i++){
//					System.out.println("Competidor: Nohemi, número: 222");
//				}
//				
//			}
//		});
//		
//		System.out.println("Incio de competencia "  + new Date());
//		
//		hilo1.start();
//		hilo2.start();
//		hilo3.start();
//		
//		
//		System.out.println("Fin de la ejecución competencia "  + new Date());

		Thread hilo1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				System.out.println("Competidor: Nohemi, número: 222");
			}
		});
		
		Thread hilo2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				System.out.println("Competidor: Byron, número: 0000");
			}
		});
		
		Thread hilo3 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				System.out.println("Competidor: Judith, número: 1111");
			}
		});
		
		System.out.println("Incio de competencia "  + new Date());
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		
		
		System.out.println("Fin de la ejecución competencia "  + new Date());
		

	}

	// batch

}
