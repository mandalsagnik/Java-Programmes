
import java.util.Scanner;

// public class loops{
//     public static void main(String[] args) {
//         for(int i=0;i<100;i++){
//             System.out.println("Hello World");
//         }
//     }
// }

// print 0 to 10

// public class loops{
//     public static void main(String[] args) {
//         for(int i=0;i<=10;i++){
//             System.err.println(i);
//         }
//     }
// }

// print 0 to 10 using while loop

// public class loops{
//     public static void main(String[] args) {
//         int i=0;
//         while(i<11){
//             System.err.println(i);
//             i++;
//         }
//     }
// }

// print 0 to 10 using do while loop

// public class loops{
//     public static void main(String[] args) {
//         int i=0;
//         do { 
//             System.out.println(i);
//             i++;
//         } while (i<11);
//     }
// }

// print the sum of first n natural number

// public class loops{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum =0;

//         for(int i=0;i<=n;i++){
//             sum = sum +i;
//         }
//         System.out.println(sum);
//     }
// }

// print the table of a number input by the user

public class loops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1;i<=10;i++){
            System.out.println(i*n);
        }
        
    }
}