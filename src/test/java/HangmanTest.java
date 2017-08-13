import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;
import java.util.Arrays;
import java.util.List;

public class HangmanTest{

    List<String>  wordsToGuess= Arrays.asList("cow", "goat", "leopard","lion","otter","horse");

     Random myRand = new Random();
     String word = wordsToGuess.get(myRand.nextInt(wordsToGuess.size()));
   
    @Test
    public void findWord_itExpectsAWord_word(){
        Hangman testHangman = new Hangman();
        String expected= testHangman.findWord(wordsToGuess.get(myRand.nextInt(wordsToGuess.size())));
        assertEquals(true, wordsToGuess.contains(expected));
    } 
    @Test
    public void replaceWordWithDashes_itExpectsDashes_dash(){
        Hangman testHangman = new Hangman();
        String expected2 = "-------"; 
        assertEquals(expected2,testHangman.replaceWordWithDashes("moringa"));
    }
    @Test
    public void replaceTheDashesWithLetters_dashedword(){
       Hangman testHangman = new Hangman();
       String expected = "-o-";
       assertEquals(expected, testHangman.replaceTheDashesWithLetters('o',"cow")); 
    }
    @Test
    public void replaceTheDashesWithLetters_atAllInstances_dashedword(){
       Hangman testHangman = new Hangman();
       String expected = "-tt--";
       assertEquals(expected, testHangman.replaceTheDashesWithLetters('t',"otter")); 
    }
    @Test
    public void skipTheletterandGiveAStatement_dashedword(){
       Hangman testHangman = new Hangman();
       String expected = "-tt--";
       assertEquals(expected, testHangman.replaceTheDashesWithLetters('t',"otter")); 
    }
}
    