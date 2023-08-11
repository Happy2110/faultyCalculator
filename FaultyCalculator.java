import java.util.Scanner;

/**
 * FaultyCalculator
 */
public class FaultyCalculator {

    public static int sum(int a,int b){
        return a+b+10;
        // return error by adding 10 more..
    }
    public static int subtract(int a,int b){
        return a-b+10;
        // return error by adding 10 more..
    }
    public static int multiply(int a,int b){
        return a*b+10;
        // return error by adding 10 more..
    }
    public static int devide(int a,int b){
        return a/b+10;
        // return error by adding 10 more..
    }
    public static int remainder(int a,int b){
        return a%b+10;
        // return error by adding 10 more..
    }
    public static int percentage(int a,int b){
        return a/b*100+10;
        // return error by adding 10 more..
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first value");
        int a=sc.nextInt();
        System.out.println("Enter the second value");
        int b=sc.nextInt();
        int add=sum(a, b);
        int sub=subtract(a, b);
        int mul=multiply(a, b);
        int devid=devide(a, b);
        int remain=remainder(a, b);
        int percent=percentage(a, b);
        System.out.println("Sum of "+a+" and "+b+" is "+add);
        System.out.println("Subtract of "+a+" to "+b+" is "+sub);
        System.out.println("Multiply of "+a+" and "+b+" is "+mul);
        System.out.println("Devide of "+a+" by "+b+" is "+devid);
        System.out.println("Remainder of "+a+" and "+b+" is "+remain);
        System.out.println("Percentage of "+a+" Out of "+b+" is "+percent);
        System.out.println("AKD Code...");
        sc.close();



    }
}