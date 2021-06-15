package SegundoParcial4;

public class Usuario {

	private int ci;
	private String nombre;
	private Fecha fechaNacimiento;
	private String profesion;

	public Usuario(int ci, String nombre, Fecha fechaNacimiento, String profesion) {
		super();
		this.ci = ci;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.profesion = profesion;
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

	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public void mostrarInfo() {
		System.out.println("CI: " + ci);
		System.out.println("Nombre: " + nombre);
		fechaNacimiento.showInfo();
		System.out.println("Profesion: " + profesion);

	}
}
