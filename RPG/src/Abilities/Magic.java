package Abilities;

import Creature.Creature;

public class Magic extends Abilities{
	private int manaCost;

	
	
public Magic(String name, int dmg, int heal, int manaCost) {
		super(name, dmg, heal);
		this.manaCost=manaCost;
	}
@Override
public void abilityDamage(Creature enemy, Abilities abe ){
	
	int dmg = abe.dmg;
	enemy.setHealth(enemy.health-dmg);
	
	System.out.println(enemy.name+"'s HP is now "+enemy.health);
	
}
public int getManaCost() {
	return manaCost;
}
public void setManaCost(int manaCost) {
	this.manaCost = manaCost;
}

	
	
	
	
}
