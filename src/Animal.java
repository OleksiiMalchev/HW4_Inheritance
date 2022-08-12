public class Animal {
    static int count;
     String name;
    private int obstacleLength;
    public Animal(String name) {
        this.name = name;
        count++;
    }

    public void run(int obstacleLength) {
        System.out.println("I can run");
    }

    public void swim(int obstacleLength) {
        System.out.println("I can swim");
    }
}
