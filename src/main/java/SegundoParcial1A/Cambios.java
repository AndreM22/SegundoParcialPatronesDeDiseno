package SegundoParcial1A;

import java.util.ArrayList;
import java.util.List;

public class Cambios {
	
	private List<EstadoDocumento> cambiosGuardado = new ArrayList<>();
	private List<EstadoDocumento> cambiosDeshechos = new ArrayList<>();

	public void guardar(EstadoDocumento estado) {
		cambiosGuardado.add(0, estado);
	}

	public EstadoDocumento getRevertir() {
		System.out.println("**********");
		System.out.println("Revirtiendo");
		cambiosDeshechos.add(cambiosGuardado.get(0));
		cambiosGuardado.remove(0);
		return cambiosGuardado.get(0);
	}

	public EstadoDocumento getDeshacer() {
		System.out.println("**********");
		System.out.println("Deshaciendo");
		return cambiosDeshechos.remove(cambiosDeshechos.size()-1);
	}

}
