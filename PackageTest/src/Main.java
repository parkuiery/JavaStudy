import test.pack1.Pclas1;
import test.pack1.Pclas2;

public class Main {
    public static void main(String[] args) {
        Pclas1 pc1 = new Pclas1();
        Pclas2 pc2 = new Pclas2();

        pc1.method1();
        pc2.method2();

        test.pack2.P2clas1 p2clas1 = new test.pack2.P2clas1();
        test.pack2.P2class2 p2class2 = new test.pack2.P2class2();

        p2clas1.method1();
        p2class2.method2();
    }
}