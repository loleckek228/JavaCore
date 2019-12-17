public class Robot implements Contestant {
    private String name;
    private int maxHeight;
    private int maxDistance;

    public Robot(String name, int maxHeight, int maxDistance) {
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
            maxDistance = 0;
            return false;
        }
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public int getMaxDistance() {
        return maxDistance;
    }
}