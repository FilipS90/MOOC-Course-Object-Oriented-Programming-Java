package paketic;

public class Player {
	private int koordinataDuzine=0;
	private int koordinataVisine=0;
	
	
	public Player() {
	}
	
	public int getKoordinataDuzine() {
		return koordinataDuzine;
	}

	public void setKoordinataDuzine(int koordinataDuzine) {
		this.koordinataDuzine = koordinataDuzine;
	}

	public int getKoordinataVisine() {
		return koordinataVisine;
	}

	public void setKoordinataVisine(int koordinataVisine) {
		this.koordinataVisine = koordinataVisine;
	}

	public boolean move(String moves,int i) {
		moves=moves.toLowerCase();
		int s=0;
		
			if(moves.charAt(i)=='a') {
				s=koordinataDuzine-1;
				koordinataDuzine=s;
			}
			else if(moves.charAt(i)=='d') {
				s=koordinataDuzine+1;
				koordinataDuzine=s;
			}
			else if(moves.charAt(i)=='w') {
				s=koordinataVisine-1;
				koordinataVisine=s;
			}
			else if(moves.charAt(i)=='s') {
				s=koordinataVisine+1;
				koordinataVisine=s;
			}
			else if(moves.charAt(i)=='x') {
			}
			else {
				System.out.println("Invalid movement command.");
				System.out.println("Movement commands are w,s,a,d and x try again.");
				return false;
			}
			return true;
	}
	
	
	
}
