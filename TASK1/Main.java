package TASK1;
import java.util.*;
public class Main {
    private static final int MAXATMPTS = 5;
    private static final int LWERBND = 1;
    private static final int uprbnd= 100;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rdm = new Random();
        int score = 0;
        boolean playagain;
        do{
            int rdmno= rdm.nextInt(uprbnd -LWERBND +1 )+ LWERBND ;
            boolean guessedcorct = false;
            int atempts= 0 ;
            System.out.println("i have generated a random number between"+LWERBND +"and"+ uprbnd +".can you guess what it is?");
            while (atempts <    MAXATMPTS && ! guessedcorct){
                System.out.println("Enter you guess");
                int usrgues = sc.nextInt();
                atempts ++;
                if (usrgues == rdmno){
                    guessedcorct = true;
                    score ++;
                    System.out.println("the guess was correct in "+atempts+"attempts");
                } else if (usrgues < rdmno ) {
                    System.out.println("your number guess is low");
                }
                else {
                    System.out.println("your number is high");
                }
            }
            if(!guessedcorct){
                System.out.println("you have used all your attempts. the correct number was"+rdmno);
            }
            System.out.println("your current score is "+score);
            System.out.println("want to play again?(y/n)");
            playagain = sc.next().equalsIgnoreCase("y");

        }
        while (playagain);
        System.out.println("thank you for playing your final score is "+score);
        sc.close();
    }
}
