package technology;

public class SmartPhone extends Computer{
    public String getGraphicsType() {
        return graphicsType;
    }

    public void setGraphicsType(String graphicsType) {
        this.graphicsType = graphicsType;
    }

    private String graphicsType;
    public SmartPhone(String brandName, double screenSize, String graphicsType){
        super(brandName,screenSize);
        this.graphicsType= graphicsType;
    }
    public String callAFriend(){
        return " calling a friend...";
    }
}
