import java.io.Console;
import java.util.Scanner;

public class Game
{
    private static void Play()
    {
        int length;
        String word;
        int lives=5;
        int count=0,prevCount=0;
        char guess;
        boolean isCorrect[];
        Scanner in=new Scanner(System.in);
        System.out.println("Hello Please enter a Name for the player to guess");
        word=in.next();
        length=word.length();
        isCorrect=new boolean[length];


        for (int i=0;i<length;i++)
        {
            System.out.print("_");
        }
        System.out.println();

        while (lives>0)
        {
            prevCount=count;
            System.out.println("Guess a Alphabet OR the whole word");
            guess=in.next().charAt(0);
            for (int i=0;i<length;i++)
            {
                if (guess==word.charAt(i))
                {
                    isCorrect[i]=true;
                    count++;
                }
                if (isCorrect[i])
                {
                    System.out.print(word.charAt(i));
                }
                else
                {
                    System.out.print("_");
                }

            }
            System.out.println();
            if (count==prevCount)
            {
                lives--;
            }else if(count==length)
            {
                break;
            }

        }
        if (count==length)
        {
            System.out.println("Congratzzz");
        }

    }

    public static void main(String[] args)
    {
        Play();
    }
}
