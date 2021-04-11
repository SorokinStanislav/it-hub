package ru.yandex.stasiyan;

public class Person {

    private String passportId;
    private String name;
    private int age;

    public Person(String passportId, String name, int age) {
        this.passportId = passportId;
        this.name = name;
        this.age = age;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
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
                "passportId='" + passportId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
