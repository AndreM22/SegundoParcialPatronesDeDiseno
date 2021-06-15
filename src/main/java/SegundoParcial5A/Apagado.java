package SegundoParcial5A;

public class Apagado implements IEstadoComputadora {

	public Apagado() {

	}

	@Override
	public void handler(Computadora computadora) {
		System.out.println("**********************************");
		System.out.println("** Estado: Apagado **");
		computadora.setConsumoCPU(0);
		computadora.setMemoriaRam(0);
		computadora.setProgramasAbiertos(new String[20]);

		System.out.println("Memoria RAM: " + computadora.getMemoriaRam() + "%");
		System.out.println("Consumo CPU: " + computadora.getConsumoCPU() + "%");
		System.out.println("La lista de programass abiertos está vacia");
	}
}
