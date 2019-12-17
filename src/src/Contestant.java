public interface Contestant {

    String getName();

    boolean Jump(int height);

    boolean Run(int distance);

    int getMaxDistance();

    int getMaxHeight();
}