import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;   
class Regex1{
       public static void main(String args[]){           
            final String regex_pattern ="fooa*bar"; 
            Pattern s = Pattern.compile(regex_pattern);   //converting normal String into RegExPattern 
             try{
                     FileReader fr = new FileReader("D:\\unix-learning\\javarelatedprograms\\Data1.txt"); // reads the file 
                     BufferedReader br = new BufferedReader(fr);      // takes file as an input
             String line;
               
                    while((line = br.readLine()) !=null){
                           Matcher m = s.matcher(line) ;
                     if(m.find()){
                              System.out.println(line);
                      }
                 }
          br.close();
            }     catch (IOException e){
                   e.printStackTrace();
            }
       }
}
              /* fooaaaabar
                fooaabar            ----->Sample output
                fooabar
                 foobar    */




                     
                     
      