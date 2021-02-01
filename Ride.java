//==AUTHORS:	Nazifa UMUTONI & Eloi Chrysanthe IRATANGA
//==PROJECT:	FINAL PROJECT
//==PROJECT TITLE:	RIDE
//==DESCRIPTION:	Creating a booking path using switch, inbuild packages & user defined packages


import java.util.*;
public class Ride{
	public static void main(String args[]){
		// Use of scanner since the client has to enter some details.
		Scanner input= new Scanner(System.in);
		int y,n,z=0;//declaration and initializations of integers to be used
		//Welcoming line
		System.out.println("WELCOME TO RIDE PLEASE BOOK YOUR NEXT RIDE");
		//User has to enter a name
		System.out.print("PLEASE ENTER YOUR NAME: ");
		String x = input.nextLine();
		//Payment modes that will be used has to be confirmed using 1 or 2
		System.out.println("PAYMENT METHOD");
		System.out.println("1. PAY NOW");
		System.out.println("2. TAP THE CARD ON BUS");
		n = input.nextInt();
		//===========SWITCH CASE========
		switch (n) {
			//The first case to discuss the option of paying now using tap&go
			case 1 :
			//The user will have to enter the last 8 initials of their tap and go so as to be charged for their fare.
			System.out.print("PLEASE ENTER THE LAST 8 NUMBERS OF YOUR TAP&GO: ");
			y=input.nextInt();
			//In order to be charged the user have to first confirm their  ride
			System.out.println("1. CONFIRM YOUR RIDE");
			z=input.nextInt();
			
			if(z==1){
				System.out.println("THANK YOU FOR BOOKING WITH US: " + x);
				//The user will see this alert to make them remember to reach their ride.
				System.out.println("GET ON THE BUS STOP 10 MINUTES BEFORE");
				System.out.println("DON'T MISS YOUR RIDE!");
			}
			//if the user does not confirm their ride, there wont be a fare charged and the process will stop
			else{
				System.out.println("YOUR BOOKING IS CANCELED " + x);
				System.out.println("PLEASE TRY AGAIN");
			}
			break;
			//the case 2 is the option of paying when the user has reached the bus as usual
			case 2 :
			System.out.println("TO CONFIRM YOUR RIDE " + x + " PLEASE GET ON THE BUS STOP 10 MINUTES BEFORE");
			System.out.println("DON'T MISS YOUR RIDE!");
			break;
			//default in case the user has entered the wrong number.
			default:
			System.out.println("PLEASE TRY AGAIN");
		}
	}
}
//=======================================THE END================================
