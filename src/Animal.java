import java.sql.SQLOutput;

public abstract class Animal {
    public static int counter;

    private final int maxRunDistatnce;
    private final int maxSwimDistance;

    public Animal(int maxRunDistatnce, int maxSwimDistance) {
        this.maxRunDistatnce = maxRunDistatnce;
        this.maxSwimDistance = maxSwimDistance;
        counter++;
    }

    public int getMaxRunDistatnce() {
        return maxRunDistatnce;
    }

    public int getMaxSwimDistance() {
        return maxSwimDistance;
    }


    public abstract void run (int distance);
    public abstract void swim (int distance);

}
