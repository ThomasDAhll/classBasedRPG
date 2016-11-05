package Creature;

import java.util.ArrayList;

import Abilities.Abilities;
import Abilities.Magic;
import Events.Meny;
import Item.Items;

public class Hero extends Person{
	Library lib = new Library();
	Meny menu = new Meny();
	//ArrayList<Items> items;
	public ArrayList<Magic> magic;
	
	
	public Hero(String name, String klasse, int lvl, int health, int magicPoints, int maxLife, boolean sex, int str,
			int con, int intel) {
		super(name, klasse, lvl, health, magicPoints, maxLife, sex, str, con, intel);
		//magic = lib.createFire(a, b)
	}
	public Hero() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hero(String name, String klasse, int lvl, boolean sex, String weapon, int str, int con, int intel) {
		super(name, klasse, lvl, sex, weapon, str, con, intel);
		setMaxLife(getCon()*10);
		health=getMaxLife();
		setMaxMagicPoints(getIntel()*10);
		setMagicPoints(getIntel()*10);

	}
	
	public Object createHero(){
		Hero hero = new Hero("John","mage",1,true,"staff",8,8,2);
		
		setMaxLife(getCon()*10);
		health=getMaxLife();
		setMaxMagicPoints(getIntel()*10);
		setMagicPoints(getIntel()*10);
		return hero;
		
	}
	
	
	//DAFUQ
	public boolean heroCastMagic(int abi, Creature b){
		boolean mana = true;
		if(getKlasse()== "mage"){
		ArrayList <Magic> list= lib.createFire(this, b);	
		abi = list.size() - abi;			
		
		if(getMagicPoints()<list.get(abi).getManaCost())
		{
			System.out.println("\t"+name+" does not have enough mana");
			mana = false;
		}
		else
		{
			b.health -= list.get(abi).getDmg();
			System.out.println(list.get(abi).getDesc());
			setMagicPoints(getMagicPoints()-list.get(abi).getManaCost());
			mana = true;
		}
		
		
	}
		return mana;
	}
	
}



