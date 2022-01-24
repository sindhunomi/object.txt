import java.util.*;
class Anagram{
       public static boolean isAnagram(String str1,String str2){
             if(str1.length()!=str2.length())
                 return false;
                 char ch1[] = str1.toCharArray();
                 char ch2[] = str2.toCharArray();       
                Arrays.sort(ch1);
                Arrays.sort(ch2);
              boolean result = Arrays.equals(ch1,ch2);
              return result;
           }
                public static void main(String args[]){
                    String str1 = "ink";
                    String str2 = "kin";
                        Anagram.isAnagram(str1,str2);
                        if(isAnagram( str1,str2)){
                             System.out.println("yes they are anagrams");
                         } else {
                             System.out.println("no they are not anagrams");
                    }
              }             
     }     
      








 
       
             
             