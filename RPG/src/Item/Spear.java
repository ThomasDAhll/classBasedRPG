package Item;

import java.util.ArrayList;

import Abilities.Abilities;

public class Spear extends Weapon{

	
	
	
	
	
	
	
	
	
	
	public Spear(int value, int weight, int dmg, String name, int heal, int maxLife, int aura, boolean permanent,
			ArrayList<Abilities> abilities) {
		// TODO Auto-generated constructor stub
	}

	public Spear() {
		// TODO Auto-generated constructor stub
	}

	public Weapon createWeapon(){
		Weapon weapon = new Spear(10,5,6,weaponNames(),0,0, 0,true,null);
		
		value = value * lvl;
		dmg = dmg * lvl;
	return weapon;
	}
	
	public String weaponNames(){
		String[] name = {"EyePoker", "Jargos de cut","Pincusher"};
		
		return name[rand.nextInt(name.length-1)];
		
	}
	
}
