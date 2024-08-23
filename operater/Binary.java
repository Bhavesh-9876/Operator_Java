public class Binary{
    public static void main(String arr[]){
        //Binary operater Types
        System.out.println("**Binary operater**");
        int a=10,b=20,c,e=25;
        
           //Arithmetic operater
           System.out.println("   ");
           System.out.println("**Arithmetic operater**");
           System.out.println("   ");
           c=a+b;
           System.out.println("Addition a+b:"+c);
           c=a-b;
           System.out.println("Subtaction a-b:"+c);
           c=a*b;
           System.out.println("Multipilecation a*b:"+c);
           c=a/b;
           System.out.println("Divided a/b:"+c);
           c=a%b;
           System.out.println("Moduler a%b:"+c);


           //Relation operater
           boolean d;
           a=1;
           b=0;
           System.out.println("   ");
           System.out.println("**Relation operater**");
           System.out.println("   ");
           d=(a==b);
           System.out.println("Equal to a==b:"+d);
           d=(a>b);
           System.out.println("Greater than a>b:"+d);
           d=(a<b);
           System.out.println("Less than a<b:"+d);
           d=(a!=b);
           System.out.println("Not equal to a!=b:"+d);
           d=(a>=b);
           System.out.println("Greater than or equal to a>=b:"+d);
           d=(a<=b);
           System.out.println("Less than or equal to a<=b:"+d);


           //Assignment Operators
           a=1;
           b=2;
           System.out.println("   ");
           System.out.println("**Assignment Operators**");
           System.out.println("   ");
           c=(a=b);
           System.out.println("Equal  a=b:"+c);
           c=(a+=b);
           System.out.println("Add and Equal a>b:"+ c);
           c=(a-=b);
           System.out.println("Sub and Equal a<b:"+ c);
           c=(a*=b);
           System.out.println("Multipily and equal a!=b:"+ c);
           c=(a/=b);
           System.out.println("Divid and equal a>=b:"+ c);
           c=(a%=b);
           System.out.println("Moduler and equal a<=b:"+ c);


           //Logical Operators
           System.out.println("   ");
           System.out.println("**Logical Operators**");
           System.out.println("   ");
           d=( a>b && b>e);
           System.out.println("AND Operators a&&b:"+d);
           d=(a>b || b>e);
           System.out.println("OR Operators a||b:"+d);
           d=!(a==b);
           System.out.println("NOT Operators !(a==b):"+d);

           
           //Bitwise Operators 
           System.out.println("   ");
           System.out.println("**Bitwise Operators**");
           System.out.println("   ");
           a=2;
           b=3;
           c=(a&b);
           System.out.println("a&b:"+c);
           c=(a^b);
           System.out.println("a^b:"+c);
           c=(a|b);
           System.out.println("a|b:"+c);
           c=(~a);
           System.out.println("~a:"+c);
           c=(a<<b);
           System.out.println("a<<b:"+c);
           c=(a>>b);
           System.out.println("a>>b:"+c);
           


    }
}