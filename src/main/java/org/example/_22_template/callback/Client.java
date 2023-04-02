package org.example._22_template.callback;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("number.txt");
        int result = fileProcessor.process(new Operator() {
            @Override
            public int getResult(int result, int number) {
                return result += number;
            }
        });

        System.out.println(result);
    }

    /**
     * 템플릿 콜백 패턴
     * 콜백으로 상속 대신 위임을 사용하는 템플릿 패턴
     * 상속 대신 익명 내부 클래스를 활용할 수 있다.
     */

}
