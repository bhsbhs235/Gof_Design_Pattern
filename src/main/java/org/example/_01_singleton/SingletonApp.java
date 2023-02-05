package org.example._01_singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Hello world!
 *
 */
public class SingletonApp
{
    public static void main( String[] args ) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 리플렉션을 쓰면 싱글턴을 깨트릴 수 있다.
        // Enum 타입은 리플렉션을 사용할 수 없다.
        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings settings = constructor.newInstance();

        // 직렬화 역직렬화로 파일에 객체를 저장할 수 있다.
        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))){
            out.writeObject(settings);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            Settings settings1 = (Settings)in.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        /*
            따라서 두가지 방법이 권장됨
            1. Enum 사용
            2. static inner 클래스(holder)
         */
    }
}
