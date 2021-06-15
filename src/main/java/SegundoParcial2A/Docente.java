package SegundoParcial2A;

public class Docente extends Persona {
	private int ci;
	private String nombre;

	public Docente(int ci, String nombre, ICanalDeComunicacion canalDeComunicacion) {
		super(canalDeComunicacion);
		this.ci = ci;
		this.nombre = nombre;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void enviarMensajeADocentes(String mensaje) {
		this.enviar(new Mensaje(false, true, false, mensaje));
	}

	public void enviarMensajeAEstudiantes(String mensaje) {
		this.enviar(new Mensaje(true, false, false, mensaje));
	}

	@Override
	protected void enviar(Mensaje mensaje) {
		canalDeComunicacion.send(mensaje, this);

	}

	@Override
	protected void recibirMensaje(String message) {
		System.out.println("El docente " + nombre + " ha recibido el mensaje:");
		System.out.println(message);
		System.out.println();
	}

}
