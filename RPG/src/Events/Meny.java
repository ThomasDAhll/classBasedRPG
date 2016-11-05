package Events;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Abilities.Magic;
import Creature.Hero;
import Creature.Library;

public class Meny{
	Library lib = new Library();


	static Scanner in = new Scanner(System.in);


	public int menuChoice(){
		String A= "------------------------------------ \n\t What would you like to do now?";
		String B ="1. Continue fighting";
		String C ="2. Check Inventory and Stats";
		String D ="3. Exit dungeon";

		int Choice = switcher(A,B,C,D, null);
		return Choice;
	}
	public int menuChoice(String A, String B, String C, String D, String E){
		int Choice = switcher(A,B,C,D, E);
		return Choice;
	}


	public int menuFight(Hero a){
		boolean again = true;
		while(again){
		String A= "------------------------------------ \n\t What would you like to do now?";
		String B ="1. Hit the enemy";
		String C ="2. Use Ability";
		String D ="3. Chug Health Potion";
		String E ="4. Run Away!";

		int Choice = switcher(A,B,C,D,E);
		if(Choice==2){
			
			int back = menuAbility(a)+10;
			if(back !=-1)
			{	
				return back;
			}else again = true;
		
		}else again = false;
			return Choice;
		}
		return 0;
	}

	public int menuAbility(Hero a)
	{
		 
		System.out.println("------------------------------------");
		if(a.getKlasse().equals("mage"))
		{
			int y = 1;
			ArrayList <Magic> list= lib.createFire(a, a);
			String Liste[] = new String[list.size()+1];
			Liste[list.size()]="\t"+(list.size()+1)+". BACK";
			
			for(int i=list.size()-1; i>=0; i--)
			{
				
				Liste [i] ="\t"+(y)+". "+list.get(i).getName()+" "+list.get(i).getManaCost()+"MP";	
				y++;
					
			}
			int Choice = listToChoice(Liste, list.size()+1);
			
			if(Choice == list.size()+1)
			{
				menuFight(a);
				return -1;
			}
			else 
			{
				return Choice;
			}
		}
		System.out.println("Returnerer 0!");
		return 0;
	}
		

	
	private int listToChoice(String[] a, int i){
		boolean again = true;
		while(again)
		{
		
			 
					
			for(int teller = a.length-2; teller>=0; teller--)
			{
				System.out.println(a[teller]);
			}
			
			System.out.println(a[a.length-1]);
			
			int answer = in.nextInt();
			if(answer == i)
			{
				again = false;
				return i;
			}
			else if(answer > i || answer < 1)
			{
				again = true;
			}
			else
			{
				again = false;
				return answer;
			}
		}
		return 0;
		
	}

	private int switcher(String A, String B, String C, String D, String E){

		boolean again= true;
		while (again){
			if(E== null&& D==null){
				System.out.println("\n"+A+"\n\t"+B+"\n\t"+C);
			}
			else if(E ==null){
				System.out.println("\n"+A+"\n\t"+B+"\n\t"+C+"\n\t"+D);
			}
			else{
				System.out.println("\n"+A+"\n\t"+B+"\n\t"+C+"\n\t"+D+"\n\t"+E);
			}

			System.out.println("\n\t Enter choice:");	
			again= false;
			int answer = in.nextInt();

			switch(answer){
				case 1: return 1;
				case 2: return 2;
				case 3: if(D==null){ again=true; break;}else{return 3;} 
				case 4: if(E==null){ again=true; break;}else{return 4;} 
				default: again=true;
			
			}
		}
		return 0;

	}



	public String nameGen(){
		String names[]={"DouchyMcDouchyFace","Tranny-Nanny", "Fartknuckler", "the Internal Combustor", 
				"the ShawShank Rectum", "Danceswithbrooms","Explorer of butt-caves","Keen Lee"};
		Random rand = new Random();
		int i = rand.nextInt(names.length);

		System.out.println("\n \t what is your name warrior? ");

		String name = in.nextLine();
		name = name +" " +names[i];
		return name;
	}



	public  boolean welcome(String name){

		boolean running=true;


		System.out.println("\n \t WELCOME TO THE DUNGEON");
		System.out.println("\n \t Are you ready Sir "+name);
		String yesorno =in.nextLine();
		if ("yes". equalsIgnoreCase(yesorno)){
			System.out.println("\n \t WELCOME TO THE DUNGEON");
		}
		else{
			System.out.println("\n \t Then bye bye then!");
			running = false;
		}
		return running;
	}








}
