package org.ema.softquality.animals;

public class Chien implements Animal {

	private String _nom;
	
	private String _cri;

	public Chien (String nom, String cri) {
		this._nom = nom;
		this._cri = cri;
	}
	
	public String crier() {
		return "Je suis " + this.get_nom() + ", je fais " + this.get_cri();		
	}

	public String get_nom() {
		return _nom;
	}

	public void set_nom(String _nom) {
		this._nom = _nom;
	}

	public String get_cri() {
		return _cri;
	}

	public void set_cri(String _cri) {
		this._cri = _cri;
	}

	
}
