package src.main.java.com.IlonaA.javacore;

import java.util.HashSet;
import java.util.Objects;

public class мм {
}
class Person {
    String name;
    Person(String name) { this.name = name; }
    public String toString() { return name; }

    @Override
    public boolean equals(Object o) {
        return true;
    }

    @Override
    public int hashCode() {
        return 10;
    }
}

class TestHashSet {
    public static void main(String args[]) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("Иван");
        Person p2 = new Person("Мария");
        Person p3 = new Person("Пётр");
        Person p4 = new Person("Мария");
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        System.out.print(set.size());
    }
}