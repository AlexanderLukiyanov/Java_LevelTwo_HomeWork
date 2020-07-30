package TaskTwo;

public class Treadmill extends Let {

    public int trackLength = 100;

    @Override
    public void obstacleLength(Person person) {
        if (trackLength <= person.maxSpeed) {
            person.maxSpeed -= trackLength;
            System.out.println("Препятствие пройдено. " + person.personName +" пробежал беговую дорожку. " +
                    "В запасе осталось " + person.maxSpeed + " скорости");
        } else {
            System.out.println("Препятствие не пройдено. " + person.personName +" не пробежал беговую дорожку. " +
                    "В запасе осталось " + person.maxSpeed + " скорости");
            person.maxSpeed = person.maxSpeed;
        }
    }
}
