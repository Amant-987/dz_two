package org.example;


public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human("John", 100, 2),
                new Cat("Tom", 50, 3),
                new Robot("Robo", 200, 1)
        };

        Object[] obstacles = {
                new Treadmill(80),
                new Wall(2),
                new Treadmill(120),
                new Wall(3)
        };

        for (Participant participant : participants) {
            boolean isParticipantSucceeded = true;

            for (Object obstacle : obstacles) {
                if (obstacle instanceof Treadmill) {
                    Treadmill treadmill = (Treadmill) obstacle;
                    treadmill.pass(participant);
                } else if (obstacle instanceof Wall) {
                    Wall wall = (Wall) obstacle;
                    wall.pass(participant);
                }

                // Если участник не смог пройти препятствие, прекращаем проверку
                if (isParticipantSucceeded == false) {
                    break;
                }
            }

            System.out.println();

        }
    }
}