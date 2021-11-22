class Lion
{
//states 
String colour;
double weight;
double height;
String petname;
public Lion(String colour,double weight,double height,String petname)
{
 this.colour=colour;
 this.weight=weight;
 this.height=height;
 this.petname=petname;
}
}
public class EX2
{
public static void main(String args[])
 {
Lion l = new Lion("greyish-yellow",100.0,3.8,"boobo");
System.out.println(l.colour);
System.out.println(l.weight);
System.out.println(l.height);        
System.out.println(l.petname);
     }
   }

