package Creature;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Abilities.Abilities;
import Abilities.Magic;
import Item.Armour;
import Item.Items;
import Item.Weapon;

public class Creature{
	Scanner scan = new Scanner(System.in);
	
	public int health;
	public String name;
	private int lvl;
	private int magicPoints;
	private int maxMagicPoints;
	private int maxLife;
	protected boolean sex;
	private int str;
	private int con;
	private int intel;
	protected String klasse;
	//public String ability;
	public int xpValue;
	public int dmgBonus;
	public int heal;
	public int aura;
	public int armor;


	private	ArrayList <Abilities> abilities;
	private	ArrayList <Items> equiptment;

	
	
	public void setHealth(int health) {
		this.health = health;
	}



	private String weaponType;
	
	public int getXpValue() {
		return xpValue;
	}



	public void setXpValue(int xpValue) {
		this.xpValue = xpValue;
	}


/*
	public Object getAbility() {
		return ability;
	}



	public void setAbility(String ability) {
		this.ability = ability;
	}
*/


	Random rand = new Random();
	
	public String genderNoun(int x){
		String a;
		
		if(sex){
			
			if(x==0){a="his";}
			else{a="he";}
			
			
			}else{if(x==0){a="her";}
					else{a="she";}
			}
		return a;
	}
	
	
	
	public int getMaxLife() 	{return maxLife;}
	public void setMaxLife(int maxLife) {this.maxLife = maxLife;}
	public int getHealth(){
		if (health<0){
			return 0;
		}
		return health;    }
	
	
	public void setHealth(double d) {this.health = (int) d;}
	public String getName() 	{return name;}
	public void setName(String name) {this.name = name;}
	public int getLvl() 		{return lvl;}
	public void setLvl(int lvl) 	{this.lvl = lvl;}
	public int getMagicPoints() {return magicPoints;}
	public void setMagicPoints(int magicPoints) {this.magicPoints = magicPoints;}
	
	
	
	public int getStr() 		{return str;}
	public void setStr(int str) {this.str = str;}
	
	public int getCon() 		{return con;}
	public void setCon(int con) 	{this.con = con;}
	public int getIntel() 		{return intel;}
	public void setIntel(int intel) {this.intel = intel;}



	public Creature(String name, String klasse, int lvl, int health, int magicPoints, int maxLife, boolean sex, int str, int con, int intel){
		this.name=name;
		this.lvl=lvl;
		this.health=health;
		this.magicPoints=magicPoints;
		this.str=str;
		this.maxLife=maxLife;
		this.sex=sex;
		this.con=con;
		this.intel=intel;
		this.klasse=klasse;
	}
	public Creature(String name,  String klasse, int lvl, boolean sex, String weapon, int str, int con, int intel){
		this.name=name;
		this.lvl=lvl;
		this.str=str;
		this.sex=sex;
		this.con=con;
		this.intel=intel;
		this.klasse=klasse;
		this.weaponType=weapon;
		setMaxLife(getCon()*10);
		health=getMaxLife();
		setMaxMagicPoints(getIntel()*10);
		setMagicPoints(getIntel()*10);
	}
public Creature() {
		// TODO Auto-generated constructor stub
	}



public void dealDamage(Creature enemy){
	int dmg = (int) Math.floor(damageVar()+dmgBonus-armor);
	enemy.setHealth((Math.ceil(enemy.health-dmg)));
	String våpen = weaponType;
	
	//TODO inn i library?
	
	String end = enemy.name+" for "+dmg+" damage, "+enemy.genderNoun(0)+" HP is now "+enemy.getHealth();
	switch(våpen){
	case "sword": System.out.println("\t"+name+" lashes out with "+genderNoun(0)+  " sword,  and slashes "+end);
		break;
	case "mace": System.out.println("\t"+name+" smashes "+enemy.name+" with "+genderNoun(0)+  " mace,  and hits "+end);
		break;
	case "bow": System.out.println("\t"+name+" draws "+genderNoun(0)+" bow, lets go and shoots "+end);
		break;
	case "staff": System.out.println("\t"+name+" swings "+genderNoun(0)+" staff,  and slams "+end);
		break;
	case "axe": System.out.println("\t"+name+" raises "+genderNoun(0)+  "axe,  and strikes down at "+end);
	break;
	
	case "spear": System.out.println("\t"+name+" strikes with "+genderNoun(0)+  " spear,  hitting "+end);
	break;
	
	default: System.out.println("\t"+name+" dealt "+dmg+" damage to "+enemy.name+", "+enemy.genderNoun(0)+" HP is now "+enemy.getHealth());
	break;
	
	
	}
		
	
	
}

public int getArmor() {
	return armor;
}



public void setArmor(int armor) {
	this.armor = armor;
}



public void healHp(int heal){
	
	if((health+heal)>=maxLife){
		health = maxLife;
	}else health+=heal;
	System.out.println(name + " was healed for "+heal+"HP "+name+" now has "+health+"HP");
}
public float damageVar(){
	float b= (float)(0.5+(3.0-0.5)*rand.nextFloat());
	float c = b*str;
	return c;
}

public String toString() {
	String gender;
	if(sex){
		gender="male";
	}else{
		gender="female";
	}
	return name + " " + gender+" class: "+klasse+" health:"+health+" Mana: "+"magicPoints: "+magicPoints+" str:" +str+" con:"+con+" int:"+intel;
}

public void setHPMP(float healthVar, float manaVar){
	this.setHealth((int)(healthVar*this.getCon()));
	this.setMaxLife(this.getHealth());
	this.setMagicPoints((int)(manaVar*this.getIntel()));
}

public boolean checkAlive(){
	boolean check = false;
	if(health<=0){return check;
	}else{check = true;
		return check;
	}
}
public void useItem(Items a){
	
	dmgBonus += a.getDmg();
	heal += a.getHeal();
	maxLife += a.getMaxLife();
	aura += a.getAura();
	abilities.addAll(a.getAbilities());
	armor += ((Armour)a).armor;
	
}

public void remItem(Items a){
	
	dmgBonus -= a.getDmg();
	heal -= a.getHeal();
	maxLife -= a.getMaxLife();
	aura -= a.getAura();
	abilities.removeAll(a.getAbilities());
	armor -= ((Armour)a).armor;

}

public void equipItems(Items item){
	System.out.println("Do you want to equip "+item.toString()+"?");
	String a = scan.nextLine();
	
		if(item instanceof Weapon){
			System.out.println("Do you want to equip "+item.toString()+" instead of "
					+equiptment.get(0).toString());
			if(a.equals("yes")){
			remItem(equiptment.get(0));
			equiptment.add(0, item);
			useItem(item);
			}
		}else if(item instanceof Armour){
			if(a.equals("yes")){
			System.out.println("Do you want to equip "+item.toString()+" instead of "
					+equiptment.get(1).toString());
			remItem(equiptment.get(1));
			equiptment.add(1,item);
			useItem(item);
		}
		
	}
	
}


/*
public int health;
public String name;
private int lvl;
private int magicPoints;
private int maxMagicPoints;
private int maxLife;
protected boolean sex;
private int str;
private int con;
private int intel;
protected String klasse;
public String ability;
public int xpValue;
*/










public String getKlasse() {
	return klasse;
}


public void setKlasse(String klasse) {
	this.klasse = klasse;
}



public int getMaxMagicPoints() {
	return maxMagicPoints;
}



public void setMaxMagicPoints(int maxMagicPoints) {
	this.maxMagicPoints = maxMagicPoints;
}



public String getWeaponType() {
	return weaponType;
}



public void setWeaponType(String weaponType) {
	this.weaponType = weaponType;
}




}










