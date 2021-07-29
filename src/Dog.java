public class Dog extends Animal{
    public static int counter;

    public Dog(int maxRunDistatnce, int maxSwimDistance) {
        super(maxRunDistatnce, maxSwimDistance);
        counter++;
    }

    public Dog () {
        this(500, 10);
    }

    @Override
    public void run(int distance) {
        if (getMaxRunDistatnce() <= distance) {
            System.out.printf("The dog coped with the task: he ran a given distance of %s meters!!! %n", distance);
        } else {
            System.out.printf("The dog is too gentle for such a distance of %s meters :( A fluffy ass will run no more than %s meters %n", distance, getMaxRunDistatnce());
        }
    }

    @Override
    public void swim(int distance) {
        if (getMaxSwimDistance() <= distance) {
            System.out.printf("The dog coped with the task: he swim a given distance of %s meters!!! %n", distance);
        } else {
            System.out.printf("The dog is too gentle for such a distance of %s meters :( A fluffy ass will swim no more than %s meters %n", distance, getMaxSwimDistance());
        }
    }
}

