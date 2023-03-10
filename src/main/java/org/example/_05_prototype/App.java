package org.example._05_prototype;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        String url = githubIssue.getUrl();
        System.out.println(url);

        GithubIssue clone = (GithubIssue) githubIssue.clone();
        System.out.println(clone.getUrl());

        System.out.println(clone != githubIssue); // 인스턴스는 다름
        System.out.println(clone.equals(githubIssue)); // 값은 같음
        System.out.println(clone.getClass() == githubIssue.getClass()); // 타입은 같음
        System.out.println(clone.getRepository() == githubIssue.getRepository());
        // shallow clone
        // deep clone

        System.out.println(clone.getUrl());

        /*
            프로토타입 패턴 : 기존 인스턴스를 복제하여 새로운 인스턴스를 만드는 방법
            - 장점
                - 복잡한 객체를 만드는 과정을 숨길 수 있다.
                - 기존 객체를 복제하는 과정이 새 인스턴스를 만드는 것보다 비용(시간 또는 메모리)적인 면에서 효율적일 수도 있다.
                - 추상적인 타입을 리턴할 수 있다. (부모 타입 등)
            - 단점
                - 복제한 객체를 만드는 과정 자체가 복잡할 수 있다.

         */
    }

}
