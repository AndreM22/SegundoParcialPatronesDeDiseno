package SegundoParcial4;

import java.util.LinkedList;
import java.util.List;

public class PorCi implements IOrdenamiento {

	@Override
	public void ordenar(List<Usuario> usuarios) {
		System.out.println("*********************************************************");
		System.out.println("Ordenando por ci: ");
		List<Usuario> ordenado = new LinkedList<Usuario>();
		int menor = Integer.MAX_VALUE;
		while (ordenado.size() != usuarios.size()) {
			menor = Integer.MAX_VALUE;
			Usuario uMenor = null;
			for (Usuario usuario : usuarios) {
				if (usuario.getCi() < menor && !ordenado.contains(usuario)) {
					menor = usuario.getCi();
					uMenor = usuario;
				}
			}
			ordenado.add(uMenor);
		}
		for (Usuario usuario : ordenado) {
			System.out.println("**********");
			usuario.mostrarInfo();
		}
	}

}
