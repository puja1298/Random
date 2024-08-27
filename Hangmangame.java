import java.util.*;
import java.util.Random;

public class Hangmangame {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String[] words={"pooja","hangman","java","game","dreams"};
        Random random=new Random();
        String word=words[random.nextInt(words.length)];
        char[]guessedWord=new char[word.length()]; //array to store the guessed word
        int lives=6;

        for(int i=0; i<guessedWord.length;i++){
            guessedWord[i]='_';
        }

        while(lives>0){
            System.out.println("Guess a letter:");
            char guess=sc.next().charAt(0);  
        boolean correctGuess=false;
        for(int i=0;i < word.length();i++){
            if(word.charAt(i)==guess){
                guessedWord[i]=guess;
                correctGuess=true;
            }
        }
        if(!correctGuess){
            lives--;
            System.out.println("Incorrect! You have "+lives+" lives left.");
        }
        System.out.println(guessedWord);
        boolean won=true;
        for(char c:guessedWord){
            if(c =='_'){
                won=false;
                break;
            }
        }
        if(won){
            System.out.println("Congratulations! You won!");
            break;
        }
          }
          if(lives==0){
            System.out.println("Game over!The word was "+ word +".");
          }

    }
}
