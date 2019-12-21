package paketic;

import java.util.Scanner;

public class Dungeon {
	private int length;
	private int heigth;
	private int vampires;
	private int moves;
	private Scanner sc = new Scanner(System.in);
	
	public Dungeon(int length, int heigth, int moves) {
		super();
		this.length = length;
		this.heigth = heigth;
		this.vampires = heigth+length;
		this.moves = moves;
		
	}
	
	public void mainMenu() {
		String menuPicture = " ___                                                                                                      \r\n" + 
				"-   ---___- ,,                                          ,                                                 \r\n" + 
				"   (' ||    ||                  _                 _    ||        ;      _                   '             \r\n" + 
				"  ((  ||    ||/\\\\  _-_         / \\\\ ,._-_  _-_   < \\, =||=       \\\\/\\  < \\, \\\\/\\\\/\\\\ -_-_  \\\\ ,._-_  _-_  \r\n" + 
				" ((   ||    || || || \\\\       || ||  ||   || \\\\  /-||  ||        || |  /-|| || || || || \\\\ ||  ||   || \\\\ \r\n" + 
				"  (( //     || || ||/         || ||  ||   ||/   (( ||  ||        || | (( || || || || || || ||  ||   ||/   \r\n" + 
				"    -____-  \\\\ |/ \\\\,/        \\\\_-|  \\\\,  \\\\,/   \\/\\\\  \\\\,       \\\\/   \\/\\\\ \\\\ \\\\ \\\\ ||-'  \\\\  \\\\,  \\\\,/  \r\n" + 
				"              _/               /  \\                                                  |/                   \r\n" + 
				"                              '----`                                                 '                    \r\n" + 
				"                                                        _ ,                                               \r\n" + 
				"                                 ,,                   ,- -                                                \r\n" + 
				"  _     _                        ||                  _||_   '        _                                    \r\n" + 
				" / \\\\  < \\, \\\\/\\\\/\\\\  _-_        ||/|, '\\\\/\\\\       ' ||   \\\\  _-_  < \\,                                  \r\n" + 
				"|| ||  /-|| || || || || \\\\       || ||  || ;'         ||   || ||    /-||                                  \r\n" + 
				"|| || (( || || || || ||/         || |'  ||/           |,   || ||   (( ||                                  \r\n" + 
				"\\\\_-|  \\/\\\\ \\\\ \\\\ \\\\ \\\\,/        \\\\/    |/          _-/    \\\\ \\\\,/  \\/\\\\                                  \r\n" + 
				" /  \\                                  (                                                                  \r\n" + 
				"'----`                                  -_-                                                               ";
		System.out.println(menuPicture);
		System.out.println("\n\tOptions:");
		System.out.println("New game  - 1");
		System.out.println("Quit 	  - 2");
		System.out.println("Controls  - 3");
		System.out.println("Objective - 4");
		int option = sc.nextInt();
		if(option==1)
			run();
		else if(option==2)
			System.exit(0);
		else if(option==3) {
			System.out.println("w - up");
			System.out.println("s - down");
			System.out.println("d - right");
			System.out.println("a - left");
			System.out.println("x - wait");
			noPicture();
		}
		else if(option==4) {
			System.out.println("Your objective is to exit the dungeon crawling with vampires");
			System.out.println("To do this you must reach E in the bottom right corner. Good luck!");
			noPicture();
		}
		else {
			System.out.println("Bad input, try again.");
			noPicture();
		}
	}
	
	private void noPicture() {
		System.out.println("\n\tOptions:");
		System.out.println("New game  - 1");
		System.out.println("Quit 	  - 2");
		System.out.println("Controls  - 3");
		System.out.println("Objective - 4");
		int option = sc.nextInt();
		if(option==1)
			run();
		else if(option==2)
			System.exit(0);
		else if(option==3) {
			System.out.println("w - up");
			System.out.println("s - down");
			System.out.println("d - right");
			System.out.println("a - left");
			System.out.println("x - wait");
			noPicture();
		}
		else if(option==4) {
			System.out.println("Your objective is to exit the dungeon crawling with vampires");
			System.out.println("To do this you must reach E in the bottom right corner. Good luck!");
			noPicture();
		}
		else {
			System.out.println("Bad input, try again.");
			noPicture();
		}
	}
	
	private void run() {
		Player p = new Player();
		Vampire[] list = new Vampire[vampires];
		
		for(int i=0;i<list.length;i++) {
			Vampire x = new Vampire();
			int rand = (int)(Math.random() * (length));
			int rand2 = (int)(Math.random() * (heigth));
			x.setvKoordDuzine(rand);								// Creating player and vampires,
			x.setvKoordVisine(rand2);								// and giving coordinates to vampires,
			if(rand==0 && rand2==0) {								// player has default coordinates 0,0
				rand = (int)(Math.random() * (length));
				rand2 = (int)(Math.random() * (heigth));
				x.setvKoordDuzine(rand);
				x.setvKoordVisine(rand2);
			}
			list[i]=x;
		}
		
		printMaze(p, list);
	}
	
	private void movement(Player p, Vampire[] list){
		String moves = sc.next();
		moves=moves.toLowerCase();
		checkIfLegal(moves,p,list);
		
		for(int i=0;i<moves.length();i++) {
			if(p.move(moves,i)) {							
				loseCondition(p,list);
				list[0].movement(list, heigth, length);
				loseCondition(p,list);
				continue;
			}
			else
				movement(p, list);
		}
		winCondition(p);
		
		this.moves-=moves.length();
		printMaze(p, list);
	}
	
	
	
	private void printMaze(Player p, Vampire[] list) {
		if(moves>0)
			System.out.println("Moves before your flashlight dies: "+moves);
		else
			System.out.println("You can't see anything!");
		char [][] dungeon = new char [heigth][length];
		for(int i=0;i<heigth;i++) {
			for(int l=0;l<length;l++) {
				dungeon[i][l]='.';
			}
		}
		dungeon[p.getKoordinataVisine()][p.getKoordinataDuzine()]='@';
		dungeon[heigth-1][length-1]='E';
		
		if(moves>0) {
		for(Vampire s: list) {
			dungeon[s.getvKoordVisine()][s.getvKoordDuzine()]='v';
		}
		}
		
		for(int i=0;i<heigth;i++) {
			System.out.println("");
			for(int m=0;m<length;m++) {
				System.out.print(dungeon[i][m]);
			}
		}
		System.out.println("\n\nYour moves: ");
		movement(p, list);
	}
	
	private void checkIfLegal(String s, Player p, Vampire[] list) {
		int y=p.getKoordinataVisine(),x=p.getKoordinataDuzine();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='w') {
				y--;
				if(y==-1) {
				System.out.println("One of the moves is out of map boundary, try again.");
				movement(p,list);
			}
			}
			else if(s.charAt(i)=='s') {
				y++;
				if(y==getHeigth()) {
				System.out.println("One of the moves is out of map boundary, try again.");
				movement(p,list);
				}
			}
			else if(s.charAt(i)=='a') {
				x--;
				if(x==-1) {
				System.out.println("One of the moves is out of map boundary, try again.");
				movement(p,list);
			}
			}
			else if(s.charAt(i)=='d') {
				x++;
				if(x==getLength()) {
				System.out.println("One of the moves is out of map boundary, try again.");
				movement(p,list);
			}
			}
		}
	}
	
	private void winCondition(Player p) {
		if(p.getKoordinataDuzine()==this.length-1 && p.getKoordinataVisine()==this.heigth-1) {
			System.out.println("SUCCESS!");
			System.out.println("You have escaped!");
			System.exit(0);
		}
	}
	
	private void loseCondition(Player p, Vampire[] list) {
		for(Vampire v: list) {
			if(p.getKoordinataDuzine()==v.getvKoordDuzine() && p.getKoordinataVisine()==v.getvKoordVisine()) {
				System.out.println("You hear a roar, and before you're able to react, Vampire has his teeth in your neck..");
				System.out.println("GAME OVER");
				System.exit(0);
			}
		}
	}

	private int getLength() {
		return length;
	}

	private int getHeigth() {
		return heigth;
	}

	private int getVampires() {
		return vampires;
	}

	private void setMoves(int moves) {
		this.moves = moves;
	}
	
}
