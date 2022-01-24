import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Regex4{
   public static void main(String args[]){
        final String regx_pattern = "bar$";
        Pattern p = Pattern.compile(regx_pattern);
         try{
              FileReader fr = new FileReader("D:\\unix-learning\\javarelatedprograms\\Data2.txt");
              BufferedReader br = new BufferedReader(fr);
              String line;
                
                  while((line = br.readLine())!= null){
                        Matcher m = p.matcher(line);
                       if(m.find()){
                           System.out.println(line);
                       }
                   }
           br.close();
             } catch(IOException e){
                 e.printStackTrace();
           }
     }
} 
                  /* foobbar
                   foocbar
                  foossbar   ----->Sample output words that end with boo
                  fooabcdbar
                  foo bar   */


 
