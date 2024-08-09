package controller;

public class FatorialController {

	public FatorialController() {
		super();
	}
	
	public int calculaFatorial(int n) {
		// Condição de Parada
		if(n == 0) {
			return 1;
		} else {
			return n * calculaFatorial(n - 1); // Chamada da função
		}
	}

}
