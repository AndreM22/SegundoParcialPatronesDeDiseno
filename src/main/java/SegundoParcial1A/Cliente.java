package SegundoParcial1A;

public class Cliente {
	public static void main(String[] args) {
		
		GuardarCambio guardarCambio = new GuardarCambio();
		Cambios cambios = new Cambios();
		
		Documento d = new Documento("Version 1", "aaaaaa");	
		guardarCambio.ponerEstado(d);
		cambios.guardar(guardarCambio.crearEstado());
		
		d= new Documento("Version 2", "bbbbbb");
		guardarCambio.ponerEstado(d);
		cambios.guardar(guardarCambio.crearEstado());
		
		d= new Documento("Version 3", "cccccc");
		guardarCambio.ponerEstado(d);
		cambios.guardar(guardarCambio.crearEstado());
		
		d= new Documento("Version 4", "dddddd");
		guardarCambio.ponerEstado(d);
		cambios.guardar(guardarCambio.crearEstado());
		
		
		guardarCambio.restoreEstado(cambios.getRevertir());
		guardarCambio.restoreEstado(cambios.getRevertir());
		guardarCambio.restoreEstado(cambios.getRevertir());
		
		guardarCambio.restoreEstado(cambios.getDeshacer());
		guardarCambio.restoreEstado(cambios.getDeshacer());
		guardarCambio.restoreEstado(cambios.getDeshacer());


		
	}
}
