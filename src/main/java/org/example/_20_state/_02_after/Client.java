package org.example._20_state._02_after;

public class Client {

    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student student = new Student("whiteship");
        Student hyoseong = new Student("hyoseong");
        hyoseong.addPrivate(onlineCourse);

        onlineCourse.addStudent(student);

        onlineCourse.changeState(new Private(onlineCourse));

        onlineCourse.addReview("hello", student);

        onlineCourse.addStudent(hyoseong);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getReviews());
        System.out.println(onlineCourse.getStudents());
    }

    /**
     * 상태 패턴
     * 객체 내부 상태 변경에 따라 객체의 행동이 달라지는 패턴
     *
     * 장점
     *  - 상태에 따른 동작을 개별 클래스로 옮겨서 관리할 수 있다. ( if else if else 로 분기되는 복잡함을 보안)
     *  - 기존의 특정 상태에 따른 동작을 변경하지 않고 새로운 상태에 다른 동작을 추가할 수 있다.
     *  - 코드 복잡도를 줄일 수 있다.
     *
     * 단점
     *  - 복잠도가 증가한다.
     */
}
