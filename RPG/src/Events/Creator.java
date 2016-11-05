package Events;


import java.util.Scanner;

import Abilities.Magic;
import Creature.Creature;
import Creature.Goblin;
import Creature.Hero;
import Creature.Library;
import Creature.Monster;
import Creature.Person;

import java.util.Random;

public class Creator{
	Scanner scan= new Scanner(System.in);
	Random rand = new Random();
	Library lib = new Library();
	Creature place = new Creature();
	Goblin gob = new Goblin();
	Hero hero = new Hero();
	
	public Creator(){
		
	}
	/*
	public Person createHero(String m){
		if(m =="m"){
			return  new Hero("Brukbare","warrior", 1 , 75, 5, 100, true,7 ,12, 7);	
		}else{
			return new Hero("Sarah","mage", 1, 75, 20, 75,false,15,8, 10);
		
		}	
	}*/
	
	public Monster createMonster(){
		return (Goblin) gob.createGoblin();

	}
	public Person createHero(){
		return(Hero) hero.createHero();
	}

}
