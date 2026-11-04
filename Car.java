import java.awt.*; //main to be added

//Car is the dad and has two children Volvo240 and Saab95.
//Car preserve all the shared features of both cars.
//Combined all the shared features into one file.
public abstract class Car  {
    public int nrDoors;
    public double enginePower;
    public double currentSpeed;
    public Color color;
    public String modelName;
    public int getNrDoors() {
        return nrDoors;
    }
    public double getEnginePower() {
        return enginePower;
    }
    public double getCurrentSpeed() {
        return currentSpeed;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color clr) {
        color = clr;
    }
    public void startEngine() {
        currentSpeed = 0.1;
    }
    public void stopEngine() {
        currentSpeed = 0;
    }
    public void incrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() + speedFactor() * amount; //TODO SpeedFactor
    }
    public void decrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() - speedFactor() * amount; //TODO SpeedFactor
    }
    public void gas(double amount) {
        incrementSpeed(amount);
    }
    public void brake(double amount) {
        decrementSpeed(amount);
    }
    //Different speedFactor calculation for each car model.
    //Every subclass must have its own version.
    //speedFactor is limited use for the dad and children.
    //abstract: used because the children can calculate the speedFactor but not the dad.
    //We will implement their own versions inside it later.
    protected abstract double speedFactor();
}
//Saab
//  public double speedFactor() {
//        double turbo = 1;
//        if(turboOn) turbo = 1.3;
//        return enginePower * 0.01 * turbo;

//Volvo
//  public double speedFactor() {
//        return enginePower * 0.01 * trimFactor;
//    }

//VOLVO
// TODO fix this method according to lab pm
//    public void gas(double amount) {
//        incrementSpeed(amount);
//    }

// TODO fix this method according to lab pm
//    public void brake(double amount) {
//        decrementSpeed(amount);
//    }
//}

//SAAB
// TODO fix this method according to assignment pm
//    public void gas(double amount) {
//        incrementSpeed(amount);
//    }

// TODO fix this method according to assignment pm
//    public void brake(double amount) {
//        decrementSpeed(amount);
//    }
//}
