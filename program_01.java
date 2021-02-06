import java.util.*;
class abc{
//      int facto(int a,int res)
//      {
//          if(a==1)
//          {
//              return res;
//          }
         
//          return facto(a-1,res*a);
//      }
    int facto(int a)
    { int p=1;
       for(int i=1;i<=a;i++)
       {
           p=p*i;
       }
     return p;
    }
    public static void main(String[]args)
    {
        abc Math=new abc();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int show=Math.facto(n);
        System.out.println("The answer is:- "+show);
    }
}