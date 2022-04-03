package cars;

public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
        //TODO Auto-generated constructor stub
    }
    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }
    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }@Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
    
}
