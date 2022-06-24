import java.io.Serializable;
import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type anything to start");
        scan.nextLine();
        System.out.println("Great, here are the rules:\n");
        System.out.println(" - If you roll a 6 the game stops.");
        System.out.println(" - If you roll a 4 nothing happens.");
        System.out.println(" - Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll:");
       int score = 0;

        while (true){
           scan.nextLine();
            int diceRoll = rollDice();
            System.out.println("You rolled a " + diceRoll + ". ");
            if (diceRoll == 6){
                System.out.println("End of game.");
                break;
            } else if (diceRoll == 4){
                System.out.println("Zero Points. Keep Rolling");
            } else {
                score++;
                System.out.println("One point. Keep rolling");
            }
        }
        System.out.println("Your final score is : " + score);

      if (score >=3 ){
          System.out.println("Wow. That's lucky. You win!");

      } else {
          System.out.println("Tough luck, you lose :c");
      }
      
     scan.close();

    }

    public static int rollDice (){
        return (int) (Math.random() * 6 + 1);
    }
  
  
}
