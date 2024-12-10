import java.util.Scanner;
public class Game{
  public static void main(String[] arg){
    CodeWarrior enemy = new CodeWarrior("Jack", 100);
    Persona player = new Persona("Joker", 100, 120);

    Scanner userInput = new Scanner(System.in);
    System.out.println("Start!");
    System.out.println();
    while(player.getHP() > 0 && enemy.getHP() > 0){
      System.out.println(player.getName() + ": " + player.getHP() + "/" + player.getmaxHP() + " HP, " + player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecialName());
      System.out.println(enemy.getName() + ": " + enemy.getHP() + "/" + enemy.getmaxHP() + " HP, " + enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecialName());
      System.out.println();

      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String action = userInput.nextLine();
    }
  }
}
