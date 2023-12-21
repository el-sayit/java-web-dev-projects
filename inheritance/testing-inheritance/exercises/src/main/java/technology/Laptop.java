package technology;

public class Laptop extends Computer{
    public String getGraphicsType() {
        return graphicsType;
    }

    public void setGraphicsType(String graphicsType) {
        this.graphicsType = graphicsType;
    }

    private String graphicsType;
    public Laptop(String brandName, double screenSize,String graphicsType){
        super(brandName,screenSize);
        this.graphicsType = graphicsType;
    }
    public String takePicture(){
        return "Say cheeese";
    }
}
