import javax.swing.*;
public class Input{
   private static final int maxlength = 7;
   public String a = "";
   public Input(){
      this.a= JOptionPane.showInputDialog("Sheno fjalen qe deshiron ta qelloj shoku juaj: ");}

   public String enterWord(){
           
      return a; }
      
      public int StringLength(){
      return a.length();}}