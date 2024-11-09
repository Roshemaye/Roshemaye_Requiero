interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}
class Gorilla implements Animal {
    private boolean isHungry;

    public Gorilla() {
        this.isHungry = true; 
    }

    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat && isHungry) {
            isHungry = false;
            System.out.println("Gorilla has been fed.");
            return true;
        }
        return false;
    }

    @Override
    public void groom() {
        System.out.println("Gorilla is being groomed.");
    }

    @Override
    public void pet() {
        System.out.println("You pet the gorilla. Be cautious!");
    }
}
public class Tasksheet129{
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        gorilla.feed(true);
        gorilla.groom();
        gorilla.pet();
    }
}
