package org.example._02_factory_method;

/**
 * 팩토리 메서드 패턴
 * 구체적으로 어떤 인스턴스를 만들지는 서브 클래스가 정한다.
 * 확장에 열려있고 변경에 닫혀있는 구조(OCP 원칙)
 */
public interface ShipFactory {

    // 자바 8버전에서 부터 지원하는 default method
    // 기본적인 구현체(BODY)를 만들수 있는 기능
    // 기존에는 구현체(impl) 또는 interface를 구현한 추상클래스에서만 메서드를 구현할 수 있었다
    // 따라서 해당 인터페이스를 구현하는(impl) 클래스 또는 상속받은 클래스에서 해당 메서드를 사용할 수 있게 되었다.
    default Ship orderShip(String name, String email){
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    // 하위에서 구현해줘야할 메서드
    Ship createShip();

    /*
        자바 9에서 추가된 interface 의 private 메서드
        1. Private interface method cannot be abstract.
        2. Private method can be used only inside interface.
        3. Private static method can be used inside other static and non-static interface methods.
        4. Private non-static methods cannot be used inside private static methods.

        즉, 인터페이스 내에서 공통된 기능을 private메서드로 빼서 쓸 수 있다. private로 접근지정자가 지정되어있어 밖에서는 쓸 수 없다
        인터페이스 내에서만 쓸 수 있다.
        메서드로 만들어서 공통적인 로직을 만들어 re usable 하다

     */
    private void validate(String name, String email){
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }

}
