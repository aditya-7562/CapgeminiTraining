package entity;

public class Car {
    // for field injection
//    public Engine engine;

    // for setter injection
    private Engine engine;
    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    // for constructor injection
    public Car() {
    }

    public Car(Engine engine) {
        this.engine = engine;
    }
}
