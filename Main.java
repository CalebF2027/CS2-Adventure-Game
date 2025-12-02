 import java.util.Scanner;
public class Main 
{
    public static void main(String []args) 
    {
        System.out.println("Starting a new adventure...\n");
        String command = ""; // stores the user's choices

        // STEP #1: Describe the current scenario
        System.out.println("You have arrived in the town of Silent Hill. There are monsters and zombies here, escape as fast as possible.");

        // STEP #2: Get user command
        command = getCommand("Do you go east (e) or north (n)?");

        // STEP #3: Select a path
        if (command.equals("e")) 
        {
            System.out.println("You have reached a house... You pick up a med kit and a pistol with 10 bullets.");
            command = getCommand("You see a purple medication. Do you take it? (y/n)");

            if (command.equals("y")) 
            {
                System.out.println("GAME OVER: The medication lowers your health and you slowly die. Press RUN to replay.");
            } 
            else if (command.equals("n")) 
            {
                System.out.println("The medication boosts you. You can now run very fast. Your pistol deals 10% more damage.");

                command = getCommand("Do you go south? (s)");

                if (command.equals("s"))
                {
                    System.out.println("You see a group of zombies. You shoot them all!");
                    command = getCommand("You see two paths: beach (r) or gate (l). Which do you choose?");
                    
                    if (command.equals("r")) 
                    {
                        System.out.println("GAME OVER: You didn't know how to swim and drowned. Press RUN to replay.");
                    }
                    else if (command.equals("l"))
                    {
                        System.out.println("You reach a gate and see a car.");

                        command = getCommand("Do you drive west (w) or east (x)?");

                        if (command.equals("w"))
                        {
                            System.out.println("Congratulations! You escaped to the city. YOU WIN!");
                            final String GREEN = "\u001B[32m";
                            final String RESET = "\u001B[0m";
                            System.out.println(GREEN + "You survived the adventure!" + RESET);
                        }
                        else if (command.equals("x"))
                        {
                            System.out.println("GAME OVER: A tsunami hits and you die. Press RUN to replay.");
                        }
                    }
                }
            }
        }
        else if (command.equals("n"))
        {
            System.out.println("You see an abandoned hotel. You go inside and sleep. You feel rested.");
        }
        else
        {
            System.out.println("GAME OVER: A monster knocks your gun away and kills you.");
        }
    }

    public static String getCommand(String prompt) 
    {
        System.out.println("\n▶︎▶︎▶︎ " + prompt);
        Scanner scan = new Scanner(System.in);
        return scan.next().toLowerCase();
    }
}
