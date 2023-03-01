package org.example._13_chain_of_responsibilities._02_after;

public class Client {

    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request("이번 놀이는 뽑기입니다.");
        requestHandler.handle(request);
    }

    public static void main(String[] args) {
        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
        Client client = new Client(chain);
        client.doWork();
    }

    /**
     * 책임 연쇄 패턴
     *
     * 장점
     *  - 클라이언트 코드를 변경하지 않고 새로운 핸들러를 chain에 등록할 수 있다.(OCP)
     *  - handler가 한가지 일에만 집중되어있다. (SRP)
     *  - 조건에 따라 처리를 요청을 처리하든 안하든 할 수 있다.
     *
     * 단점
     *  - 코드의 흐름이 많아져 디버깅이 어려울 수 있다.
     */
}
