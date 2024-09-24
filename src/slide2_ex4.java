
public class slide2_ex4 {

	//Class Aula
	public static class Aula {
		
	//Metodo elevado	
		public double elevado (double a, double b) {
			double elevado = Math.pow(a, b); //metodo math.pow para elevar o valor 
			System.out.println("O valor elevado é "+elevado);
			return elevado;
		}
	}
	
	public static void main(String[] args) {
	
	//Instanciando a class Aula	
		Aula aula = new Aula();
		
	//Chamndo o metodo e agregando valor 
		aula.elevado(46, 3);
	}

}
