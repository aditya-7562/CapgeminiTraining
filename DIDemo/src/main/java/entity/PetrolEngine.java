package entity;

public class PetrolEngine implements Engine{

    @Override
    public void run() {
        System.out.println("Car running with less vibrations!");
    }
}
