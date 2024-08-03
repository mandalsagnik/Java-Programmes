
import java.util.Scanner;


//         Scanner sc =new Scanner(System.in);
//         int age = sc.nextInt();
//         if(age >18){
//             System.out.println("Adult");
//         }
//         else{
//             System.out.println("Not adult");
//         }
//     }
// }

// even odd

// public class conditions{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int number =sc.nextInt();
//         if(number % 2 == 0){
//             System.out.println("Number is even");
//         }
//         else{
//             System.out.println("Number is odd");
//         }
//     }
// }

// greter --equal--less number

// public class conditions{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         if(a==b){
//             System.out.println("The numbers are equal");
//         }
//         else{
//             if(a>b){
//                 System.out.println("a is greter than b");
//             }
//             else{
//                 System.out.println("b is greter than a");
//             }
//         }
//     }
// }

// // other method

// public class conditions{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a =sc.nextInt();
//         int b=sc.nextInt();
//         if(a==b){
//             System.out.println("The numbers are equal");
//         }else if (a>b) {
//             System.out.println("a is greater than b");
            
//         }
//         else{
//             System.out.println("b is greater then a");
//         }
//     }
// }


// switch case

// public class conditions{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();

//         switch(button) {
//             case 1:
//                 System.out.println("Hello");
//                 break;
//             case 2:
//                 System.out.println("namaste");
//                 break;
//             case 3:
//                 System.out.println("Dunya");
//                 break;
//             default:System.out.println("Invalid");
//         }
//     }
// }

// different

public class conditions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch(button) {
            case 1:
                System.out.println("Hello");     // if any case there is not present break then the output will come hello and namaste also
            
            case 2:
                System.out.println("namaste");
                break;
                
            case 3:
                System.out.println("Dunya");
                break;
            default:System.out.println("Invalid");
        }
    }
}