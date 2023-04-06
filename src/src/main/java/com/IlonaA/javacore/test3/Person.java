package src.main.java.com.IlonaA.javacore.test3;
public class Person implements Comparable<Person> {
   String name;
   String city;
   Integer age;

    public Person(String name, String city, Integer age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {

        int cmp = this.getCity().compareTo(o.getCity());
        if (cmp != 0) {
            return cmp;
        }
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
