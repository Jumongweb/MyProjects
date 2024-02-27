package settersAndGetters;

public class Car {
    private String model;
    private int year;
    private int door;
    private int wheel;
    private String color;

    public void setModel(String model){
        if (model.equalsIgnoreCase("lexus") || model.equalsIgnoreCase("tesla")){
            this.model = model;
        }
        else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return String.format("The model is %s", model);
    }
    @Override
    public String toString(){
        return String.format("The model is %s", model);
    }

}
