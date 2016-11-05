package Item;

import java.util.ArrayList;

import Abilities.Abilities;

public class Bow extends Weapon{

	
	
	
	
	
	
	public Bow(int value, int weight, int dmg, String name, int heal, int maxLife, int aura, boolean permanent,
			ArrayList<Abilities> abilities) {
		// TODO Auto-generated constructor stub
	}

	public Bow() {
		// TODO Auto-generated constructor stub
	}

	public Weapon createWeapon(){
	Weapon weapon = new Bow(10,5,6,weaponNames(),0,0, 0,true,null);
		
		value = value * lvl;
		dmg = dmg * lvl;
		
		
		return weapon;
	}
	
	public String weaponNames(){
		String[] name = {"Windwaker", "Flour de la Arrer","Skarbest"};
		
		return name[rand.nextInt(name.length-1)];
		
	}
	
	
	
	
	
	
	
	
	
	
}
