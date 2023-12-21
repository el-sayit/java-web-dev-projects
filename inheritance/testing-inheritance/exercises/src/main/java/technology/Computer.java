package technology;

public class Computer {
    private String brandName;
    private double screenSize;
    private boolean isFunctioning = true;
    public Computer(String brandName, double screenSize){
        this.brandName = brandName;
        this.screenSize = screenSize;
    }
    public String turnOn(){
        return "The " + this.brandName + "is ON";
    }
    public String turnOff(){
        return "The " + this.brandName + "is OFF";
    }

    //Getters and setters
    public String getBrandName(){
        return brandName;
    }
    public void setBrandName(){
        this.brandName=brandName;
    }
    public double getScreenSize(){
        return screenSize;

    }
    public void setScreenSize(){
        this.screenSize=screenSize;
    }
    public boolean getFunctioning(){
        return isFunctioning;
    }
    public void setFunctioning(){
        this.isFunctioning = isFunctioning;
    }
}
