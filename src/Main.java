public class Main {
    /*
    * 스트레티지 패턴
    * 여러 알골리즘을 하나의 추상적인 접근점을 만들어 접근 점에서
    * 서로 교환가능하도록 하는 패턴
    * */

    public static void main(String[] args) {
        Ainterface ainterface = new AinterfaceImpl();
        ainterface.funcA();

        AObj aObj = new AObj();
        aObj.funcAA();
        System.out.println("Hello world!");
    }
}