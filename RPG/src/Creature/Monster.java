package Creature;
public class Monster extends Creature{
String warCry;
public void warcry(){
	System.out.println("\t '"+name+ " screams!'");
	
	}
public Monster() {
	super();
	// TODO Auto-generated constructor stub
}
public Monster(String name, String klasse, int lvl, boolean sex, String weapon, int str, int con, int intel) {
	super(name, klasse, lvl, sex, weapon, str, con, intel);
	// TODO Auto-generated constructor stub
}
public Monster(String name, String klasse, int lvl, int health, int magicPoints, int maxLife, boolean sex, int str,
		int con, int intel) {
	super(name, klasse, lvl, health, magicPoints, maxLife, sex, str, con, intel);
	// TODO Auto-generated constructor stub
}







	
	
	
		
}
