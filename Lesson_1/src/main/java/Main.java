import TaskOne.Cat;
import TaskOne.Robot;
import TaskTwo.*;

public class Main {

    public static void main(String[] args) {
        //Person person1 = new Person();
        //person1.PersonJump();
        //person1.PersonRun();
//
        //Cat cat1 = new Cat();
        //cat1.CatJump();
        //cat1.CatRun();
//
        //Robot robot1 = new Robot();
        //robot1.RobotJump();
        //robot1.RobotRun();     //Для TaskOne

        //Person personOne = new Person("Alex", 500, 200);
        //Person personTwo = new Person("Ted", 200, 500);
//
        //Let LetTreadmill = new Treadmill();
        //Let LetWall = new Wall();
//
//
//
        //LetTreadmill.obstacleLength(personOne);
        //LetWall.obstacleHeight(personTwo);  // Для TaskTwo


        Person[] Participant = new Person[3];
        Let[] Obstacle = new Let[4];

        Person ParticipantOne = new Person("Alex", 100, 100);
        Person ParticipantTwo = new Person("Jim", 200, 600);
        Person ParticipantTree = new Person("Tom", 150, 300);

        Participant[0] = ParticipantOne;
        Participant[1] = ParticipantTwo;
        Participant[2] = ParticipantTree;

        Let LetTreadmill = new Treadmill();
        Let LetWall = new Wall();

        Obstacle[0] = LetTreadmill;
        Obstacle[1] = LetWall;
        Obstacle[2] = LetTreadmill;
        Obstacle[3] = LetWall;

        for (int i = 0; i < Participant.length; i++) {
            for (int j = 0; j < Obstacle.length; j++) {
                if (Participant[i].maxSpeed >= Obstacle[i].trackLength && Participant[i].maxJump >= Obstacle[i].wallHeight) {
                    System.out.println("Имя участника " + Participant[i].personName);
                    LetTreadmill.obstacleLength(Participant[i]);
                    LetWall.obstacleHeight(Participant[i]);
                } else {
                    System.out.println(Participant[i] + " Вы не можете продолжать забег");
                    break;
                }
            }
        }
    }
}
