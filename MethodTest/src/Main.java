public class Main {
    public static void main(String[] args) {
        Class1 c1= new Class1();
        c1.method1();

        c1.add(100,200);

        int result = c1.resultAdd(500,600);
        System.out.println("리턴 받은 값: " + result);

        c1.add(500,600,700);
    }
}