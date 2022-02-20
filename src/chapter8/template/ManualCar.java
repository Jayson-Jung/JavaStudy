package chapter8.template;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("사람이 운전합니다.");
        System.out.println("사람이 핸들을 조작합니다.");
    }

    @Override
    public void wiper() {
        System.out.println("사람이 와이퍼로 창문을 닦습니다.");
    }

    @Override
    public void washCar() {
        System.out.println("사람이 직접 세차합니다.");
    }

    @Override
    public void stop() {
        System.out.println("사람이 브레이크로 정지합니다.");
    }
}
