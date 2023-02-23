package org.example._09_decorator._02_after;

public class App {

    private static boolean enabledSpamFilter = true;

    private static boolean enabledTrimming = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if (enabledSpamFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        if (enabledTrimming) {
            commentService = new TrimmingCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");

        /**
         * 데코레이터 패턴
         * 기존 코드를 변경하지 않고 부가 기능을 추가하는 패턴
         * 장점
         *  - 새로운 클래스를 만들지 않고 기존 기능을 조합할 수 있다.(다중 상속이 안되기 때문에 단순히 상속으로만 이 문제를 해결할수는 없다) 각자 기능은 자기 할일만 하면 된다(SRP)
         *  - 컴파일 타임이 아닌 런타임에 동적으로 기능을 변경할 수 있다.
         *  - Client 코드와 CommetService 코드는 바뀌지 않음(OCP)
         *  - Client 코드에서 commentService 타입을 주입해서 사용함(DIP)
         * 단점
         *  - 데코레이터를 조합하는 코드가 복잡할 수 있다.
         */
    }
}
