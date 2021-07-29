public class Cat extends Animal{
    public static int counter;

    public Cat(int maxRunDistatnce, int maxSwimDistance) {
        super (maxRunDistatnce, 0);
        counter++;
    }

    public Cat() {
        this (200, 0);
    }

    @Override
    public void run(int distance) {
        if (getMaxRunDistatnce() <= distance) {
            System.out.printf("The cat coped with the task: he ran a given distance of %s meters ^_^", distance);
        } else {
            System.out.printf("The cat is too gentle for such a distance of %s meters :( A fluffy ass will run no more than %s meters", distance, getMaxRunDistatnce());
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("The cat refused to swim!");
    }
}
