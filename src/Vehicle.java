import java.lang.*;

public abstract class Vehicle implements Comparable<Vehicle> {
    private int number_of_Wheels;
    private Engine engine_type;

    public Vehicle(int _number_of_Wheels, Engine _engine_type){
        this.number_of_Wheels = _number_of_Wheels;
        this.engine_type = _engine_type;
    }

    public Engine.EngineType getEngineType(){
        return this.engine_type.getType();
    }

    public int getNumberOfWheels(){
        return this.number_of_Wheels;
    }

    public abstract float getAmountOfEnergy();

    public String toString(){
        return "number_of_wheels=" + this.number_of_Wheels +
                ", engine=" + this.engine_type;
    }

    @Override
    public int compareTo(Vehicle other) {
        if(this.engine_type != other.engine_type){
            if(this.engine_type.getType() == Engine.EngineType.Fuel){
                return 1;
            }
            else{
                return -1;
            }
        }

        return Integer.compare((int)other.getAmountOfEnergy(), (int)this.getAmountOfEnergy());
    }
}
