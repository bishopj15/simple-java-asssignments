package theaterseating;
import java.util.*;

/**
 *
 * @author James Bishop
 */
public class TheaterSeating {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){
  	Scanner input = new Scanner(System.in);
		
                displaySeats();
		System.out.println("Select chose by type:");
		System.out.println("1: Select By Seat");
		System.out.println("2: Show Seats By price");
		System.out.println("3: Quit");
		System.out.println();
		
		int sel = input.nextInt();
		while(sel!=3){
			switch(sel){
				case 1: System.out.println("Enter row");
						int row = input.nextInt();
						System.out.println("Enter column");
						int col = input.nextInt();
						if(chooseSeat(row, col)){
                                                    System.out.println("Would you like to purchase ticket?");
                                                    System.out.println("1: YES");
                                                    System.out.println("2: NO");
                                                    int ans = input.nextInt();
                                                    buyTicket(ans, row, col);
						}
						break;
						
				case 2: System.out.println("Enter price");
						int price = input.nextInt();
						displaySeats(price);
						break;
						
				default: System.out.println("Invalid input");
			}
			
			System.out.println("Select chose by type:");
			System.out.println("1: Select By Seat");
			System.out.println("2: Show Seats By Price");
			System.out.println("3: Quit");
			sel = input.nextInt();
	   }
	}
	
    //row and column sizes
	final static int r = 8;
	final static int c = 10;
	
	static int[][] seats = {{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
				{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
				{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
				{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
				{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
				{20, 20, 30, 30, 40, 40, 30, 30, 20, 20},
				{20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
				{30, 40, 50, 50, 50, 50, 50, 50, 40, 30}
                                };
	
        //Check if choosen seat is available
	private static boolean chooseSeat(int row, int column){
		if(seats[row][column]==0){
                        displaySeats(row, column);
			System.out.println("Seat isn't available");
			return false;
		}
		else{
                        displaySeats(row, column);
			System.out.println("Seat available.");
			return true;
		}
	}
	
	
	private static void buyTicket(int answer, int row, int column){
		if(answer==1){
			seats[row][column]=0;
		}
		
	}
	
	private static void displaySeats(int price){
		System.out.println("   0  1  2  3  4  5  6  7  8  9 ");
                System.out.println("   -----------------------------");
		for(int i=0; i<r; i++){
			System.out.print(i + "| ");
			
			for(int j=0; j<c; j++){
				if(seats[i][j]==price){
					System.out.print(seats[i][j]+ " ");
				}
				else{
					System.out.print("   ");
				}
			}//end inner for
			System.out.println();
		}
	}
        
        private static void displaySeats(int row, int col){
		System.out.println("   0  1  2  3  4  5  6  7  8  9 ");
                System.out.println("   -----------------------------");
		for(int i=0; i<r; i++){
			System.out.print(i + "| ");
			
			for(int j=0; j<c; j++){
				if((i==row) && (j==col)){
					System.out.print(seats[i][j]+ " ");
				}
				else{
					System.out.print("X  ");
				}
			}//end inner for
			System.out.println();
		}
	}
        
        private static void displaySeats(){
		System.out.println("   0  1  2  3  4  5  6  7  8  9 ");
                System.out.println("   -----------------------------");
		for(int i=0; i<r; i++){
			System.out.print(i + "| ");
			for(int j=0; j<c; j++){
                            System.out.print(seats[i][j]+ " ");
			}//end inner for
			System.out.println();
		}
	}
	

}
