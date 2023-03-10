package org.example._12_proxy._02_after;

public class Client {

    public static void main(String[] args) {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }

    /**
     * 프록시 패턴
     * 특정 객체에 대한 접근을 제어하거나 기능을 추가할 수 있는 패턴
     * 장점
     *  - 기존 코드를 변경하지 않고 새로운 기능을 추가할 수 있다. (OCP)
     *  - 기존 코드가 해야 하는 일만 유지할 수 있다. (SRP)
     *  - 기능 추가 및 초기화 지연 return 값에 대한 캐싱 등으로 다양하게 활용할 수 있다.
     *
     * 단점
     *  - 코드의 복잡도가 증가한다.
     */
}
