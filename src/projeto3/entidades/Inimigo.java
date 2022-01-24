package projeto3.entidades;

public abstract class Inimigo {
	
	private final int maxPV = 60;
	private int PD,PA,PV;
	private Armas arma;
	
	
	public Inimigo(int pontoAtaque, int pontoDefesa, Armas arma) {
		this.PA = pontoAtaque;
		this.PD = pontoDefesa;
		this.arma = arma;
		this.PV = maxPV;
		
	}
	public int getPD() {
		return PD;
	}
	public void setPD(int PD) {
	   this.PD = PD;
	}
	public int getPA() {
		return PA;
	}
	public void setPA(int PA) {
		this.PA = PA;
	}
	public Armas getArma() {
		return arma;
	}
	public void setArma(Armas arma) {
		this.arma = arma;	
	}
	public int getMaxPV() {
		return maxPV;
	}
	public int getPV() {
		return PV;
	}
	public void setPV(int PV) {
		this.PV = PV;
	}

	
}
