package SegundoParcial4;

import java.util.LinkedList;
import java.util.List;

public class PorProfesion implements IOrdenamiento {

	@Override
	public void ordenar(List<Usuario> usuarios) {
		System.out.println("*********************************************************");
		System.out.println("Ordenando por profesión: ");
		List<Usuario> ordenadoProfesion = new LinkedList<Usuario>();
		for (Usuario usuario : ordenadoProfesion) {
			ordenadoProfesion.add(usuario);
		}
		char menor = 'z';
		while (ordenadoProfesion.size() != usuarios.size()) {
			menor = 'z';
			Usuario uMenor = null;
			for (Usuario usuario : usuarios) {

				if (usuario.getProfesion().charAt(0) < menor && !ordenadoProfesion.contains(usuario)) {
					menor = usuario.getProfesion().charAt(0);
					uMenor = usuario;
				}
			}
			ordenadoProfesion.add(uMenor);
		}

		for (Usuario usuario : ordenadoProfesion) {
			System.out.println("**********");
			usuario.mostrarInfo();
		}
	}

}
