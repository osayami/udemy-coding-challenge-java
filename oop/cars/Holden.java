package cars;

public class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String startEngine() {
        return "Holden -> startEngine()";
    }
    @Override
    public String accelerate() {
        return "Holden -> accelerate()";
    }@Override
    public String brake() {
        return "Holden -> brake()";
    }
    
}
