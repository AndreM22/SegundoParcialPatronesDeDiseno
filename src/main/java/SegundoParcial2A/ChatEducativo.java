package SegundoParcial2A;

import java.util.ArrayList;
import java.util.List;


public class ChatEducativo implements ICanalDeComunicacion {

    private List<Persona> personasChat= new ArrayList<>();

    public void addPersonasAlChat(Persona persona){
        personasChat.add(persona);
    }
    @Override
    public void send(Mensaje mensaje, Persona persona) {
    	for (Persona p : personasChat) {
			if(p!= persona) {
				if(p instanceof Estudiante && mensaje.isParaEstudiantes()) {
					p.recibirMensaje(mensaje.getContenido());
				}
				if(p instanceof Docente && mensaje.isParaDocentes()) {
					p.recibirMensaje(mensaje.getContenido());
				}
				if(p instanceof Administrativo && mensaje.isParaAdministrativos()) {
					p.recibirMensaje(mensaje.getContenido());
				}
			}
		}
    	
    }


}