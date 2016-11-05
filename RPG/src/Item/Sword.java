package Item;

import java.util.ArrayList;

import Abilities.Abilities;

public class Sword extends Weapon{
	
	public Sword() {
		// TODO Auto-generated constructor stub
	}

	public Sword(int value, int weight, int dmg, String name, int heal, int maxLife, int aura, boolean permanent,
			ArrayList<Abilities> abilities) {
		super(value, weight, dmg, name, heal, maxLife, aura, permanent, abilities);
		// TODO Auto-generated constructor stub
	}
	

	
	
	
	public Weapon createWeapon(){
		
		Weapon weapon = new Sword(10,5,9,weaponNames(),0,0, 0,true,null);
		value = value * lvl;
		dmg = dmg * lvl;
		
	return weapon;
	}
	
	public String weaponNames(){
		String[] name = {"Fleshparter", "Scaler","LongClaw"};
		
		return name[rand.nextInt(name.length-1)];
		
	}
	}
	
	

