package SegundoParcial2A;

public class Mensaje {

	private boolean paraEstudiantes;
	private boolean paraDocentes;
	private boolean paraAdministrativos;
	private String contenido;

	public Mensaje(boolean paraEstudiantes, boolean paraDocentes, boolean paraAdministrativos, String contenido) {
		this.paraEstudiantes = paraEstudiantes;
		this.paraDocentes = paraDocentes;
		this.paraAdministrativos = paraAdministrativos;
		this.contenido = contenido;
	}

	public boolean isParaEstudiantes() {
		return paraEstudiantes;
	}

	public void setParaEstudiantes(boolean paraEstudiantes) {
		this.paraEstudiantes = paraEstudiantes;
	}

	public boolean isParaDocentes() {
		return paraDocentes;
	}

	public void setParaDocentes(boolean paraDocentes) {
		this.paraDocentes = paraDocentes;
	}

	public boolean isParaAdministrativos() {
		return paraAdministrativos;
	}

	public void setParaAdministrativos(boolean paraAdministrativos) {
		this.paraAdministrativos = paraAdministrativos;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

}
