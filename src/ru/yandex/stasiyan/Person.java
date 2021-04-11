package ru.yandex.stasiyan;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return person.passportId.equals(this.passportId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportId, name, age);
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
