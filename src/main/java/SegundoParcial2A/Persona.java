package SegundoParcial2A;

public abstract class Persona {
	
    protected ICanalDeComunicacion canalDeComunicacion;

    public Persona(ICanalDeComunicacion canalDeComunicacion){
        this.canalDeComunicacion =canalDeComunicacion;
    }

    protected abstract void enviar(Mensaje mensaje);
    protected abstract void recibirMensaje(String message);
}
