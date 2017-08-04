import java.util.Random;

public class Hangman{
    String [] wordsToGuess ={"cow", "goat", "leopard","lion","otter","horse"};

    Random myRand = new Random();
    String wordPicked = wordsToGuess[myRand.nextInt(wordsToGuess.length)];
    public String findWord(){
        return wordPicked;
    }

}