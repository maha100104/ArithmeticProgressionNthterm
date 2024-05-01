import java.util.*;
public class ArithmeticProgressionNthTerm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Numbers: ");
        String str=sc.nextLine();
        String[] s=str.split(" ");
        System.out.println("Enter Nth Number: ");
        int d=sc.nextInt();
        int a=Integer.parseInt(s[0]);
        int b=Integer.parseInt(s[1]);
        int c=Integer.parseInt(s[2]);
        System.out.print("The "+d+"th term of the series is: ");
        System.out.print(a+(d-1)*Math.abs(b-c));
    }
}
/*
Input: Enter the Numbers: 
5 10 15
Enter Nth Number: 
6
Output:
The 6th term of the series is: 30
Process*/
