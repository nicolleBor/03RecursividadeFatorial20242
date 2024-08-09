package view;

import controller.FatorialController;

public class Principal {

	public static void main(String[] args) {
		FatorialController fat = new FatorialController();
		int n = 10;
		int resultado = fat.calculaFatorial(n);
		System.out.println(resultado);
	}

}
