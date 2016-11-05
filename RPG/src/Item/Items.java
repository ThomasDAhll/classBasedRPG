	package Item;

import java.util.ArrayList;
import java.util.Random;

import Abilities.Abilities;
import Top.Top;

public class Items extends Top{

	public Items(){}
	
	
	
	int value;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getDmg() {
		return dmg;
	}
	public void setDmg(int dmg) {
		this.dmg = dmg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeal() {
		return heal;
	}
	public void setHeal(int heal) {
		this.heal = heal;
	}
	public int getMaxLife() {
		return maxLife;
	}
	public void setMaxLife(int maxLife) {
		this.maxLife = maxLife;
	}
	public int getAura() {
		return aura;
	}
	public void setAura(int aura) {
		this.aura = aura;
	}
	public ArrayList<Abilities> getAbilities() {
		return abilities;
	}
	public void setAbilities(ArrayList<Abilities> abilities) {
		this.abilities = abilities;
	}
	protected int weight;
	protected	int dmg;
	protected String name;
	protected int heal;
	protected int maxLife;
	protected int aura;
	protected boolean permanent;
	protected static int lvl;
	
	
	ArrayList <Abilities> abilities;
	public Items(int value, int weight, int dmg, String name, int heal, int maxLife, int aura, boolean permanent,
			ArrayList<Abilities> abilities) {
		super();
		this.value = value;
		this.weight = weight;
		this.dmg = dmg;
		this.name = name;
		this.heal = heal;
		this.maxLife = maxLife;
		this.aura = aura;
		this.permanent = permanent;
		this.abilities = abilities;
	}
	public static int getLvl() {
		return lvl;
	}
	public static void setLvl(int lvl) {
		Items.lvl = lvl;
	}

	public String toString() {	
		
		String A = "value "+value+" name "+name+" damage "+dmg+" perm "+permanent;	
		return A;
	}
	public Items createWeapon(String type){
		System.out.println("1");
	Weapon wep = new Weapon();
	System.out.println("2");
		Weapon weapon = wep.createWeapons(type);
		System.out.println("3");
			return weapon;
		
		
		
	}
	

	}
