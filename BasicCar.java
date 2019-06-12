
/**
 * Write a description of class BasicCar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BasicCar implements Car
{

    public double getPower(){
        return 10000;
    }
    public double getWeight(){
        return 1000;
    }
    public double getSpeed(){
        return getPower()/getWeight();
    }
}
