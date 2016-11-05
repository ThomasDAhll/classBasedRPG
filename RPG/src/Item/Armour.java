package Item;

import java.util.ArrayList;
import java.util.Random;

import Abilities.Abilities;

public class Armour extends Items{
public int armor;
Random rand = new Random();

BodyArmour body = new BodyArmour();

public Armour() {
	super();
	// TODO Auto-generated constructor stub
}

public Armour(int value, int weight, int dmg, String name, int heal, int maxLife, int aura, boolean permanent,
		ArrayList<Abilities> abilities, int armor) {
	super(value, weight, dmg, name, heal, maxLife, aura, permanent, abilities);
	// TODO Auto-generated constructor stub
}

	
public Armour createArmours(String armour){
	String[] armourTypes = {"helmet","body","shoes","shield"};
	if(armour==null){
		armour = armourTypes[rand.nextInt(armourTypes.length-1)];
		System.out.println(armour);
	}
	
	switch(armour){
//	case "helmet": return helmet.createArmour();                                                          
	case "body": return body.createArmour();

	//case "shoes":return shoes.createArmour();

	//case "shield": return shield.createArmour(); 

	default: System.out.println("WENT TO DEAFULT IN armour 67");
	break;
	}
	return null;
	
	
}


















}
	

