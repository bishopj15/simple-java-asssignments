package rockpaperscissors;
import java.util.*;

/**
 *
 * @author James Bishop
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  Random rand = new Random();

	int compHand = rand.nextInt(3);
	int playerHand = 0;
	String data = "";
	
	System.out.println("Enter move. 'R' for rock, 'P' for paper, 'S' for scissors. 'Q' to quit.");
		
	data = input.next();
			
	while(!data.equals("Q")){
            compHand = rand.nextInt(3);
            playerHand = convertMoveToInt(data);
			
            findWinner(playerHand, compHand);
            
            displayScore();
            System.out.println("Enter move. 'R' for rock, 'P' for paper, 'S' for scissors. 'Q' to quit.");
            data = input.next();
	}//end while
    }   
    
     private static int playerScore;
     private static int computerScore;

    public static int convertMoveToInt(String temp){
	int hold =0;
		
	if(temp.equals("R") || temp.equals("r")){
            hold = 0;
        }
	else if(temp.equals("P") || temp.equals("p")){
            hold = 1;
	}
	else if(temp.equals("S") || temp.equals("s")){
            hold = 2;
	}
	else if(temp.equals("Q") || temp.equals("q")){
            hold = 4;
	}
	else{
            hold = 5;
	}
		
	return hold;
    }
                
  
    public static void findWinner(int player, int computer){
	if(player == 0 && computer == 2){
            System.out.println("Rock beats Scissors. Player wins");
            playerScore++;
	}
	else if(player == 2 && computer == 1){
            System.out.println("Scissors beats Paper. Player wins");
            playerScore++;
	} 
	else if(player == 1 && computer == 0){
            System.out.println("Paper beats Rock. Player wins");
            playerScore++;
	}	
	else if(player == 2 && computer == 0){
            System.out.println("Rock beats Scissors. Computer wins");
            computerScore++;
	}
	else if(player == 1 && computer == 2){
            System.out.println("Scissors beats Paper. Computer wins");
            computerScore++;
	} 
	else if(player == 0 && computer == 1){
            System.out.println("Paper beats Rock. Computer wins");
            computerScore++;
	}
	else if(player == computer){
            System.out.println("Chose the same hand. Tie!");
	}
	else if(player == 4){
            System.out.println("Thanks for playing!");
	}
	else{
            System.out.println("Invalid Input.");
	} 
    }
    
    public static void displayScore(){
        System.out.println("Player Score: " + playerScore + "  Computer Score: " + computerScore);
    }
       
 }
    
