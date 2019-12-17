public interface Contestant {

    String getName();

    boolean Jump(int distance);

    boolean Run(int height);

    int getMaxDistance();

    int getMaxHeight();
}