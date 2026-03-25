package Creational_pattern.ex5;

public class Person {
	private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person(Person other) {
        this.name = other.name;
    }

    public String getName() {
        return name;
    }
}
