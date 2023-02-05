package org.example._01_singleton;

import java.io.Serializable;

/**
 * 가장 단순히 구현한 싱글톤 패턴
 */
public class Settings implements Serializable {

    private static Settings instance;
    // private static volatile Settings instance;

    // private static final Settings INSTANCE = new Settings();
    // 미리 만들어주고 synchronized 안써도 됨. (이른 초기화)

    private Settings(){} // 외부에서 new 를 할 수 없음

    private static class SettingsHolder{
        private static final Settings INSTANCE = new Settings();
    }

    public static synchronized Settings getInstance(){
        if(instance == null){
            instance = new Settings();
            /*
            (double checked locking)
            synchronized (Settings.class){
                if(instance == null){
                    instance = new Settings();
                }

            }*/
        }

        return new Settings();
        // return SettingsHolder.INSTANCE;
    }

    /*
        *주의
        멀티 쓰레드 환경에서 안전하지 않다
        이유 : 순간적으로 쓰레드가 동시에 if문을 통과하게 된다면 객체가 여러개 생성 될 수도 있다.

        *대안
        1. synchronized 키워드 사용
            - 동기화 작업(Lock) 때문에 성능이 저하될 수 있다.
        2. 이른 초기화
            - 안쓰면 리소스 낭비
        3.

     */
}