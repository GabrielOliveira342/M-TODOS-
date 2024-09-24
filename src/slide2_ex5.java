
public class slide2_ex5 {

	//class Aula
	public static class Aula {
		
	//metodo tempo 	
		public int tempo (int a) {
			
			int mim = a % 60; //calcular o modulo do minuto
			int horas = ( a - mim)/60; //calcular as horas
			System.out.println(horas+" hora e "+mim+" minutos");
			return horas;
		}
	}
	public static void main(String[] args) {
		
	//Instanciando a class Aula
		Aula aula = new Aula();
		
	//Chamando o metodo e agregando valor	
		aula.tempo(90);
		

	}

}
