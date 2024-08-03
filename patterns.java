// pattern-1 row=4,col=5

/*
*****
*****
*****
*****
 */

// public class patterns{
//     public static void main(String[] args) {
//         for(int row=1;row<=4;row++){
//             for(int col =1;col<=5;col++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// pattern-2 hollow rectangle

/* 
***** 
*   *
*   *
***** 
 */

// public class patterns{
//     public static void main(String[] args) {
//         for(int row =1;row<=4;row++){
//             for(int col=1;col<=5;col++){
//                 if(row==1 || row==4 || col==1 || col==5){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// pattern-3

/* 
***** 
**
**  
***** 
 */

// public class patterns{
//     public static void main(String[] args) {
//         int r = 4;
//         int c = 5;
//         for(int row =1;row<=r;row++){
//             for(int col =1;col<=c;col++){
//                 if( row ==1 || row==r || col==1 || col==c){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print("");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// pattern 4

/*
*
**
***
****
 */

// public class patterns{
//     public static void main(String[] args) {
//         int n =4;
//         for(int i =1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//pattern 5

/*
****
***
**
*
 */
// public class patterns {

//     public static void main(String[] args) {
//         int n = 4;
//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.err.println();

//         }
//     }
// }

//pattern 6

/*
    *
   **
  ***
 ****
***** 
*/

// public class patterns{
//     public static void main(String[] args) {
//         int n=5;
//         //outer loop
//         for(int i=1;i<=n;i++){
//             //inner loop->for space
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             //inner loop ->star
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// pattern 7

/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */

// public class patterns{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//pattern -8

/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/

// public class patterns {

//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j+" ");
//             }
//             System.err.println();

//         }
//     }
// }

// another process

// public class patterns{
//     public static void main(String[] args) {
//         int n =5;
//         for(int i =1;i<=n;i++){
//             for(int j =1;j<=n-i+1;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// pattern -9

/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */

// public  class patterns{
//     public static void main(String[] args) {
//         int n=5;
//         int number =1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(number+" ");
//                 number++;
//             }
//             System.out.println();
//         }
//     }
// }

// pattern -10

/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
0 1 0 1 0 1
 */

public  class patterns{
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                }
                else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
}