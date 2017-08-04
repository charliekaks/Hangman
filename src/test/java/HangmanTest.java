import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

public class HangmanTest{
    String [] wordsToGuess ={"cow", "goat", "leopard","lion","otter","horse"};

    Random myRand = new Random();
    String wordPicked = wordsToGuess[myRand.nextInt(wordsToGuess.length)];
    @Test
    public void findWord_itExpectsAWord_word(){
        Hangman testHangman = new Hangman();
        String expected =
        assertEquals();
    } 
}