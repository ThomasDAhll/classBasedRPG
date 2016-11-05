package Creature;
import java.util.ArrayList;

import Abilities.Magic;
//Magic(int dmg, int heal) {
		//super(dmg, heal);
public class Library {
	
	Magic mage = new Magic(null, 0, 0, 0);
	
	public ArrayList<Magic> createFire(Creature a, Creature b){
		ArrayList<Magic> fire = new ArrayList<>();
		fire.add(0, new Magic("Fireball", 10, 0, 5));
		fire.get(0).setDesc("\t"+ a.name+" sends a fireball flying towards "+b.name+"\n it burns "+b.name+" for "+fire.get(0).getDmg());
		
		fire.add(1, new Magic("Fireblast",20,0,15));
		fire.get(1).setDesc("\t"+a.name+" shouts, and a giant flame fans out of "+a.genderNoun(0)+" mouth. \n\tIt burns "+b.name+" for "+fire.get(1).getDmg()+" damage, "+
		b.genderNoun(0)+" health is now "+b.health+"hp");
		
		fire.add(2, new Magic("FireShield",20,0,15));
		fire.get(2).setDesc("\t"+a.name+" whispers and fires start spiralling around "+a.name+ "\n\tIt burns "+b.name+" for "+fire.get(1).getDmg()+" damage, "+
		b.genderNoun(0)+" health is now "+b.health+"hp");
		
		fire.add(3, new Magic("Imbue weapon",20,0,15));
		fire.get(3).setDesc("\t"+a.name+" whispers and fires start spiralling around "+a.name+"'s "+a.getWeaponType()+ "\n\t It now burns "+b.name+" for "+fire.get(1).getDmg()+" damage, "+
		b.genderNoun(0)+" health is now "+b.health+"hp");
		
		return fire;
		
	}



	
}


