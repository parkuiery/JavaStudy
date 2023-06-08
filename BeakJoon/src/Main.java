import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        System.out.println((n1+n2)%n3);
        System.out.println(((n1%n3)+(n2%n3))%n3);
        System.out.println((n1*n2)%n3);
        System.out.println(((n1%n3)*(n2%n3))%n3);


    }
}