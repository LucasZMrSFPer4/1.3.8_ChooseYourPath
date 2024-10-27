import java.util.Scanner;

public class ChooseYourPath
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("You've just came out of work and ran into three doors!");
        System.out.print("Choose one of the 3 doors: Blue, Red, Green: ");
        String doorOfChoice = sc.nextLine();

        if (doorOfChoice.equals("Blue"))
        {
            System.out.print("Are you tired? (true or false): ");
            boolean b1 = Boolean.parseBoolean(sc.nextLine());

            if (b1)
            {
                System.out.print("You've decided to go home.");
            }
            else
            {
                System.out.print("You've decided to go to your friends house.");
                System.out.print("Choices: \n1. Watch a movie\n2. Play video games\n3. Go to the gym\n");
                String actionOfChoice = sc.nextLine();

                if (actionOfChoice.equals("1"))
                {
                    System.out.print("You've decided to watch a movie.");
                }
                else if (actionOfChoice.equals("2"))
                {
                    System.out.print("You've decided to play video games.");
                }
                else
                {
                    System.out.print("You've decided to go to the gym.");
                }
            }
        }

        else if (doorOfChoice.equals("Red"))
        {
            System.out.print("Are you thirsty? (true or false): ");
            boolean b1 = Boolean.parseBoolean(sc.nextLine());

            if (!b1)
            {
                System.out.print("You've decided to go home.");
            }
            else
            {
                System.out.print("You've decided to go to the bar.");
                System.out.print("Alcohol Choices: \n1. Beer\n2. Wine\n3. Tequila\n");
                String actionOfChoice = sc.nextLine();

                if (actionOfChoice.equals("1"))
                {
                    System.out.print("You've decided to drink beer.");
                }
                else if (actionOfChoice.equals("2"))
                {
                    System.out.print("You've decided to drink wine.");
                }
                else
                {
                    System.out.print("You've decided to drink tequila.");
                }
            }
        }

        else
        {
            System.out.print("Are you hungry for money? (true or false): ");
            boolean b1 = Boolean.parseBoolean(sc.nextLine());

            if (!b1)
            {
                System.out.print("You've decided to go home.");
            }
            else
            {
                System.out.print("You've decided to go to the casino.");
                System.out.print("Game Choices: \n1. Blackjack\n2. Poker\n3. Roulette\n");
                String actionOfChoice = sc.nextLine();

                if (actionOfChoice.equals("1"))
                {
                    System.out.print("You've decided to play Blackjack.");
                }
                else if (actionOfChoice.equals("2"))
                {
                    System.out.print("You've decided to play Poker.");
                }
                else
                {
                    System.out.print("You've decided to play Roulette.");
                }
            }
        }
    }
}