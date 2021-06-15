package SegundoParcial5A;

public class TarjetaVideo {
       private int porcentajeDeUso=0;
       private String action;

       public TarjetaVideo(int percentageUse, String action){
           this.porcentajeDeUso=percentageUse;
           this.action=action;
       }

    public int getPorcentajeDeUso() {
        return porcentajeDeUso;
    }

    public void setPorcentajeDeUso(int percentageUse) {
        this.porcentajeDeUso = percentageUse;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
