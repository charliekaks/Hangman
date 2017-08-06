import java.util.List;
import java.util.Random;
import java.util.Arrays;

public class Hangman{
  //the array that holds all the words in the game  
List<String> wordsToGuess = Arrays.asList("cow", "goat", "leopard","lion","otter","horse");
// intializing the random Object
    Random myRand = new Random();
    //Randomly picking a word from the array
    String wordPicked = wordsToGuess.get(myRand.nextInt(wordsToGuess.size()));
    String [] wordArray = wordPicked.split("");
    //the method that ensures tha a word is actually being gotten from the array.
    public String findWord(String select){
        return wordPicked;
    }
    //the method that replaces the words with blank dashes
   public String replaceWordWithDashes(String dashes) {
     String f = "";
       //Spliting the word into an array of strings
     String dashedWord[] =dashes.split("");
       for (int das = 0; das < dashedWord.length; das++) {
            dashedWord[das]="-";        
       }
        for(int fin=0; fin<dashedWord.length; fin++){
          //converting the array into a string
           f= f+ dashedWord[fin];
        }
          return f;
   }
        String nnn = replaceWordWithDashes(wordPicked);
        public Boolean replaceDashesWithCorrectGuess(String letter) {
          for (int indi = 0; indi < wordArray.length; indi++) {
            if (letter==wordArray[indi]) {
                wordArray[indi]=letter;
                
            }
          }
          
        }

   


}