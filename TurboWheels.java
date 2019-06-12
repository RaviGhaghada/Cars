
/**
 *  Wheels that make the car go faster but add weight
 *
 * @author Ravi
 */
public class TurboWheels extends CarModifier
{
    public TurboWheels(Car newCar){
        super(newCar);
    }
    
    public double getPower(){
        return core.getPower()+50;
    }
    
    public double getWeight(){
        return core.getWeight()+10;
    }
    
}
