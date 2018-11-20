import java.util.Random;
import java.util.Scanner;
public class MontyHallProblem 
{

	public static void main(String[] args) 
	{
	Random rand = new Random();
	Scanner keyboard = new Scanner (System.in);
	System.out.println("please enter the door you would like to choose: ");
	int guessDoor = keyboard.nextInt();
	int carDoor=rand.nextInt(3) + 1;
	System.out.println("The car was behind  " + carDoor);
	if (carDoor == guessDoor)
	{
		System.out.println("You Won");
	}
	else
	{
		System.out.println("you lost");
	}
	}
	
	

}
