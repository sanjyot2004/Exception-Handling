public class Arith
{

      public static void main(String args[]){
      int a,b,c;
                        try{
                                a=100;
                                 b=0;
                                 c=a/b;
                                System.out.println("Division is :"+c);
                        }
                        catch(ArithmeticException e){
                                System.out.println("Division can not be happen");
                        }
                       try{
                                 int arr[]={1,2,3,4,5};
                                 System.out.println("22th no. is "+arr[22]);
                       }
                        catch(ArithmeticException e){
                                System.out.println("can not get 22th no.");
                        }
                       
                        
                        
      }


}