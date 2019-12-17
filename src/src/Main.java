public class Main {
    public static void main(String[] args) {
        Human human = new Human("Андрей", 14, 10);
        Cat cat = new Cat("Мурзик", 10, 15);
        Robot robot = new Robot("п3д3", 13, 17);

        Wall wall = new Wall(6);
        Treadmill treadmill = new Treadmill(7);
        Treadmill treadmill1 = new Treadmill(1);
        Wall wall1 = new Wall(9);
        Wall wall2 = new Wall(9);

        Contestant[] contestant = {human, cat, robot};
        Obstacles[] obstacles = {wall, treadmill, treadmill1, wall1, wall2};

        for (int i = 0; i < contestant.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (obstacles[j] instanceof Wall) {
                    ((Wall) obstacles[j]).doJump(contestant[i]);
                } else if (obstacles[j] instanceof Treadmill) {
                    ((Treadmill) obstacles[j]).doRun(contestant[i]);
                }

                if (contestant[i].getMaxHeight() <= 0 || contestant[i].getMaxDistance() <= 0) {
                    break;
                }
            }
        }
    }
}