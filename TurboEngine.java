
/**
 * A heavy but powerful engine
 *
 * @author Ravi
 */
public class TurboEngine extends CarModifier
{
    public TurboEngine(Car newCar){
        super(newCar);
    }
    
    public double getPower(){
        return core.getPower()+100;
    }
    
    public double getWeight(){
        return core.getWeight()+20;
    }
    
    
}