import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OldMacDonald extends PApplet {

//your variable declarations here
public void setup()
{
	//your java code here
	/*Cow c = new Cow("cow", "moo");
	System.out.println(c.getType() + " goes " + c.getSound());
	Pig p = new Pig("pig", "oink");
	System.out.println(p.getType() + " goes " + p.getSound());
	Chick h = new Chick("chick", "eep");
	System.out.println(h.getType() + " goes " + h.getSound());*/
	Farm cia =  new Farm();
	cia.animalSounds();
}
//declare classes and the interface below
interface Animal 
{
	public String getSound();
	public String getType();
}
class Cow implements Animal
{
	protected String myType;
	protected String mySound;
	public Cow(String type, String sound)
	{
		myType = type;
		mySound = sound;
	}
	public Cow()
	{
		myType = "Unknown";
		mySound = "unknown";
	}
	public String getType() {return myType;}
	public String getSound() {return mySound;}
}
class Pig implements Animal
{
	private String myType;
	private String mySound;
	public Pig(String type, String sound)
	{
		myType = type;
		mySound = sound;
	}
	public Pig()
	{
		myType = "Unknown";
		mySound = "unknown";
	}
	public String getType() {return myType;}
	public String getSound() {return mySound;}
}
class Chick implements Animal
{
	private String myType;
	private String mySound1;
	
	public Chick(String type, String sound1, String sound2)
	{
		myType = type;
		if (Math.random() < 0.5f) {
			mySound1 = sound1;
		} else {
			mySound1 = sound2;
		}
	}
	public Chick(String type, String sound)
	{
		myType = type;
		mySound1 = sound;
	}
	public Chick()
	{
		myType = "Unknown";
		mySound1 = "Unknown";
	}
	public String getType() {return myType;}
	public String getSound() {
			return mySound1;
	}
}
class Farm
{
	private Animal[] aBunchOfAnimals = new Animal[3];
	public Farm()
	{
		aBunchOfAnimals[0] = new NamedCow("cow", "Elise", "moo");
		aBunchOfAnimals[1] = new Pig("pig", "oink");
		aBunchOfAnimals[2] = new Chick("chick", "cheep", "cluck");
	}
	public void animalSounds() {
		for (int i = 0; i < aBunchOfAnimals.length; i++) {
			System.out.println(aBunchOfAnimals[i].getType() + " goes " + aBunchOfAnimals[i].getSound());
		}
		System.out.println("the named cow is known as " + ((NamedCow)aBunchOfAnimals[0]).getName()  );
	}
}
class NamedCow extends Cow
{
	private String myName;
	public NamedCow(String type, String name, String sound)
	{
		myType = type;
		myName = name;
		mySound = sound;
	}
	public String getName() {
		return myName;
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OldMacDonald" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
