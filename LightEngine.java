/**
 * A lighter engine that doesn't make the car more 
 * powerful.
 *
 * @author Ravi
 */
public class LightEngine extends CarModifier
{
    public LightEngine(Car newCar){
        super(newCar);
    }
    
    public double getPower(){
        return core.getPower();
    }
    
    public double getWeight(){
        return core.getWeight()-50;
    }
    
    
}