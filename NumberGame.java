import java.util.*;

class NumberGame
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Random ran = new Random();
        int n = ran.nextInt(100)+1;
        int score=5;
        int t=1;
        System.out.println("Guess the number");
        int x=s.nextInt();
        for(t=1;t!=0;t=t)
        {
            if(x==n)
            {
                System.out.println("You have find the correct number");
                System.exit(0);
            }
            else if(x<n)
            {
                score--;
                if(score==0)
                {
                    System.out.println("You failed the game");
                    System.out.println("To exit the game Press 0");
                    t=s.nextInt();
                    if(t==0)
                    {
                        System.exit(0);
                    }
                }
                System.out.println("Your guess is too low. Guess another number");
                x=s.nextInt();
            }
            else if(x>n)
            {
                score--;
                if(score==0)
                {
                    System.out.println("You failed the game");
                    System.out.println("To exit the game Press 0");
                    t=s.nextInt();
                    if(t==0)
                    {
                        System.exit(0);
                    }
                }
                System.out.println("Your guess is too high. Guess another number");
                x=s.nextInt();
            }
            
            
        }
    }
}
