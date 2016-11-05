package Events;

import Creature.Hero;

public class Main {
public static void main(String[] args) {
	Creator creator = new Creator();
	
	
	Event event = new Event();
	Hero hero = (Hero) creator.createHero();
	event.round(hero);
	

}
}