package fizzbuzz;

/**
 *
 * @author James Bishop
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0; i<=100; i++){
  		
			if(i%3==0 && i>2 && i%5!=0){
				System.out.println("Fizz");
			}
			else if(i%5==0 && i>4 && i%3!=0){
				System.out.println("Buzz");
			}
			
			else if(i%3==0 && i%5==0 && i>3){
				System.out.println("FizzBuzz");
			}
			else{
				System.out.println(i);
			}
		}
    }
}
