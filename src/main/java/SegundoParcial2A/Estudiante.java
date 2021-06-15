package SegundoParcial2A;

public class Estudiante extends Persona {
	
	private String nombre;
	private int numeroMatricula;

	public Estudiante(String nombre, int numeroMatricula, ICanalDeComunicacion canalDeComunicacion) {
		super(canalDeComunicacion);
		this.nombre = nombre;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public void enviarMensajeATodos(String mensaje) {
		this.enviar(new Mensaje(true, true, true, mensaje));
	}

	public void enviarMensajeADocentes(String mensaje) {
		this.enviar(new Mensaje(false, true, false, mensaje));
	}

	public void enviarMensajeAAdministrativos(String mensaje) {
		this.enviar(new Mensaje(false, false, true, mensaje));
	}

	@Override
	protected void enviar(Mensaje mensaje) {
		canalDeComunicacion.send(mensaje, this);

	}

	@Override
	protected void recibirMensaje(String message) {
		System.out.println("El estudiante " + nombre + " ha recibido el mensaje:");
		System.out.println(message);
		System.out.println();
	}

}
