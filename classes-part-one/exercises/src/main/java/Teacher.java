public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsOfTeaching;

    public void setYearsOfTeaching(int yearsOfTeaching) {
        this.yearsOfTeaching = yearsOfTeaching;
    }
    public int getYearsOfTeaching() {
        return yearsOfTeaching;
    }
    public void setFirstName(String name){
        this.firstName=firstName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;

    }
    public String getLastName(){
        return lastName;
    }
    private void setSubject(String subject){
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }

}
