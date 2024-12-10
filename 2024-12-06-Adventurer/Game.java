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
      if(action.equals("quit")){
        System.out.println("byeee");
        break;
      }
      else if(action.equals("a") || action.equals("attack")){
        System.out.println(player.attack(enemy));
      }
      else if(action.equals("sp") || action.equals("special")){
        System.out.println(player.specialAttack(enemy));
      }
      else if(action.equals("su") || action.equals("support")){
        System.out.println(player.support());
      }
      else {
        System.out.println("invalid input!");
      }

      if(enemy.getHP() > 0){
        System.out.println();
        System.out.println("Enemy's turn!");
        int raction = (int) (Math.random() * 3);
        if(raction == 0){
          System.out.println(enemy.attack(player));
        }
        else if(raction == 1){
          System.out.println(enemy.specialAttack(player));
        }
        else {
          System.out.println(enemy.support());
        }
      }
      System.out.println();
    }
    if(player.getHP() <= 0){
      System.out.println("You lost!");
    }
    if(enemy.getHP() <= 0){
      System.out.println("You won!");
    }
  }
  
}
