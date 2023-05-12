import java.util.Scanner;

//Design a game with one guesser , 3 players and 1 umpire. Number in between 0 to 10.

class Guesser
{

 int guessNum()
    {
    	int guessNum;
	Scanner scan= new Scanner(System.in);
	
	System.out.println("Guesser guess the number");
	
	guessNum = scan.nextInt();
	while(guessNum>10)
		
		
	{
		System.out.print("Invalid input! Please enter a number between 0 and 10: ");
		guessNum = scan.nextInt();
	return guessNum;
	    }
	return guessNum;
	
	}
	
}
   

class Player
{

   int guessNum()
    {
	
	Scanner scan= new Scanner(System.in);
	System.out.print("Player guess the number");
	
	int guessNum = scan.nextInt();
	
     while(guessNum>10)
		
		
	{
		System.out.print("Invalid input! Please enter a number between 0 and 10: ");
		guessNum = scan.nextInt();
	return guessNum;
	    }
	return guessNum;
	
}
   }

class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
  
    void collectNumFromGuesser()
    {
    	Guesser g= new Guesser();
    	numFromGuesser = g.guessNum();
    }
    
    void collectNumFromPlayers()
    {
    	Player p1= new Player();
    	Player p2= new Player();
    	Player p3= new Player();

    	numFromPlayer1 = p1.guessNum();
    	numFromPlayer2 = p2.guessNum();
    	numFromPlayer3 = p3.guessNum();
    }
    
    void compare()
    {
    if(numFromPlayer1==numFromGuesser)
    {
    	
    	if(numFromGuesser== numFromPlayer2 && numFromGuesser== numFromPlayer3)	
    		
    	{
    		System.out.print("All Players won the game");
    	}
    	 
    	 else if(numFromPlayer2==numFromGuesser)	
    	{
    		System.out.print("Player1 & Player 2 both won the game");
    }
    	
    	else if(numFromPlayer3==numFromGuesser)	
    		
    	{
    		System.out.print("Player1 & Player 3 both won the game");
    }
    		
    	else	
    	
    {
    	System.out.print("Player1 won the game");
    }
           }
    
    
    else if(numFromPlayer2==numFromGuesser)	
    {
    	if(numFromPlayer3==numFromGuesser)
    	{
   		System.out.print("Player2 & Player3 won the game");
    		
    	}
    	else
    {
    	System.out.print("Player2 won the game");
    }
       }
    else if (numFromPlayer3==numFromGuesser)	
    {
    	System.out.print("Player3 won the game");
    }
    else
    {
    	System.out.print("Game lost Try Again");
    }
      }
          }


public class game1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Umpire u = new Umpire();
u.collectNumFromGuesser();
u.collectNumFromPlayers();
u.compare();
	}

}
