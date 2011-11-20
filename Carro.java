package br.com.xti.poo;

public class Carro {
	
	String modelo;
	int velocidadeMaxima;
	double segundosZeroACem;
	Motor motor;
	//construtores - servem para inicializar objetos(variáveis do objeto)
	public Carro(){
	/*construtor vazio, não precisa ser criado,
	 *  na classe CarroTeste, quando, criamos um obejeto
	 *  já estamos utilizando o construtor, que é automaticamente criado
	 *  quando criamos uma classe 		
	 */	
	}
	
	public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem){
			this(modelo, velocidadeMaxima, segundosZeroACem, null);
	//acima inicializo um construtor utilizando o de baixo, que está mais completo
	}
	
	public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem, Motor motor){
		// construtor com parâmetros, veremos sua vantagem na classe CarroTeste
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem =segundosZeroACem;
		this.motor = motor;
	}

}
