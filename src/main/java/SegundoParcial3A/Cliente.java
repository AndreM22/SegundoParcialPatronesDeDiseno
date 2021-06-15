package SegundoParcial3A;

public class Cliente {

	public static void main(String[] args) {
		PaginaFacebook p = new PaginaFacebook("Abra");

		p.subscribirse(new Usuario(true, "Juan"));
		p.subscribirse(new Usuario(false, "Jose"));
		p.subscribirse(new Usuario(true, "Jacinto"));
		p.subscribirse(new Usuario(false, "Julia"));
		p.subscribirse(new Usuario(true, "Jimena"));

		p.noitificarVideo();
		p.noitificar();
		p.noitificar();
		p.noitificarVideo();
	}

}
