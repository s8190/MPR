package pl.mpr.wlascnosci.base;

import java.util.ArrayList;

public class Wlasciciel {
	int id;
	private String imie;
	private String nazwisko;
	private String adres;
	private String email;
	ArrayList<Rzecz> rzeczy;
	
	public Wlasciciel(int id, String imie, String nazwisko, String adres, String email) {
		this.id = id;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.adres = adres;
		this.email = email;
		rzeczy = new ArrayList<Rzecz>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Rzecz> getRzeczy() {
		return rzeczy;
	}

	public void setRzeczy(ArrayList<Rzecz> rzeczy) {
		this.rzeczy = rzeczy;
	}
	
	public void addRzecz(Rzecz r) {
		rzeczy.add(r);
	}
	
	public void delRzecz(Rzecz r) {
		rzeczy.remove(r);
	}

}
