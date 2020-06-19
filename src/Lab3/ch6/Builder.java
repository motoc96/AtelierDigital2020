package Lab3.ch6;

public class Builder {
    private String name;
    private String job ="";
    private String university="";
    private int drivingLicense;
    private boolean isMarried=false;

    public Builder(String name){
        this.name=name;
    }

    public Builder setJob(String job){
        this.job=job;
        return this;
    }
    public Builder setUniversity(String university){
        this.university=university;
        return this;
    }
    public Builder setDrivingLicense(int drivingLicense){
        this.drivingLicense=drivingLicense;
        return this;
    }
    public Builder setIsMarried(boolean isMarried){
        this.isMarried=isMarried;
        return this;
    }
    public Person build(){
        return new Person(name,job,university,drivingLicense,isMarried);
    }
}
