package org.example._19_observer._02_after;

public class Client {

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        User user1 = new User("aaa");
        User user2 = new User("bbb");

        chatServer.register("오징어게임", user1);
        chatServer.register("오징어게임", user2);

        chatServer.register("디자인패턴", user1);

        chatServer.sendMessage(user1, "오징어게임", "아.. 이름이 기억났어.. 일남이야.. 오일남");
        chatServer.sendMessage(user2, "디자인패턴", "옵저버 패턴으로 만든 채팅");

        chatServer.unregister("디자인패턴", user1);

        chatServer.sendMessage(user2, "디자인패턴", "옵저버 패턴 장, 단점 보는 중");
    }

    /**
        옵저버 패턴
        다수의 객체가 특정 객체 상태 변화를 감지하고 알림을 받는 패턴

        장점
         - 상태를 변경하는 객체(publisher)와 변경을 감지하는 객체(subscriber)의 관계를 느슨하게(
            1. 코드를 작성하기 쉽고
            2. 변경하기 쉽고
            3. 테스트 하기 쉽고
            4. 재사용하기 쉽다
            ) 유지할 수 있다.
         - Subject의 상태 변경을 주기적으로 조회하지 않고(polling mechnism 예: 1초 마다 계속 요청해서 확인하는거) 자동으로 감지할 수 있다.
         - 런타임에 옵저버를 추가하거나 제거할 수 있다.

        단점
         - 복잡도가 증가한다.
         - 다수의 Observer 객체를 등록 이후 해지 않는다면 memory leak이 발생할 수도 있다.(unregister를 잘해준다)
     */
}
