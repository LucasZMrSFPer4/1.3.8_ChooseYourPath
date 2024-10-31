import java.util.Scanner;

public class ChooseYourPath
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); // creates new scanner

        System.out.println("You've just came out of work and ran into three doors!");
        System.out.print("Choose one of the 3 doors: Blue, Red, Green: "); // asks the user to choose a door
        String doorOfChoice = sc.nextLine();

        if (doorOfChoice.equals("Blue")) // if user chose blue
        {
            System.out.print("Are you tired? (true or false): "); // asks the user if he/she is tired
            boolean b1 = Boolean.parseBoolean(sc.nextLine());

            if (b1) // if user is tired
            {
                System.out.print("You've decided to go home.");
            }
            else // if user isn't tired
            {
                System.out.println("You've decided to go to your friends house.");
                System.out.print("Choices: \n1. Watch a movie\n2. Play video games\n3. Go to the gym\n"); // asks user what to do in friend's house
                String actionOfChoice = sc.nextLine();

                if (actionOfChoice.equals("1")) // if user wants to watch a movie
                {
                    System.out.print("You've decided to watch a movie.");
                }
                else if (actionOfChoice.equals("2")) // if user wants to play video games
                {
                    System.out.print("You've decided to play video games.");
                }
                else // if user wants to go to the gym
                {
                    System.out.print("You've decided to go to the gym.");
                }
            }
        }

        else if (doorOfChoice.equals("Red")) // if user chose red
        {
            System.out.print("Are you thirsty? (true or false): "); // asks the user if thirsty or not
            boolean b1 = Boolean.parseBoolean(sc.nextLine());

            if (!b1) // if user is not thirsty
            {
                System.out.print("You've decided to go home.");
            }
            else // if user is thirsty
            {
                System.out.println("You've decided to go to the bar.");
                System.out.print("Alcohol Choices: \n1. Beer\n2. Wine\n3. Tequila\n"); // asks user what to drink
                String actionOfChoice = sc.nextLine();

                if (actionOfChoice.equals("1")) // if user wants to drink beer
                {
                    System.out.print("You've decided to drink beer.");
                }
                else if (actionOfChoice.equals("2")) // if user wants to drink wine
                {
                    System.out.print("You've decided to drink wine.");
                }
                else // if user wants to drink tequila
                {
                    System.out.print("You've decided to drink tequila.");
                }
            }
        }

        else // if user chose green
        {
            System.out.print("Are you hungry for money? (true or false): "); // asks the user if hungry for money or not
            boolean b1 = Boolean.parseBoolean(sc.nextLine());

            if (!b1) // if user is not hungry for money
            {
                System.out.print("You've decided to go home.");
            }
            else // if user is hungry for money
            {
                System.out.println("You've decided to go to the casino.");
                System.out.print("Game Choices: \n1. Blackjack\n2. Poker\n3. Roulette\n"); // asks user what casino game to play
                String actionOfChoice = sc.nextLine();

                if (actionOfChoice.equals("1")) // if user wants to play Blackjack
                {
                    System.out.print("You've decided to play Blackjack.");
                }
                else if (actionOfChoice.equals("2")) // if user wants to play Poker
                {
                    System.out.print("You've decided to play Poker.");
                }
                else // if user wants to play Roulette
                {
                    System.out.print("You've decided to play Roulette.");
                }
            }
        }
    }
}