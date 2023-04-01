package org.example._21_strategy._02_after;

public class Client {

    public static void main(String[] args) {
        BlueLightRedLight game = new BlueLightRedLight();
        game.blueLight(new Normal());
        game.redLight(new Fastest());
        game.blueLight(new Speed() {
            @Override
            public void blueLight() {
                System.out.println("blue light");
            }

            @Override
            public void redLight() {
                System.out.println("red light");
            }
        });
    }

    /**
     * 전략 패턴
     * 여러 알고리즘을 캡슐화하고 상호 교환 가능하게 만드는 패턴
     *
     * 장점
     *  - 새로운 전략을 추가하더라도 기존 코드를 변경하지 않는다.
     *  - 상속 대신 위임을 사용할 수 있다.
     *  - 런타임에 전략을 변경할 수 있다.
     * 단점
     *  - 복잡도가 증가한다.
     *  - 클라이어트 코드가 구체적인 전략을 알아야 한다.
     */
}
