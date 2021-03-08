package controller;

public class ThreadVetor extends Thread
{
	
	/*
	 * Criar em java um projeto com uma Thread chamada ThreadVetor, que receba um valor numérico e
	 * vetor como parâmetros. Caso o valor numérico seja par, a thread deve percorrer o vetor
	 * utilizando uma estrutura for (int i = 0 ; i < vet.length; i++) e contar o tempo para
	 * percorrer o vetor. Caso o valor numérico seja ímpar, a thread deve percorrer o vetor
	 * utilizando uma estrutura foreach e contar o tempo para percorrer o vetor. No final,
	 * ambas as possibilidades devem apresentar o tempo em segundos.
	 * 
	 * A operação main deve gerar um vetor de 1000 posições com valores aleatórios de 1 a 100.
	 * Deve iniciar 2 ThreadVetor e para uma passar o número 1 e o vetor e para a outra, passar
	 * o número 2 e o mesmo vetor.
	 */
	
	/*
	 * recebe vetor e int ok
	 * "dentro do run" fazer a verificação
	 */
	private int x;
	private int vet [] = new int [1000];
	
	public ThreadVetor(int x, int vet [])
	{
		this.x = x;
		this.vet = vet;
	}
	
	@Override
	public void run()
	{
		contador();
	}
	
	public boolean ePar(int x)
	{
		if (x % 2 == 0) {			
			return true;
		}
		return false;
	}
	
	public void contador()
	{
		double tempoInicial, tempoFinal, total;
		String tipo;
		
		tempoInicial = System.nanoTime();
		
		if (ePar(x))
		{
			tipo = "for";
			for (int i = 0 ; i < vet.length; i++)
			{}
		}
		else
		{
			tipo = "foreach";
			for (int j : vet)
			{
				j = j + 0;
			}
		}
		
		tempoFinal = System.nanoTime();
		
		total = tempoFinal - tempoInicial;
		total = total / Math.pow(10, 9);
		
		System.out.println("TID #"+ getId() +" --> tipo usado: " + tipo + ", tempo total: " + total + "s.");
	}
	
}
