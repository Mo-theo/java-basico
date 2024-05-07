package edu.theo.smarttv;

public class SmartTV {
	
		boolean ligada = false;
		int canal = 1;
		int volume = 25;
		
		public void ligar() {
			ligada = true;
		}
		
		public void desligar() {
			ligada = false;
		}
		
		public void aumentarVolume() {
			volume++;
			System.out.println("Aumentando o volume para: " + volume);
		}
		
		public void abaixarVolume() {
			volume--;
			System.out.println("Abaixando o volume para: " + volume);
		}
		
		public void aumentarCanal() {
			canal++;
			System.out.println("Aumentando o canal para: " + canal);
		}
		
		public void abaixarCanal() {
			canal--;
			System.out.println("Abaixando o canal para: " + canal);
		}
		
		public void escolherCanal (int novoCanal) {
			canal = novoCanal;
			System.out.println("O novo canal é: " + canal);
		}
}

