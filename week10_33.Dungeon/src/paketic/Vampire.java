package paketic;

import java.util.Random;

public class Vampire {
	private int vKoordDuzine;
	private int vKoordVisine;

	public Vampire() {
		
	}
	
	public int getvKoordDuzine() {
		return vKoordDuzine;
	}
	public void setvKoordDuzine(int vKoordDuzine) {
		this.vKoordDuzine = vKoordDuzine;
	}
	public int getvKoordVisine() {
		return vKoordVisine;
	}
	public void setvKoordVisine(int vKoordVisine) {
		this.vKoordVisine = vKoordVisine;
	}
	
	public void movement(Vampire [] list, int heigth, int length) {
		for(Vampire v: list) {
			int rand = getRandomNumberInRange();
			if(rand==1) {
				if(checkIfLegalFor1(list,v)) {
					if(v.getvKoordVisine()!=0) {
						v.setvKoordVisine(v.getvKoordVisine()-1);
					}
				}
			}
			else if(rand==2) {
				if(checkIfLegalFor2(list,v)) {
					if(v.getvKoordVisine()!=heigth-1) {
						v.setvKoordVisine(v.getvKoordVisine()+1);
					}															// Method to make sure all moves are legal
				}																// (inside of the map) and making sure no 
			}																	// vampires are coliding.
			else if(rand==3) {										
				if(checkIfLegalFor3(list,v)) {
					if(v.getvKoordDuzine()!=0) {
						v.setvKoordDuzine(v.getvKoordDuzine()-1);
					}		
				}
			}
			else if(rand==4) {
				if(checkIfLegalFor4(list,v)) {
					if(v.getvKoordDuzine()!=length-1) {
				v.setvKoordDuzine(v.getvKoordDuzine()+1);
					}
				}
			}
		}
	}
	
	private int getRandomNumberInRange() {
		int min=1;
		int max=4;
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	private boolean checkIfLegalFor1(Vampire [] list, Vampire v) {
		for(int i=0;i<list.length;i++) {
			if(v.getvKoordVisine()-1==list[i].getvKoordVisine() && v.getvKoordDuzine()==list[i].getvKoordDuzine()) {
				return false;
			}
		}
		return true;
	}
	
	private boolean checkIfLegalFor2(Vampire [] list, Vampire v) {
		for(int i=0;i<list.length;i++) {
			if(v.getvKoordVisine()+1==list[i].getvKoordVisine() && v.getvKoordDuzine()==list[i].getvKoordDuzine()) {
				return false;
			}
		}
		return true;
	}
	
	private boolean checkIfLegalFor3(Vampire [] list, Vampire v) {
		for(int i=0;i<list.length;i++) {
			if(v.getvKoordVisine()==list[i].getvKoordVisine() && v.getvKoordDuzine()-1==list[i].getvKoordDuzine()) {
				return false;
			}
		}
		return true;
	}
	
	private boolean checkIfLegalFor4(Vampire [] list, Vampire v) {
		for(int i=0;i<list.length;i++) {
			if(v.getvKoordVisine()==list[i].getvKoordVisine() && v.getvKoordDuzine()+1==list[i].getvKoordDuzine()) {
				return false;
			}
		}
		return true;
	}
	
	
}
