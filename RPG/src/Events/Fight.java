package Events;

import java.util.ArrayList;

import Abilities.Magic;
import Creature.Creature;
import Creature.Hero;
import Creature.Library;

public class Fight{
	


Magic magi = new Magic(null, 0, 0, 0);
Library lib = new Library();
Meny menu = new Meny();

	public boolean fightSequence(Hero a, Creature b) {
	boolean fight = true;
	boolean again = false;
	boolean win = false;

		while (fight){
			if(a.checkAlive()==false){
				System.out.println("\t"+a.name+" were brutally killed by "+b.name);
				return win;
			}
		//HERO
			
		do{
			
		int Choice = menu.menuFight(a);
		int abi = Choice;
		if(Choice>=10){
			abi -= 10;
			Choice=2;
		}
		switch(Choice){
		case 1: a.dealDamage(b);
				break;
		case 2: a.heroCastMagic(abi, b);		
				again = true;
				break;
		// TODO programmere health postions
		case 3: System.out.println(a.name + " drinks an unimplemented health Potion.");
				break;
		//TODO løpe avgårde!!
		case 4: System.out.println(a.name + " runs imagnitive away!");
				fight = false;
				break;
				
			
		}
			
		}
		while(again);
		
		//ENEMY
		if(b.checkAlive()==false){
			System.out.println("\t"+b.name+" was brutally killed by "+a.name);
			win = true;
			endOfFight(a,b);
			return win;
		}
		boolean reg = true;
		if(b.getKlasse()== "mage"){
		ArrayList <Magic> list= lib.createFire(b, a);		
		
		for(int i=list.size()-1; i>=0;i--){
			if(b.getMagicPoints()>list.get(i).getManaCost()){
			a.health -= list.get(i).getDmg();
			System.out.println(list.get(i).getDesc());
			b.setMagicPoints(b.getMagicPoints()-list.get(i).getDmg());
			System.out.println(b.getMagicPoints());
			i=0;
							}else{b.dealDamage(a); i =0;
					}
				}
			}else{b.dealDamage(a);}
		}
		
		endOfFight(a,b);
		return win;
	}





private void endOfFight(Hero a, Creature b){
	System.out.println("\t"+a.name+" got "+b.getXpValue()+" Xp for the fight.");
a.xp+=b.getXpValue();
}
}

