
import javax.swing.*;
public class RealHang{
   private Output obj;
   private Input reader;
   private static final int maxlength = 6;
   private static final int maxgabimev = 7;
   private static final int madhsiaconsoles = 50;
   public RealHang(Output obj,Input r){
      this.obj=obj;
      this.reader=r;}

   public static void main(String[] args){
      Input a1 = new Input();
            Output obj = new Output(a1);
                  obj.printRules();


      System.out.println("Vendos fjalen qe deshironi ta gjeni (max i " + 
         maxlength+ " shkronjav): "); 
      while (a1.enterWord().length() == 0 || a1.enterWord().length() > maxlength) { 
         System.out.println("Gabim ne madhsin e shkronjav ! Vendos fjalen qe deshironi ta gjeni (max i " + 
            maxlength + " shkronjav): "); 
         break;
            
      }
      int numberGuessedWrong = 0; 
      int numberGuessedCorrectly = 0; 
      char[] word = new char[a1.enterWord().length()]; 
      for (int i = 0; i<word.length; i++) { 
         word[i] = '-'; 
      } 
      for (int i = 0; i<madhsiaconsoles; i++) { 
         System.out.println(" "); 
      } 
      obj.printRules();

      while (numberGuessedWrong < maxgabimev && 
      numberGuessedCorrectly < a1.enterWord().length()) { 
         String guessedCharacter = JOptionPane.showInputDialog("Posht ke ne konsoll rregullat \nSheno karakterin qe mendon se gjindet ne fjalen e kerkuar te shokut: ");
         while (guessedCharacter.length() == 0 || guessedCharacter.length() > 1) { 
            System.out.println("Only one character, please. Enter a character: "); 
            break;
         } 
      
         int matchedCharAt = a1.enterWord().indexOf(guessedCharacter); 
         if (matchedCharAt != -1) { 
            word[matchedCharAt] = guessedCharacter.charAt(0); 
            numberGuessedCorrectly++; 
         
            while (matchedCharAt != -1) { 
               matchedCharAt = a1.enterWord().indexOf(guessedCharacter, matchedCharAt+1); 
               if (matchedCharAt != -1) { 
                  word[matchedCharAt] = guessedCharacter.charAt(0);	
                  numberGuessedCorrectly++; 
               } 
            } 
            System.out.println("Good guess!: " + new String(word));
                                                
         } else { 
            numberGuessedWrong++; 
            switch(numberGuessedWrong){
            //switch case for each live case
            
               case (0):
                  obj.metoda0();
                  break;
               case (1):
                  obj.metoda1();
                  break;
               case (3):
                  obj.metoda3();
                  break;
               case (2):
                  obj.metoda2();
                  break;
               case (4):
                  obj.metoda4();
                  break;
               case (5):
                  obj.metoda5();
                  break;
               case (6):
                  obj.metoda6();
                  break;
               case (7):
                  obj.metoda7();
                  break;
            
            } 
         } 
         if (numberGuessedCorrectly == a1.enterWord().length()) { 
            System.out.println("Congratulations! You got: " + 
               a1.enterWord()); 
         }   }
   }}
