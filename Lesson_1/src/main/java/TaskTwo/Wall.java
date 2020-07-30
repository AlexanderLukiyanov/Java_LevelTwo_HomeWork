package TaskTwo;

public class Wall extends Let {

    public int wallHeight = 50;

    @Override
    public void obstacleHeight(Person person) {
        if (wallHeight <= person.maxJump) {
            person.maxJump -= wallHeight;
            System.out.println("Препятствие пройдено. " + person.personName +" перепрыгнул стену. " +
                    "В запасе осталось " + person.maxJump + " высоты прыжков");
        } else {
            System.out.println("Препятствие не пройдено. " + person.personName +" не перепрыгнул стену. " +
                    "В запасе осталось " + person.maxJump + " высоты прыжков");
            person.maxJump = person.maxJump;
        }
    }
}
