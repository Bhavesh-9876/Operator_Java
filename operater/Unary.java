public class Unary{
   public static void main(String arr[]){
     System.out.println("**Unary operater**");
     int c,a=5,b=5;
     System.out.println("a="+a+"b="+b);
     System.out.println("Increment- pre and post");
      c=++a;
     System.out.println("pre-"+c);
      c=b++;
     System.out.println("post-"+c);
     System.out.println("Decrement- pre and post");
      c=--a;
     System.out.println("pre-"+c);
      c=b--;
     System.out.println("post-"+c);

   }
}