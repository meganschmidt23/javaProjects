//Write a class with two methods 
//int gcd (a,b) // returns the greatest common divisor of positive integers a and b  
//int lcm (a,b) // returns the least common multiple of positive integers  a and b

//Include a main method that tests these two methods.  The main method should include a loop so that a user can repeat the test.
//Sample output:

//Enter two positive integers: 27 6
//The gcd of 27 and 6 is 3
//The lcm of 27 and 6 is 54

//Run again? 1 for Yes any other digit for No: 1

//Enter two positive integers: 4 20
//The gcd of 4 and 20 is 4
//The lcm of 4 and 20 is 20

//Run again? 1 for Yes any other digit for No: 0

//NOTE: The user can enter the integers in any order.  The largest need not be first.  However, when computing gcd (a,b), a must be the larger integer.  So before attempting to compute the gcd, your method must determine whether or not a is the larger.  If b happens to be larger than a, then switch the values in a and b.

//Remember to switch the values in two variables, you need and extra temporary variable.
  
import java.util.Scanner;
public class LCM_GCD {
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int runAgain = 1;
      while (runAgain == 1){
      	System.out.println("Enter first number : ");
     	int a = sc.nextInt();
      	System.out.println("Enter second number : ");
      	int b = sc.nextInt();
      	System.out.print("The greatest common divisor of "+a+" and "+b);
      	System.out.println(gcd(a,b));
      	System.out.print("The least common multiple of "+a+" and "+b);
      	System.out.println(lcm(a, b));
      	System.out.print("Run again? 1 for Yes any other digit for No: 1");
      	runAgain = sc.nextInt();
      }
   }
   public static int lcm(int a, int b){
      int max, step, lcm = 0;
      if(a > b){
         max = step = a;
      } else{
         max = step = b;
      }
      while(a!= 0) {
         if(max%a == 0 && max%b == 0) {
            lcm = max;
            break;
         }
         max += step; 
      }
      return lcm;
   }
   public static int gcd(int a,int b){
      int i, hcf = 1; //hcf = highest common factor?
         for(i = 1; i <= a || i <= b; i++) {
            if( a%i == 0 && b%i == 0 ){
            hcf = i;
         }
         return hcf;
   }
}  
///End problem 1