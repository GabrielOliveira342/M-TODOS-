
public class slide2_ex6 {

	//class aula
	public static class Aula {
	
	//metodo numero 	
		public int numero (int a) {
			
			int fatorial = 1;
			for(int i=1; i<=a; i++) { //for para calcular o fatorial
			fatorial *= i;
			}
			System.out.println("O fatorial de "+a+" é "+fatorial);
			return fatorial;
		
		}
		
	}
	public static void main(String[] args) {
		
	//Instanciando a class Aula	
		Aula aula = new Aula();
	
	//Chamando o metodo e agregando valor 	
		aula.numero(7);
	}

}
