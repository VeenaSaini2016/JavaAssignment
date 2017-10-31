import java.util.Scanner;

class JavaPractice
{
  public static void main(String args[])
{
   Scanner scan=new Scanner(System.in);

   String s= scan.nextLine();  
   String newS=s;
   int l=s.length();
      for(int i=1;i<l;i++)
       {
           String Temp=s.substring(1,l);
           Temp=Temp+s.charAt(0);
           newS=newS+" , "+Temp;
           s=Temp;
           
       }  

     System.out.println(newS);     
          
   }

}
