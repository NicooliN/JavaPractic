package day3.refl.task2;

/*
Написать метод, который с помощью рефлексии получит все интерфейсы класса, включая интерфейсы от классов-родителей и интерфейсов-родителей.
 */

import java.util.ArrayList;
import java.util.List;

interface A {}

interface B {}

interface C {}

interface D
        extends A, B {}

interface E
        extends C, D {}

class Cl1
        implements A {}

class Cl2
        extends Cl1
        implements E {}

public class Main {
    public static void main(String[] args) {
        List<Class<?>> result = getInterfaces(Cl2.class);
        for (Class<?> aClass : result) {
            System.out.println(aClass.getName());
        }
    }

    public static List<Class<?>> getInterfaces(Class<?> cls) {
        List<Class<?>> interfases = new ArrayList<>();
        while (cls != Object.class) {
            for (Class<?> aClass : cls.getInterfaces()) {
                interfases.add(aClass);
                Class<?>[] arrInterfaces = aClass.getInterfaces();
                while (arrInterfaces.length > 0) {
                    for (Class<?> aClass1 : arrInterfaces) {
                        aClass = aClass1;
                        arrInterfaces = aClass.getInterfaces();
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return interfases;
    }
}
