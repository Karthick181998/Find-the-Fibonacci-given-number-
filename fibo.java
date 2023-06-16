import java.util.Scanner;
public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number limit");
        int limit = sc.nextInt();
        int a=1,b=-1,c;
        for(int i=1; i<=limit; i++){
            c=a+b;
            System.out.println("The Fibonacci Series Number is "+c);
            a=b;
            b=c;
        }
    }
}
