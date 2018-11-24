import java.util.Random;
import java.util.Scanner;
public class MontyHall
{

	public static void main(String[] args) 
	{
	Random rand = new Random();
	Scanner keyboard = new Scanner (System.in);
	System.out.println("please enter the door you would like to choose: ");
	int guessDoor = keyboard.nextInt();
	int carDoor=rand.nextInt(3) + 1;
	System.out.println("You chose door " + guessDoor);
	int sameDoor = (carDoor % 3) + 1;
	int remainingDoor = 6 - (carDoor + guessDoor);
	if (carDoor != guessDoor)
	{
		System.out.println("there is a goat behind door " + remainingDoor);
	}
	else
	{
		System.out.println("There is a goat behind door " + sameDoor);
	}
	System.out.print("would you like to switch doors: ");
	String switchAnswer = keyboard.next();
	
	if (switchAnswer.equals("yes"))
	{
		if (carDoor == 6-guessDoor-remainingDoor)
		{
			System.out.println("You won");
		}
		else
		{
			System.out.println("You lost");
		}
	}
	if (switchAnswer.equals("no"))
	{
		if (carDoor == guessDoor)
		{
			System.out.println("You won");
		}
		else
		{
			System.out.println("you lost");
		}
	}
	
	
	
	
	}
}

