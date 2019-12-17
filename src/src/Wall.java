public class Wall implements Obstacles {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public void doJump(Contestant contestant) {
        if (contestant.Jump(height)) {
            System.out.println(contestant.getName() + " успешно перепрыгнул");
        } else {
            System.out.println(contestant.getName() + " не смог перепрыгнуть");
        }
    }
}