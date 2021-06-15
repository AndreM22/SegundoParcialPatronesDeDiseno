package SegundoParcial5A;

public class Client {
	public static void main(String[] args) {
		
		IEstadoComputadora state = new Apagado();
		Computadora computadora = new Computadora();
		computadora.setEstado(state);
		computadora.request();

		state = new Prendido();
		computadora.setEstado(state);
		computadora.request();

		state = new Reinicio();
		computadora.setEstado(state);
		computadora.request();

	}
}
