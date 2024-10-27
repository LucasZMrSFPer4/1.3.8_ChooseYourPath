import java.util.Scanner;

public class ChooseYourPath
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose one of the 3 doors: Blue, Red, Green: ");
        String doorOfChoice = sc.nextLine();

        if (doorOfChoice.equals("Blue"))
        {
            System.out.print("Are you tired?");
            String s1 = sc.nextLine();
        }
    }
}