public class Class1 {
    public void method1() {
        System.out.println("메서드 1번");
        method2();
    }

    public void method2() {
        System.out.println("메서드 2번");
    }

    public void add(int a,int b){
        int result = a+b;
        System.out.println("정수 연산: a + b = " + result);
    }

    public int resultAdd(int a, int b){
        int result = a + b;
        return result;
    }
}
