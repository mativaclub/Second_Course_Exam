package OOP_Homework_2;

public class Bicycle extends Vehicle  {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    @Override
    public void service() {
        updateTyre();
    }
}

