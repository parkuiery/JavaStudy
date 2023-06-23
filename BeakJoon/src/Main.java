import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        int b;
        int c=0;
        int[] arg = new int[100];
        Scanner scanner = new Scanner(System.in);

        b = scanner.nextInt();
        for(int i=0;i<b;i++){
            arg[i] = scanner.nextInt();
        }
        a = scanner.nextInt();
        for(int i=0;i<b;i++){
            if(arg[i]==a){
                c++;
            }
        }
        System.out.println(c);
    }
}





