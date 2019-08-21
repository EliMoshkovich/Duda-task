public class Motorcycle extends  Vehicle {
    private static final int NON_FUEL = -100;
    private static final float NON_BATTERY = -1.0f;

    private int fuel;
    private float battery;

    public Motorcycle(int _number_of_Wheels, int _fuel){
        super(_number_of_Wheels, new Engine(Engine.EngineType.Fuel));
        this.fuel = _fuel;
        this.battery = NON_BATTERY;
    }

    public Motorcycle(int _number_of_Wheels, float _battery){
        super(_number_of_Wheels, new Engine(Engine.EngineType.Electric));
        this.fuel = NON_FUEL;
        this.battery = _battery;
    }

    @Override
    public float getAmountOfEnergy(){
        if(this.fuel == NON_FUEL){
            return this.battery * 100;
        }
        return this.fuel * 1.0f;
    }

    public String toString(){
        return "Motorcycle{" + super.toString() + " , Amount: " + this.getAmountOfEnergy() + ']';
    }
}
