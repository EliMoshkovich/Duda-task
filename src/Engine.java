
public class Engine {
    public static enum EngineType {
        Fuel,
        Electric,
    }

    private EngineType type;

    public Engine(EngineType _type){
        this.type = _type;
    }

    public EngineType getType(){
        return this.type;
    }
    public String toString(){
        if(this.type == EngineType.Fuel){
            return "Fuel";
        }
        if(this.type == EngineType.Electric){
            return "Electric";
        }
        return "Invalid Engine Type";
    }
}

