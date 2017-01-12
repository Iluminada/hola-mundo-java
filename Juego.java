package adivina;

public class Juego {
	
	int aleatorio;
	int nivel;
	int puntos;
	
	public class GeneraAleatorio {
		int numero;
		public int delintervalo(int min , int max){
			numero = (int) Math.round((Math.random()*(max - 1 ))+min);
			return numero ;
		}
	
	

}
