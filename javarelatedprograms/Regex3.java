import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Regex2{
   public static void main(String args[]){
        final String regx_pattern = "^foo";
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






	/*fooabar
	foobbar
	foocbar      ----->Sample output
	foodbar
	foossbar
	fooabcdbar */