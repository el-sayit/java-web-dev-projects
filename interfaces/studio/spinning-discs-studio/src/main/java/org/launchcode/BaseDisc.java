package org.launchcode;

public abstract class BaseDisc {
private static int nextID = 1;
private int id;
private String name;
private String discType;
private int spinRate;
public BaseDisc(String name, String discType, int spinRate){
    this.name = name;
    this.discType=discType;
    this.spinRate= spinRate;
    this.id=nextID;
    nextID++;
    }
    //getters and setters
    public static int getNextID(){
    return nextID;
    }
    public int getId(){
    return id;
    }
    public String getName(){
    return name;

    }
    public void setName(String name){
    this.name=name;
    }
    public int getSpinRate(){
    return spinRate;
    }
    public void setSpinRate(int spinRate){
    this.spinRate = spinRate;

    }
    public String getDiscType(){
    return discType;
    }
    public void setDiscType(String discType){
    this.discType = discType;
    }
@Override
    public String toString(){
    String newline = System.lineSeparator();
    String astericks = "*****"
    return newline + astericks + " " + astericks + newline+
            " ID: " + id + newline +
            " Disc Type: " + discType + newline +
            " Spin rate: " + spinRate + " RPM" + newline;
}
void spinDisc(){
    String newline = System.lineSeparator();
    System.out.println(newline + "The "+ discType + " " + name + " is spinning at " + spinRate + " RPM" );
}
}
