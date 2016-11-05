package Abilities;

import Creature.Creature;

public class Abilities {
	protected int dmg;
	protected int heal;
	protected String name;
	protected String desc;
	
public Abilities(String name, int dmg, int heal){
	this.dmg=dmg;
	this.heal=heal;
	this.name=name;
}

public String getDesc() {
	return desc;
}

public int getDmg() {
	return dmg;
}

public void setDmg(int dmg) {
	this.dmg = dmg;
}

public int getHeal() {
	return heal;
}

public void setHeal(int heal) {
	this.heal = heal;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public void setDesc(String desc) {
	this.desc = desc;
}
		


public void abilityDamage(Creature enemy, Abilities abe ){
	
	int dmg = abe.dmg;
	enemy.setHealth(enemy.health-dmg);

	System.out.println(enemy.name+"'s HP is now "+enemy.health);
	
}
}



