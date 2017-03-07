import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by dfreer on 3/7/2017.
 */
public class Hangman735 {
    ArrayList<String> allWords = new ArrayList<>();
    TreeSet<String> guessedWords = new TreeSet<>();
    String curWord = "";
    public Hangman735(){
        try  {
            FileReader fr = new FileReader("words.txt");
            Scanner s = new Scanner(fr);
            while(s.hasNext())
            {
                allWords.add(s.next());
            }
        }
        catch (FileNotFoundException fe){
            fe.printStackTrace();
        }
        Random random =  new Random(System.currentTimeMillis());
        curWord = allWords.get(random.nextInt(allWords.size()));
        //Check to see if we've already guessed this word before?
    }

    public boolean makeGuess(){
        System.out.println("What letter do you guess?");
        Scanner s = new Scanner(System.in);
        String guess = s.next();
/*
        for(String x : guessedWords){
            System.out.println("All guessed letters:" + x);
        }

        */
        while(guessedWords.contains(guess)){
            System.out.println("You've already guessed that!");
            System.out.println("What letter do you guess?");
            guess = s.next();
        }
        guessedWords.add(guess);
        String toShow = initialGuess().toString();
        //System.out.println(curWord);
        String [] allLetters = curWord.split("");
        for(String a : allLetters){
            if(guessedWords.contains(a)){
                System.out.print(a);
            }
            else
                System.out.print("*");
        }
        System.out.println("");
        for(int i = 0; i < allLetters.length; i++){
            if(!guessedWords.contains(allLetters[i]))
                return false;
        }
        return true;
    }

    public StringBuilder initialGuess(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < curWord.length(); i++){
            sb.append("*");
        }
        return sb;
    }

    public static void main(String[] args) {
        Hangman735 hangman735 = new Hangman735();
        while(!hangman735.makeGuess()){

        }
    }


}
