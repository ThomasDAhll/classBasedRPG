package Item;

import java.util.ArrayList;
import java.util.Random;

import Abilities.Abilities;

public class Weapon extends Items{
    Random rand = new Random();
	
	Weapon sword = new Sword();
	Weapon mace = new Mace();
	Weapon bow = new Bow();
	Weapon staff = new Staff();
	Weapon axe = new Axe();
	Weapon spear = new Spear();
	
	public Weapon(){}
	
	public Weapon(int value, int weight, int dmg, String name, int heal, int maxLife, int aura, boolean permanent,
			ArrayList<Abilities> abilities) {
		super(value, weight, dmg, name, heal, maxLife, aura, permanent, abilities);
		// TODO Auto-generated constructor stub
	}

	public Weapon createWeapon(){
		Weapon weapon = new Weapon(value,weight,dmg,name, heal,maxLife, aura,permanent,
				abilities);
		
	return weapon;
	}
		
public Weapon createWeapons(String weapon){
	String[] weaponTypes = {"sword","mace","bow","staff","axe","spear"};
	if(weapon==null){
		weapon = weaponTypes[rand.nextInt(weaponTypes.length-1)];
		System.out.println(weapon);
	}
	
	switch(weapon){
	case "sword": return sword.createWeapon();                                                          
	case "mace": return mace.createWeapon();

	case "bow":return bow.createWeapon();

	case "staff": return staff.createWeapon(); 
	case "axe": return axe.createWeapon();
	case "spear":return  spear.createWeapon();

	default: System.out.println("WENT TO DEAFULT IN WEAPON 67");
	break;
	}
	return null;
	
}

















public String weaponNames(){
	String[] name = {};
	
	return name[rand.nextInt(name.length-1)];
	
}
}
