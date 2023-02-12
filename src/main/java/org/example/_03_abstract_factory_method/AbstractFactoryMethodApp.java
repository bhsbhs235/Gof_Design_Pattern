package org.example._03_abstract_factory_method;


public class AbstractFactoryMethodApp {
    public static void main( String[] args ) {
        //ShipFactory shipFactory = new WhiteShipFactory(new WhitePartsProFactory());
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteshipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());

        /*
            팩토리 메소드 패턴과 추상 팩토리 패턴의 차이점
            1. 관점이 다르다.
                - 팩토리 메소드 패턴은 "팩토리를 구현(impl)하는 방법"에 초점을 둔다.
                - 추상 팩토리 패턴은 "팩토리를 사용하는 방법"에 초첨을 둔다.
            2. 목적이 조금 다르다.
                - 팩토리 메소드 패턴은 구체적인 객체 생성 과정을 하위 또는 구현 클래스로 옮기는 것이 목적
                - 추상 팩토리 패턴은 관련있는 여러 객체를 구체적인 클래스에 의존하지 않고 만들 수 있게 해주는 것이 목적.

            WhiteShipFactory는 변하지 않고 의존성 주입만 해주면 생성하는 객체를 다르게 해줄 수 있다!!!! (OCP 원칙)
            ship.setAnchor(new WhiteAnchorPro()); 에서 WhiteAnchorPro 말고 다른 Anchor 타입을 넣어주려면 코드를 바꿔야함!

         */
    }
}
