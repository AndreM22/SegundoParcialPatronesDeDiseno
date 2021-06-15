package SegundoParcial3A;

import java.util.ArrayList;
import java.util.List;

public class PaginaFacebook implements IPaginaFacebook {
	
	private String nombre;
	private List<IUsuario> subscriptores = new ArrayList<>();

	public PaginaFacebook(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void subscribirse(IUsuario subscriptor) {
		subscriptores.add(subscriptor);
	}

	@Override
	public void desubscribirse(IUsuario subscriptor) {
		subscriptores.remove(subscriptor);
	}

	@Override
	public void noitificarVideo() {
		for (IUsuario u : subscriptores) {
			u.notificacion(nombre + " ha subido un nuevo video ");
		}
		System.out.println();
	}

	@Override
	public void noitificar(String notificacion) {
		for (IUsuario u : subscriptores) {
			if (!u.soloVideos()) {
				u.notificacion(nombre + " notifica: " + notificacion);
			}
		}
		System.out.println();
	}
}
