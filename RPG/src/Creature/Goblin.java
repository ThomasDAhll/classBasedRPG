package Creature;
import java.util.Random;
public class Goblin extends Monster{


public Goblin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Goblin(String name, String klasse, int lvl, boolean sex, String weapon, int str, int con, int intel) {
		super(name, klasse, lvl, sex, weapon, str, con, intel);
		// TODO Auto-generated constructor stub
	}

	public Goblin(String name, String klasse, int lvl, int health, int magicPoints, int maxLife, boolean sex, int str,
			int con, int intel) {
		super(name, klasse, lvl, health, magicPoints, maxLife, sex, str, con, intel);
		// TODO Auto-generated constructor stub
	}

public Object createGoblin(){
		
		
		float healthVar= (float) (7.0+(10.0-7.0) * rand.nextFloat());
		float manaVar= (float) (1.0+(3.0-1.0) * rand.nextFloat());
		
	int A = rand.nextInt(3);
		switch(A){
		case 0:  

		Goblin goblin = new Goblin("Goblin","normal", 1, true,"spear", 10, 10, 8);
		goblin.setHPMP(healthVar, manaVar);
		
		return goblin;
		case 1:
		Goblin goblinClub = new Goblin("Goblin clubber", "brute", 1,true,"mace", 12, 12, 5);
		goblinClub.setHPMP(healthVar, manaVar);
		return goblinClub;
		case 2:  
		Goblin goblinShaman = new Goblin("Goblin Shaman", "mage", 1,false,"staff", 6, 10, 13);
		goblinShaman.setHPMP(healthVar, manaVar);
	
		goblinShaman.xpValue=132;
			
		return goblinShaman;
		case 3:
		Goblin goblinBoss = new Goblin("BigGob", "boss", 1,true,"axe", 14, 12, 5);
		goblinBoss.setHPMP(healthVar, manaVar);
		return goblinBoss;
		
		}
		return null;
		
		
	
	}

	public void warCry(){
	
	String [] cries ={"'RAKANISHU!'","'FOR THE BLOOD GOD!'","'FOR THE DARKNESS BELOW'"};
	super.warcry();
	System.out.println("\t"+cries[rand.nextInt(cries.length)]);
	
	}

}
