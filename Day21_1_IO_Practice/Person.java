package Phase2.Day21_1_IO_Practice;

import java.io.Serializable;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/20 - 07 - 20 - 22:53
 * @Description: Phase2.Day21_1_IO_Practice
 * @version: 1.0
 */
public class Person implements Serializable {
    private static final long serialVersionUID = -784106362487624979L;

    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {
    }
}
