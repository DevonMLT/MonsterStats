import java.util.*;
import java.text.*;

public class MonsterMain {

	public static void main(String[] args) {

		String name;
		String type;
		String alignment;
		boolean friendly;
		int hitPoints;
		int armourClass;
		int speed;
		double xp;
		int getSpeed;
		
		Scanner input = new Scanner(System.in);

		System.out.println("What is your monster's name?");
		name = input.nextLine();
		
		System.out.println("What is your monster's type?");
		type = input.nextLine();
		
		System.out.println("What is your monster's alignment? Good, Neutral, Evil");
		alignment = input.nextLine();
		
		System.out.println("Is your monster friendly? True or False");
		friendly = input.nextBoolean();
		
		System.out.println("How many hit points does your monster have? 1 to 30");
		hitPoints = input.nextInt();
		
		System.out.println("What is your monster's armour class? 1 to 20");
		armourClass = input.nextInt();
		
		System.out.println("What is your monster's speed? Increments of 5 from 0 to 50");	
		speed = input.nextInt();
		
		System.out.println("How much experience points does your monster give?");
		xp = input.nextDouble();
		
		MonsterStats Monster = new MonsterStats(name, type, alignment, friendly, hitPoints, armourClass, speed, xp);
		Monster.mNameType();
		Monster.mFriendly();
		Monster.mHitPoints();
		Monster.mArmourClass();
		Monster.mSpeed();
		Monster.mXP();
		
	}

}
