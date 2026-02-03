interface Myinterface {
    public void method1();
    public void method2();
}
class Activity1 implements Myinterface {
    public void method1(){
        System.out.println("Implementation of Method 1");
    }
    public void method2(){
        System.out.println("Implementation of Method 2");
    }
    public static void main(String[] args) {
        Myinterface m = new Activity1();
        m.method1();
        m.method2();
    }

}