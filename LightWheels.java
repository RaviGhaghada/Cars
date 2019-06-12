/**
 * A lighter version of an engine
 *
 * @author Ravi
 */
public class LightWheels extends CarModifier
{
    public LightWheels(Car newCar){
        super(newCar);
    }
    
    public double getPower(){
        return core.getPower();
    }
    
    public double getWeight(){
        return core.getWeight()-20;
    }
    
    
}