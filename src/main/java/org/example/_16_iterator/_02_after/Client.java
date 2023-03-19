package org.example._16_iterator._02_after;

import org.example._16_iterator._01_before.Post;

import java.util.Iterator;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("디자인 패턴 게임");
        board.addPost("선생님, 저랑 디자인 패턴 하나 학습하시겠습니까?");
        board.addPost("지금 이 자리에 계신 여러분들은 모두 디자인 패턴을 학습하고 계신 분들입니다.");

        // TODO 들어간 순서대로 순회하기
        List<Post> posts = board.getPosts();
        Iterator<Post> iterator = posts.iterator();

        for (int i = 0 ; i < posts.size() ; i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }

        // TODO 가장 최신 글 먼저 순회하기
        Iterator<Post> recentPostIterator = board.getRecentPostIterator();
        /** 여기서 중요한 것은 board 내부 구조가 List인지 Set,tree,stack 인지 몰라도 상관이 없다는 것 (캡슐화, SRP)
         * 위의 말은 구조가 바껴도 Iterator만 받으면 되기 때문에 클라이언트 코드는 바뀌지 않는다
         * 현재는 날짜 순으로 순서 Iterator를 반환하지만 Title 가나다 순으로 Iterator을 리턴하고 싶으면 인터페이스를 구현한 구현체를 만들어 바꿔 껴주면 된다(OCP)
         *
         * 이터레이터 패턴
         * 집합 객체 내부 구조를 노출시키지 않고 순회하는 방법을 제공하는 패턴
         **/

        while(recentPostIterator.hasNext()) {
            System.out.println(recentPostIterator.next().getTitle());
        }
    }

}
