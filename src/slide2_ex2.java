
public class slide2_ex2 {

	//Class Aula
	public static class Aula{
		
	//Metodo soma	
		public double soma (double a, double b, double c) {
			double soma = (a + b + c)/3; //Soma os tres numeros e divide por 3 
			System.out.printf("A media aritimetica é: "+soma);
			return soma;
		}
	}
	public static void main(String[] args) {
		
	//Instanciando a class Aula
		Aula aula = new Aula();
	
	//Chamando o metodo e adicionando o valor	
		aula.soma(6, 6, 7);

	}

}
