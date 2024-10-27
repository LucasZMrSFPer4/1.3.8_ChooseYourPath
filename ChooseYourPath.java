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
    }
}