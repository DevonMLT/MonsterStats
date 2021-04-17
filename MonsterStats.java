import java.util.*;
import java.text.*;

public class MonsterStats {
	
	String name;
	String type;
	String alignment;
	boolean friendly;
	int hitPoints;
	int armourClass;
	int speed;
	double xp;
	
	public MonsterStats(String name, String type, String alignment, boolean friendly, int hitPoints, int armourClass, int speed, double xp) {
		this.name = name;
		this.type = type;
		this.alignment = alignment;
		this.friendly = friendly;
		this.hitPoints = hitPoints;
		this.armourClass = armourClass;
		this.speed = speed;
		this.xp = xp;
	}
	
		void mNameType() {
			System.out.println("\n" + this.name + " / " + this.alignment + " / " + this.type);
		}
		void mFriendly() {
			if (friendly == true) {
				System.out.println(this.name + " is a friendly monster.");
			}
			else {
				System.out.println(this.name + " is not friendly.");
			}			
		}
		void mHitPoints() {
			switch (hitPoints) {
			case 1,2,3,4,5,6,7,8,9:
				System.out.println(this.name + " has " + this.hitPoints + " hit points. It's a weak monster.");
				break;
			case 10,11,12,13,14,15,16,17,18,19:
				System.out.println(this.name + " has " + this.hitPoints + " hit points. It's a normal monster.");
				break;
			case 20,21,22,23,24,25,26,27,28,29:
				System.out.println(this.name + " has " + this.hitPoints + " hit points. It's a strong monster.");
				break;
			case 30:
				System.out.println(this.name + " has " + this.hitPoints + " hit points. It's a deadly monster.");
				break;
			default:
				System.out.println(this.name + " health has yet to be drained by the warriors.");
			}
		}
		void mArmourClass() {
			switch (hitPoints) {
			case 1,2,3,4,5,6,7,8,9,10:
				System.out.println(this.name + " has an armour class of " + this.armourClass + ". It's a soft monster.");
				break;
			case 11,12,13,14,15,16,17,18,19,20:
				System.out.println(this.name + " has an armour class of " + this.armourClass + ". It's a tough monster.");
				break;
			default:
				System.out.println(this.name + " armour class has yet to be broken by the warriors.");
			}
		}
		void mSpeed() {
			System.out.println(this.name + " has a movement speed of " + this.speed + " ft.");
			
		}
		void mXP() {
			System.out.println(this.name + " gives " + this.xp + " experience points.");
		}
}
