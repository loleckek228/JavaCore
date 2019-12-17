public class Cat implements Contestant {
    private String name;
    private int maxHeight;
    private int maxDistance;


    public Cat(String name, int maxHeight, int maxDistance) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxDistance = maxDistance;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean Jump(int height) {
        if (getMaxHeight() >= height) {
            maxHeight -= height;
            return true;
        } else {
            maxHeight = 0;
            return false;
        }
    }


    @Override
    public boolean Run(int distance) {
        if (getMaxDistance() >= distance) {
            maxDistance -= distance;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getMaxDistance() {
        return maxDistance;
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }
}