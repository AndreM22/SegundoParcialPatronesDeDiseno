package SegundoParcial3A;

public interface IPaginaFacebook {
    void subscribirse(IUsuario subscriptor);
    void desubscribirse(IUsuario subscriptor);
    void noitificarVideo();
    void noitificar(String notificacion);

}
