public class AObj {

    Ainterface ainterface;
    public AObj(){
        ainterface = new AinterfaceImpl();
    }
    public void funcAA(){

        // 다른 객체의 기능을 사용하는것, 위임하는것
        ainterface.funcA();
        ainterface.funcA();
        // ~ 기능이 필요합니다. 개발해주세요.
    }
}
