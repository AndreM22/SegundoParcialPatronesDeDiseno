package SegundoParcial2A;

public class Cliente {

	public static void main(String[] args) {
		ChatEducativo chat = new ChatEducativo();
		
		Estudiante e1 = new Estudiante("Andre", 1, chat);
		Estudiante e2 = new Estudiante("Diego", 2, chat);
		
		Docente d1 = new Docente(111, "Erwin", chat);
		Docente d2 = new Docente(111, "Alexis", chat);

		Administrativo a1 =  new Administrativo("Director", "Ramiro", chat);
		Administrativo a2 =  new Administrativo("Psicologo", "Raul", chat);

		chat.addPersonasAlChat(e1);
		chat.addPersonasAlChat(e2);
		chat.addPersonasAlChat(d1);
		chat.addPersonasAlChat(d2);
		chat.addPersonasAlChat(a1);
		chat.addPersonasAlChat(a2);
		
		e1.enviarMensajeATodos("De estudiante para todos");
		e1.enviarMensajeADocentes("De estudiante para docentes");
		e1.enviarMensajeAAdministrativos("De estudiante para administrativos");
		
		d1.enviarMensajeAEstudiantes("De docente para estudiantes");
		d1.enviarMensajeADocentes("De docente para docentes");
		
		a1.enviarMensajeATodos("De administrativo para todos");

	}

}
