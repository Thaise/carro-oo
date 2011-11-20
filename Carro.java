package br.com.xti.poo;

public class Carro {
	
	String modelo;
	int velocidadeMaxima;
	double segundosZeroACem;
	Motor motor;
	//construtores - servem para inicializar objetos(vari�veis do objeto)
	public Carro(){
	/*construtor vazio, n�o precisa ser criado,
	 *  na classe CarroTeste, quando, criamos um obejeto
	 *  j� estamos utilizando o construtor, que � automaticamente criado
	 *  quando criamos uma classe 		
	 */	
	}
	
	public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem){
			this(modelo, velocidadeMaxima, segundosZeroACem, null);
	//acima inicializo um construtor utilizando o de baixo, que est� mais completo
	}
	
	public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem, Motor motor){
		// construtor com par�metros, veremos sua vantagem na classe CarroTeste
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem =segundosZeroACem;
		this.motor = motor;
	}

}
