import java.io.*;
import java.util.*;

public class montyhall {
    public static void main(String[] args) {
      	System.out.println("Hello, I am Monty Hall and welcome to 'Let's Make a Deal.' Here is our first contestant.");
		System.out.print("Welcome to the show.  Now, in front of you are three doors.  Behind two of these doors is a goat ");
        System.out.println("but behind the third door is a shiny new Jaguar. You may choose one of the doors. Which will it be : 1, 2, or 3?");
       	String playAgainY = "y";
        System.out.println("Would you like to run a simulation? 1 for yes");
        int simulation = input.nextInt();
        if (simulation == 1){
        	playAgainY = "n";
          	System.out.println("How many times do you want to run the simulation?");
          	int runNum = input.nextInt();
          	int wins = 0;
          	int losses = 0;
          	while (runNum > 0){
            	int doorJag = (int)(1+3*Random());
              	int choice = (int)(1+3*Random());
              	int randomOpen = (int)(1+3*Random());
              	while (choice == randomOpen{
                	int randomOpen = (int)(1+3*Random());
                }
                if (randomOpen == doorJag){
                	losses++
                }
                int switchDoor = (int)(1+3*Random());
                while (switchDoor = randomOpen || switchDoor == choice){
                	int randomOpen = (int)(1+3*Random());
                }
                if (switchDoor == doorJag){
                	wins++
                }
                runNum --;
            }
            System.out.print("The number of wins is "+wins);
        }              
        while (playAgainY.equals("y"){                   
      		int doorJaguar = (int)(1+3*Random());
          	//decide which door has Jag in i
        	int choice1 = input.nextInt(); //first selection of doors
        	int playAgain = changeDoor(choice1, doorJaguar);//call another method 
        	if (playAgain == 0){
        		System.out.print("Now do you want to keep door "+choice1);
          		System.out.println(", or do you want to switch? 1 for yes");
          		int choice2 = input.nextInt();
          		if (choice2==doorJaguar){
            		System.out.println("Congratulations! You won a Jaguar!");
            	} //end if
          	else{
            	System.out.println("Sorry, you got the goat.");
            } //end else
        }//end while
        System.out.println("Want to play again?");
        playAgainY = input.next();  
        } //end main                  
                   
    public static int changeDoor(int firstchoice, int doorJag){
      	int playAgain = 0;
    	System.out.println("Okay, you chose door "+firstchoice);
        System.out.print("But before I show you what is behind door "+choice1);
        System.out.println(", let's take a look behind door ");
      	int randomDoor = (int)(1+3*Random());//get a random door
      	while(randomDoor == firstchoice){
        	randomDoor = (int)(1+3*Random());
        }//end while
      	System.out.print(randomDoor);
      	if (randomDoor==doorJag){
        	System.out.print("Uh oh. Door "+randomDoor);
          	System.out.println(" has the Jaguar.");
            playAgain = 1;
        }//end if
        else{
        	System.out.print("That's right. Behind door "+randomDoor):
          	System.out.println(" is a goat.");
          	playAgain = 0;
        }//end else
      	return playAgain; 	
    } //end method                      
                           
}// end class