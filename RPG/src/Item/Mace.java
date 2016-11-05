package Item;

import java.util.ArrayList;

import Abilities.Abilities;

public class Mace extends Sword{

	
	
	public Mace(int value, int weight, int dmg, String name, int heal, int maxLife, int aura, boolean permanent,
			ArrayList<Abilities> abilities) {
		// TODO Auto-generated constructor stub
	}

	public Mace() {
		// TODO Auto-generated constructor stub
	}

	public Weapon createWeapon(){
		Weapon weapon = new Sword(10,8,9,weaponNames(),0,0, 0,true,null);
		
		value = value * lvl;
		dmg = dmg * lvl;
	return weapon;
	}
	
	public String weaponNames(){
		String[] name = {"DragonTooth", "DeepCutter","Striking Mantis"};
		
		return name[rand.nextInt(name.length-1)];
		
	}
	
	
	}


