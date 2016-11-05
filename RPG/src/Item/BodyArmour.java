package Item;

import java.util.ArrayList;

import Abilities.Abilities;

public class BodyArmour extends Armour{

	public BodyArmour() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BodyArmour(int value, int weight, int dmg, String name, int heal, int maxLife, int aura, boolean permanent,
			ArrayList<Abilities> abilities, int armor) {
		super(value, weight, dmg, name, heal, maxLife, aura, permanent, abilities, armor);
		// TODO Auto-generated constructor stub
	}

	public Armour createArmour(){
	Armour armour = new BodyArmour(60,23,0,armourNames(),0,0, 0,true,null, 8);
		
		value = value * lvl;
		dmg = dmg * lvl;
		armor = armor * lvl;

		
		
		return armour;
	}
	
	
	public String armourNames(){
		String[] name = {"Dragon Scales","Dusty Dented","Studde leather"};
		
		return name[rand.nextInt(name.length-1)];
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
