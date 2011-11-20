package br.com.xti.poo;

public class CarroTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*esse é o modo de inicializar as
		 *cariáveis em um construtor sem parâmetros
		 */
		Carro ferrari = new Carro();
		ferrari.modelo = "Ferrari Enzo";
		ferrari.velocidadeMaxima = 349;
		ferrari.segundosZeroACem = 3.2;
		
		Motor v12 = new Motor("v12", 660);
		ferrari.motor = v12;
	
		/*
		 *num construtor com parâmetros
		 *podemos inicializar as variáveis
		 *dentro no espaço diretamente nos 
		 *parâmetros, atribuindo valor à eles
		 */
		Carro koenigsegg = new Carro("koenigsegg CCXR", 430, 3.1);
		
		Motor v8 = new Motor("v8", 1018);
		koenigsegg.motor = v8;
		
		Carro bugatti = new Carro("Bugatti Veyron", 430, 2.2, new Motor("w16", 1200));
		
		System.out.println(bugatti.modelo);
		System.out.println(bugatti.motor.potencia);
		
	}

}
