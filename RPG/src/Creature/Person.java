package Creature;
public class Person extends Creature{
public int xp;
	
	
	public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public Person(String name, String klasse, int lvl, boolean sex, String weapon, int str, int con, int intel) {
	super(name, klasse, lvl, sex, weapon, str, con, intel);
	// TODO Auto-generated constructor stub
}
	public Person(String name,String klasse, int lvl, int health, int magicPoints, int maxLife, boolean sex, int str, int con,
		int intel) {

	super(name, klasse, lvl, health, magicPoints, maxLife, sex, str, con, intel);


}
	public Person(String name,  String klasse, int lvl, boolean sex, int str, int con, int intel){
}
}

