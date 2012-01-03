package pl.mpr.wlascnosci.base;

public class Rzecz {
	int id;
	private String rzecz;
	private int numer_seryjny;
	private boolean stan;
	
	public Rzecz(int id, String rzecz, int numer_seryjny, boolean stan) {
		this.id = id;
		this.rzecz = rzecz;
		this.numer_seryjny = numer_seryjny;
		this.stan = stan;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getRzecz() {
		return rzecz;
	}

	public void setRzecz(String rzecz) {
		this.rzecz = rzecz;
	}

	public int getNumer_seryjny() {
		return numer_seryjny;
	}

	public void setNumer_seryjny(int numerSeryjny) {
		numer_seryjny = numerSeryjny;
	}

	public boolean getStan() {
		return stan;
	}

	public void setStan(boolean stan) {
		this.stan = stan;
	}
	
}
