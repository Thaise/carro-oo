package br.com.xti.poo;

public class CarroTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*esse � o modo de inicializar as
		 *cari�veis em um construtor sem par�metros
		 */
		Carro ferrari = new Carro();
		ferrari.modelo = "Ferrari Enzo";
		ferrari.velocidadeMaxima = 349;
		ferrari.segundosZeroACem = 3.2;
		
		Motor v12 = new Motor("v12", 660);
		ferrari.motor = v12;
	
		/*
		 *num construtor com par�metros
		 *podemos inicializar as vari�veis
		 *dentro no espa�o diretamente nos 
		 *par�metros, atribuindo valor � eles
		 */
		Carro koenigsegg = new Carro("koenigsegg CCXR", 430, 3.1);
		
		Motor v8 = new Motor("v8", 1018);
		koenigsegg.motor = v8;
		
		Carro bugatti = new Carro("Bugatti Veyron", 430, 2.2, new Motor("w16", 1200));
		
		System.out.println(bugatti.modelo);
		System.out.println(bugatti.motor.potencia);
		
	}

}
