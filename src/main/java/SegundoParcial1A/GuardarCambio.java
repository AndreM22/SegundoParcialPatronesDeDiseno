package SegundoParcial1A;

public class GuardarCambio {
	private Documento estado;

	public void ponerEstado(Documento estado) {
		System.out.println("**** Cambiar estado del documento *****");
		estado.mostrarInfo();
		this.estado = estado;
	}

	public EstadoDocumento crearEstado() {
		System.out.println("**** Guardar estado del documneto *****");
		estado.mostrarInfo();
		return new EstadoDocumento(this.estado);
	}

	public void restoreEstado(EstadoDocumento estadoDocumento) {
		this.estado = estadoDocumento.getEstado();
		System.out.println("**** Volver a estado del documento anterior *****");
		this.estado.mostrarInfo();

	}
	
	

}
