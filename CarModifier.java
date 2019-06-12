public class CarModifier implements Car
{
    protected Car core;
    
    public CarModifier(Car newCore){
        this.core = newCore;
    }
    
    public double getPower(){
        return core.getPower();
    }
    public double getWeight(){
        return core.getWeight();
    }
    public double getSpeed(){
        return getPower()/getWeight();
    }
}
