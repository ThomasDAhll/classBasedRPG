package Item;

import java.util.ArrayList;

import Abilities.Abilities;

public class Staff extends Weapon{

	
	
	
	
	
	public Staff(int value, int weight, int dmg, String name, int heal, int maxLife, int aura, boolean permanent,
			ArrayList<Abilities> abilities) {
		// TODO Auto-generated constructor stub
	}

	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public Weapon createWeapon(){
		Weapon weapon = new Staff(10,5,4,weaponNames(),0,0, 0,true,null);
		
		value = value * lvl;
		dmg = dmg * lvl;
	return weapon;
	}
	
	public String weaponNames(){
		String[] name = {"Oakenstaff", "Whiterunner"};
		
		return name[rand.nextInt(name.length-1)];
		
	}
	
	
	
	
	
	
}
