
import java.util.Scanner;


//     public static  int calculateSum(int a, int b){

//         int sum =a+b;
//         return  sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
        
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int sum =calculateSum(a,b);
//         System.out.print("Sum of 2 number is:"+ sum);
//     }
// }


// multifly 2 numbers and return the product

// public class functions{
//     public static int multiply(int a,int b){
//         int multiply = (a*b);
//         return multiply;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//          int a =sc.nextInt();
//          int b = sc.nextInt();
//          int mul = multiply(a, b);

//          System.out.println("multiply of two number is: "+ mul);        
//     }
// }

// find the factorial of a number

public class functions{
    public static void printFactorial(int n){
        if(n<0){
            System.out.println("Invalid");
            return;
        }
        int factorial =1;
        for(int i=n;i>=1;i--){
            factorial=factorial * i;
        }
        System.out.println(factorial);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        printFactorial(n);
        
    }
}