package SegundoParcial1A;

public class Documento {

	private String titulo;
	private String contenido;

	public Documento(String titulo, String contenido) {
		super();
		this.titulo = titulo;
		this.contenido = contenido;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public void mostrarInfo() {
		System.out.println("Titulo: " + titulo);
		System.out.println("Contenido:");
		System.out.println(contenido);
	}
}
