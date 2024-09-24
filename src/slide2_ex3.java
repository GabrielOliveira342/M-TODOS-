
public class slide2_ex3 {

	//Class Aula
	public static class Aula {
		
	//Metodo numero, com if para indentficar o maior	
		public int numero (int a, int b, int c) {
			int numero = 0;
			
			if((a > b) && (a > c)){
				System.out.println(a+" é o maior");	
			}
			if((b > c) && (b > a)) {
				System.out.println(b+" é o maior");
			}
			if((c > a) && (c > b)) {
				System.out.println(c+" é o maior");
			}
			return numero;
		}
		
	}
	public static void main(String[] args) {
	
		//Instanciando a class Aula
		Aula aula = new Aula();
		
		//Chamando o metodo e agregando os valores 
		aula.numero(6, 10, 9);

	}

}
