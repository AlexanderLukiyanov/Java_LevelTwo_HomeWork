package TaskTwo;

public class Person {

    public int maxJump;
    public int maxSpeed;
    public String personName;

    public Person(String personName, int maxJump, int maxSpeed) {
        this.maxJump = maxJump;
        this.maxSpeed = maxSpeed;
        this.personName = personName;

        System.out.println("Начальная высота прыжка " + maxJump);
        System.out.println("Начальная скорость бега " + maxSpeed);
        System.out.println("Имя " + personName);
    }
}
