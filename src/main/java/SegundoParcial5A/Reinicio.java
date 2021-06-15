package SegundoParcial5A;

public class Reinicio implements IEstadoComputadora {

	@Override
	public void objetoComputadora(Computadora computadora) {
		
		System.out.println("**********************************");
		System.out.println("** Estado: Se está reiniciando **");
		System.out.println("Memoria RAM antes del reinicio: " + computadora.getMemoriaRam() + "%");
		System.out.println("Consumo CPU: antes del reinicio: " + computadora.getConsumoCPU() + "%");
		int antes = computadora.getMemoriaRam();
		System.out.println("Cerrando programas: ");
		for (int i = antes; i > 0; i -= 5) {
			computadora.setConsumoCPU(computadora.getMemoriaRam() - 5);
			computadora.setMemoriaRam(computadora.getConsumoCPU() - 5);
			System.out.println("RAM: " + i + "%");
			System.out.println("CPU: " + i + "%");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		computadora.setConsumoCPU(0);
		computadora.setMemoriaRam(0);
		computadora.setProgramasAbiertos(new String[20]);
		System.out.println("Memoria RAM despues del reinicio: " + computadora.getMemoriaRam() + "%");
		System.out.println("Consumo CPU despuese del reinicio: " + computadora.getConsumoCPU() + "%");

		System.out.println("La lista de programass se ha cerrado");
	}
}
