
public class slide2_ex1 {

	//class Aula
	public static class Aula {
		
	//Metodo numero, com um if e alse
		public int numero (int a) {
			int numero = a;
			if(numero >=0) { // if para o positivo 
				System.out.println(numero+" é positivo");
			}
			else {          // else para o negativo 
				System.out.println(numero+" é negativo");
			}
		return numero;
		}
	}
	public static void main(String[] args) {
		
		//Instanciando a class Aula
		Aula aula = new Aula();
		
		//Chamando o metodo e agregando o valor
		aula.numero(-9);
	}

}
