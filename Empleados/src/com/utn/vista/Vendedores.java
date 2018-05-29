package com.utn.vista;

public class Vendedores {
	private int pPVR;

	public int getpPVR() {
		return pPVR;
	}

	public void setpPVR(int pPVR) {
		this.pPVR = pPVR;
	}

	@Override
	public String toString() {
		return "Vendedores [pPVR=" + pPVR + "]";
	}

	public Vendedores(int pPVR) {
		super();
		this.pPVR = pPVR;
	}
	
}
