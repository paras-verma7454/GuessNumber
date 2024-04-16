import java.util.Scanner;
public class GuessNumber {

    public static void main(String[] args){
            Scanner Sc = new Scanner(System.in);
            int NoOfGuess=10;
            int no = ((int)(Math.random()*100+1));
            System.out.println("Guess number");
            do{
                int guess = Sc.nextInt();
                
                if (guess==no) {
                    System.out.println("You Won");
                    break;
                    
                }
                else if (guess<no) {
                    System.out.println("Think bigger");
                }
                else if (guess>no) {
                    System.out.println("Think smaller");
                }
                NoOfGuess--;
                if (0==NoOfGuess) {
                    System.out.println("You Lost");
                    break;
                    
                }
            }
            while(true);
            Sc.close();



    }
}
