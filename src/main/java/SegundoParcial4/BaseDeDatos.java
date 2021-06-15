package SegundoParcial4;

import java.util.LinkedList;
import java.util.List;

public class BaseDeDatos {
	private IOrdenamiento ordenamiento;
	private List<Usuario> usuarios = new LinkedList<Usuario>();

	public IOrdenamiento getOrdenamiento() {
		return ordenamiento;
	}

	public void setOrdenamiento(IOrdenamiento ordenamiento) {
		this.ordenamiento = ordenamiento;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void ordenar() {
		ordenamiento.ordenar(usuarios);
	}

}
