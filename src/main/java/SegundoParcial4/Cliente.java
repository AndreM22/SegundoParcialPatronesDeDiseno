package SegundoParcial4;

import java.util.LinkedList;
import java.util.List;

public class Cliente {
	
	public static void main(String[] args) {
		
		BaseDeDatos bd = new BaseDeDatos();

		PorCi porCi = new PorCi();
		PorNombre porNombre = new PorNombre();
		PorProfesion porProfesion = new PorProfesion();
		Usuario u1 = new Usuario(11111, "bbbbb", new Fecha(02, 02, 2000), "Carpintero");
		Usuario u2 = new Usuario(22222, "ccccc", new Fecha(04, 04, 2004), "Granjero");
		Usuario u3 = new Usuario(33333, "aaaaa", new Fecha(12, 12, 1999), "Estilisa");
		Usuario u4 = new Usuario(44444, "eeeee", new Fecha(03, 03, 2003), "Policia");
		Usuario u5 = new Usuario(55555, "ddddd", new Fecha(05, 05, 2005), "Astronauta");

		List<Usuario> usuarios = new LinkedList<Usuario>();

		usuarios.add(u1);
		usuarios.add(u2);
		usuarios.add(u3);
		usuarios.add(u4);
		usuarios.add(u5);

		bd.setUsuarios(usuarios);

		bd.setOrdenamiento(porCi);
		bd.ordenar();

		bd.setOrdenamiento(porNombre);
		bd.ordenar();

		bd.setOrdenamiento(porProfesion);
		bd.ordenar();
	}
}
