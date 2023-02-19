package org.example._07_bridge._02_after;

import org.example._07_bridge._01_before.Champion;

public abstract class App implements Champion {

    public static void main(String[] args) {
        Champion kda아리 = new 아리(new KDA()); // 의존성 주입으로 더 유연하게 해줄 수 있다.
        kda아리.skillQ();
        kda아리.skillW();

        Champion poolParty아리 = new 아리(new PoolParty());
        poolParty아리.skillR();
        poolParty아리.skillW();

        /*
            브릿지 패턴
            추상적인 것과 구체적인 것을 분리하여 연결하는 패턴
            장점
                - 추상적인 코드를 구체적인 코드 변경 없이도 독립적으로 확장할 수 있다.(OCP)
                - 추상적인 코드와 구체적인 코드를 분리할 수 있다. (SRP) -> 코드를 재사용할 수 있다. 중복을 줄일수 있다.
            단점
                - 계층 구조가 늘어나 복잡도가 증가할 수 있다.

            사용되는곳 :
                JDBC (Mysql, h2, oracle Driver 원하는 걸로 쓸수 있다)
         */
    }
}
