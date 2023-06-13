import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 0;

        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        if(n1>0&&n2>0){
            System.out.println("1");
        } else if (n1<0&&n2>0) {
            System.out.println("2");
        } else if (n1<0&&n2<0) {
            System.out.println("3");
        } else if (n1>0&&n2<0) {
            System.out.println("4");
        }

    }
}