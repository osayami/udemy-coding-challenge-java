package cars;

public class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }
    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }@Override
    public String brake() {
        return "Ford -> brake()";
    }
    
}
