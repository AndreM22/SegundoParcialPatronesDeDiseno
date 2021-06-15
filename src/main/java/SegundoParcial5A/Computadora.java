package SegundoParcial5A;

public class Computadora {

	private String[] programasAbiertos = new String[20];
	
	private int memoriaRam;
	private int ConsumoCPU;
	private IEstadoComputadora estado;

	public IEstadoComputadora getEstado() {
		return estado;
	}

	public void setEstado(IEstadoComputadora state) {
		this.estado = state;
	}

	public void request() {
		this.estado.objetoComputadora(this);
	}

	public String[] getProgramasAbiertos() {
		return programasAbiertos;
	}

	public void setProgramasAbiertos(String[] programasAbiertos) {
		this.programasAbiertos = programasAbiertos;
	}

	public int getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public int getConsumoCPU() {
		return ConsumoCPU;
	}

	public void setConsumoCPU(int consumoCPU) {
		ConsumoCPU = consumoCPU;
	}

	
}
