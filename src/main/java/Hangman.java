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
    char [] wordArray = wordPicked.toCharArray();
    //the method that ensures tha a word is actually being gotten from the array.
    public String findWord(String select){
        return wordPicked;
    }
    //the method that replaces the words with blank dashes
   public String replaceWordWithDashes(String dashes) {
     String f = "";
       //Spliting the word into an array of strings
     char dashedWord[] =dashes.toCharArray();
       for (int das = 0; das < dashedWord.length; das++) {
            dashedWord[das]='-';        
       }
        for(int fin=0; fin<dashedWord.length; fin++){
          //converting the array into a string
           f= f+ dashedWord[fin];
        }
          return f;
   }
        
        //function that loops through the picked word and replacing it with a correct guess
        public String replaceDashesWithCorrectGuess(char letter) {
          //converting the dashed word to an array to enable looping
        char[] correctWord=replaceWordWithDashes(wordPicked).toCharArray();
          for (int correctges = 0; correctges < wordArray.length; correctges++) {
            if(wordArray[correctges]==letter){
                correctWord[correctges] = letter;
            }   
          }
          String fina="";
          for (int fin = 0; fin < correctWord.length; fin++) {
             fina = fina+correctWord[fin];
          }
            return fina;
        }
       

   


}