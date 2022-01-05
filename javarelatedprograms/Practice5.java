interface Sim{
    public void calling();
     public void datapack();
  }
  class Airtel implements Sim{
      public void calling(){
           System.out.println("Calling from Airtel Sim");
       }
          public void datapack(){
               System.out.println("using data of  Airtel Sim");
           }
       }
        class jio implements Sim{
             public void calling(){ 
                 System.out.println("calling from jio Sim");
             }
                public void datapack(){
                    System.out.println("using data of jio Sim");
                }
       } 
       class Practice5{
        public static void main(String args[]){
            Sim s = new jio();
              s.calling();
              s.datapack();
             }
    }
 
               /* Sample output :
                     calling from jio Sim
                     using data of jio Sim  */






       