package edu.theo.smarttv;

public class Usuario {

	public static void main(String[] args) {

		SmartTV smartTv = new SmartTV();
		
		System.out.println("TV ligada? " + smartTv.ligada);
		System.out.println("Canal atual? " + smartTv.canal);
		System.out.println("Volume atual? " + smartTv.volume);
		
		
		smartTv.ligar ();
		System.out.println("\nNovo status -> TV ligada? " + smartTv.ligada + "\n");
		
		smartTv.abaixarVolume();
		smartTv.abaixarVolume();
		smartTv.abaixarVolume();
		System.out.println("Novo status -> Volume atual? " + smartTv.volume + "\n");
		
		smartTv.aumentarCanal();
		smartTv.aumentarCanal();
		smartTv.abaixarCanal();
		
		smartTv.escolherCanal(20);
		
		System.out.println("Novo status -> Canal atual? " + smartTv.canal + "\n");
		}
		
}