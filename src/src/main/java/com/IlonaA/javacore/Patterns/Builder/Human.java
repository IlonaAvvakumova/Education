package src.main.java.com.IlonaA.javacore.Patterns.Builder;


public class Human { //Product
    private String name;
    private Integer age;
    private Sex sex;
    private boolean hair;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setHair(boolean hair) {
        this.hair = hair;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", hair=" + hair +
                '}';
    }
}
