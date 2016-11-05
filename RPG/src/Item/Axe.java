package Item;

import java.util.ArrayList;

import Abilities.Abilities;

public class Axe extends Weapon{

	
	
	
	
	public Axe(int value, int weight, int dmg, String name, int heal, int maxLife, int aura, boolean permanent,
			ArrayList<Abilities> abilities) {
		// TODO Auto-generated constructor stub
	}

	public Axe() {
		// TODO Auto-generated constructor stub
	}

	public Weapon createWeapon(){
		Weapon weapon = new Axe(10,12,8,weaponNames(),0,0, 0,true,null);
		
		value = value * lvl;
		dmg = dmg * lvl;
		

		
	return weapon;
	}
	
	
	public String weaponNames(){
		String[] name = {"Raving Axe of Blood", "Skullsplitter","Splatter"};
		
		return name[rand.nextInt(name.length-1)];
		
	}
	
	
	
}
