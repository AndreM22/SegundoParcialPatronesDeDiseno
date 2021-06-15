package SegundoParcial3A;

public class Usuario implements IUsuario{
	
	private boolean soloVideos;
	private String nombre;
	
	
	public Usuario(boolean videos, String nombre) {
		super();
		this.soloVideos = videos;
		this.nombre = nombre;
	}


	public boolean isSoloVideos() {
		return soloVideos;
	}


	public void setSoloVideos(boolean videos) {
		this.soloVideos = videos;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public void notificacion(String message) {
		System.out.println(nombre+" ha recibido la notificación: "+message);
		
	}


	@Override
	public boolean soloVideos() {
		return soloVideos;
	}

}
