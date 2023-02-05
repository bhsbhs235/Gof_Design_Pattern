package org.example._02_factory_method;

import org.example._01_singleton.Settings;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Hello world!
 *
 */
public class FactoryMethodApp
{
    public static void main( String[] args ) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Ship whiteShip = new WhiteShipFactory().orderShip("whiteShip", "test@test.com");
        System.out.println(whiteShip);

        Ship blackShip = new BlackShipFactory().orderShip("blackShip", "test@test.com");
        System.out.println(blackShip);

        /*
            DI를 활용해 클라이언트 코드에서 수정을 덜 하게 할 수 있다(OCP)

            팩토리 메서드 패턴
            - 장점 :
                1. 확장에 열려있고 변경에 닫혀있는(OCP) 객체 지향 원칙을 활용해 기존 코드를 건드리지 않고 인스턴스를 만드는 과정이 담겨있는 로직을 건드리지 않고 새로운 인스턴스를 다른 방법으로 확장이 가능하다.
                   Product(만들어지는 인스턴스) Creator(인스턴스 만드는)관의 관계를 loosely 하게 했기 때문에 가능
                   팩토리 메서드 패턴을 사용하지 않았다면
                   if (name.equals("whiteShip"){
                    return whiteShip;
                   else if(name.equals("blackShip"){
                    return blackShip;
                   } ... 으로 기능 추가 되면 또 기존코드를 수정해야된다.
            - 단점 :
                1. 각자의 역할을 나누다 보니 클래스가 늘어난다.

            OCP
            - 변경에 닫혀있다 : 기존 코드를 건드리지 않는다
            - 확장에 열려있다 : 새로운 기능을 언제든지 확장할 수 있다.


         */


    }
}
