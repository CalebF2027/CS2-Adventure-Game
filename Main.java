 import java.util.Scanner;
 public class Main 
 {
    public static void main(String []args) 
    {
       System.out.println("Starting a new adventure...\n");
       String command = ""; // stores the user's choices

      // STEP #1: Describe the current scenerio
      System.out.println("You have arrived in the town of Silent Hill. There are monsters and zombies here, escape as fast as possible.");
      // STEP #2: Get user command
      command = getCommand("Do you go east (e) or north (n)?");
      // STEP #3: Select a path based on the user's command
      if ( command.equals("e") ) 
         {
         // NEXT BRANCH...
         System.out.println("You have reached a house... You pick up a med kit and a pistol with 10 bullets.");
         command = getCommand("You see a purple medication. You think it could help you and give you powers. Do you take it? (y/n)");
          if (command.equals("y"))
         {
            System.out.println("The medication lowers your health, and makes it hard for you to wali.");
        }
         else if (command.equals("n"))
         {
            System.out.println("The medication boosts you. You can now run at very fast speeds, and the pistol deals 10% more damage.");
         }
      }
      else if ( command.equals("n") ) {
         System.out.println("You see an abaonded hotel. You go inside and sleep, you are rested.");
      }
      else {
         System.out.println("GAME OVER: Oh no! Your gun was knocked out of your hand by a monster, and you were killed. Press RUN to replay.");
      }




       
    } // END OF MAIN METHOD
    
    /** Method to prompt & process input for the next command
      * @param prompt to display to user, asks for specific input
      * @return user's input command as a lowercase String
    */
    public static String getCommand(String prompt) 
    {
       System.out.println("\n▶︎▶︎▶︎ " + prompt);
       Scanner scan = new Scanner(System.in);
       String command = scan.next().toLowerCase();
       scan.close();
       return command;
    } // END OF METHOD
 } // END OF CLASS
