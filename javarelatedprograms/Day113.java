import java.io.*;
class Day113{
       public static void findFile() throws IOException{
       File newFile =new File("hari.txt");
       FileInputStream stream = new FileInputStream(newFile);
     }  
       public static void main(String args[]){
          try {
          findFile();
         }
       catch(IOException e ){
          System.out.println(e);
         }
       }
    } 
  
        
          
