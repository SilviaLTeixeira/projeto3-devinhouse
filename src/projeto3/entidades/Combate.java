package projeto3.entidades;



public abstract class Combate {
	private Armas[] armas;
	private int PA,PD;
	private final int maxPV = 100;
	private int PV;
	
	
	public Combate(int PA, int PD , Armas[] armas) {
		this.PA = PA;
		this.PD = PD;
		this.armas = armas;
		this.PV = maxPV;
	}

	public Armas[] getArmas() {
		return this.armas;
		
	}

	public int getPA() {
		return PA;
	}

	public void setPA(int PA) {
		this.PA = PA;
	}

	public int getPD() {
		return PD;
	}

	public void setPD(int PD) {
		this.PD = PD;
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
