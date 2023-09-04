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
                if (obstacle instanceof Treadmill treadmill) {
                    if (!treadmill.pass(participant)) {
                        isParticipantSucceeded = false;
                        break;
                    }
                } else if (obstacle instanceof Wall wall) {
                    if (!wall.pass(participant)) {
                        isParticipantSucceeded = false;
                        break;
                    }
                }
            }

            if (isParticipantSucceeded) {
                System.out.println(participant.getName() + " успешно прошел все препятствия.");
            } else {
                System.out.println(participant.getName() + " не смог пройти все препятствия.");
            }

            System.out.println();
        }
    }
}