package org.example._15_interpreter._02_after;

import java.util.Map;

public class App {

    public static void main(String[] args) {
        PostfixExpression expression = PostfixParser.parse("xyz+-");
        int result = expression.interpret(Map.of('x', 1, 'y', 2, 'z', 3, 'a', 4));
        System.out.println(result);

        /**
         * abstract syntax tree
         * 프로그래밍 언어로 작성된 소스 코드의 추상 구문 구조의 트리이다
         * 위의 코드를 보면 left rigth 로 PostfixExpression 인터페이스 타입이 트리구조로 연결되어 있는것을 확인할 수 있다.
         */
    }

    /**
     * 인터프리터 패턴
     * 요청을 캡슐화 하여 호출자(invoker)와 수신자(reciver)를 분리하는 패턴
     *
     * 장점
     *  - 자주 등장하는 문제 패턴을 언어와 문법으로 "정의"할 수 있다.
     *  - 기존 코드를 변경하지 않고 새로운 Expression(본인이 해야할일을 하고 있다(SRP))을 추가할 수 있다. (OCP)
     *
     * 단점
     *  - 복잡한 문법을 표현하려면 Expression과 Parser가 복잡해진다.
     */
}
