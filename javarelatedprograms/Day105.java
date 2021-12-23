class Day105{
public static void main(String args[]){
       String name = "Sindhu"; 
      String str2 = String.format("%d",101);
      String str3= String.format("name is %s",name);
      String str4 = String.format("|%-5d|",100);
     String str5 = String.format("|%d|",100);
       String str6 = String.format("|%010d|",100);
      System.out.println(str6); 
      System.out.println(str5); 
     System.out.println(str2);
     System.out.println(str3);
     System.out.println(str4);
     }
}
       /*   sample output ---->|0000000100|
                            |100|
                             101
                      name is Sindhu
                          |100  | */