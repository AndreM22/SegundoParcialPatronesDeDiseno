package SegundoParcial5A;

import java.util.Random;

public class Prendido implements IEstadoComputadora {
	
	private int programas;

	@Override
	public void objetoComputadora(Computadora computadora) {
		System.out.println("**********************************");

		System.out.println("** Estado: Prendido **");
		computadora.setProgramasAbiertos(abrirProgramas());
		computadora.setConsumoCPU(computadora.getProgramasAbiertos().length*5);
		computadora.setMemoriaRam(computadora.getProgramasAbiertos().length*5);
		System.out.println("Memoria RAM: " + (computadora.getMemoriaRam() ) + "%");
		System.out.println("Consumo CPU: " + (computadora.getConsumoCPU() ) + "%");
		System.out.println("Lista de programas abiertos:");
		for (int i = 0; i < computadora.getProgramasAbiertos().length; i++) {
			System.out.println("	"+computadora.getProgramasAbiertos()[i]);
		}
	}

	public String[] abrirProgramas() {
		Random rd = new Random();

		programas = rd.nextInt(20) + 1;
		String[] p = new String[programas];
		for (int i = 0; i < programas; i++) {
			p[i] = "Programa " + (i + 1);
		}
		return p;
	}
}
