public class Treadmill implements Obstacles {

    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Contestant contestant) {
        if (contestant.Run(distance)) {
            System.out.println(contestant.getName() + " успешно пробежал");
        } else {
            System.out.println(contestant.getName() + " не смог пробежать");
        }
    }
}