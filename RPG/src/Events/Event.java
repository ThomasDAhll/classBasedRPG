package Events;

import Creature.Hero;
import Item.Items;
import Item.Weapon;

public class Event{
Fight fight = new Fight();
Creator create = new Creator();
Items item = new Items(); //NEED RANDOM ITEM DROP
//Weapon weap = new Weapon(0, 0, 0, null, 0, 0, 0, false, null);
	

public void round(Hero a){
	boolean alive = true;
	while(alive){
	alive =	fight.fightSequence(a, create.createMonster());	
	Items weapon = item.createWeapon(null);
//	System.out.println("You've looted the enemy for "+weapon.getName());
	//a.equipItems(item);
	}

}
}
