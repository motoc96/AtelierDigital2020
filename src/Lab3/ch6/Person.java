package Lab3.ch6;

public class Person {
    private String name;
    private String job;
    private String university;
    private int drivingLicense;
    private boolean isMarried;

    public Person(String name,String job,String university,int drivingLicense,boolean isMarried){
        this.name=name;
        this.job=job;
        this.university=university;
        this.drivingLicense=drivingLicense;
        this.isMarried=isMarried;
    }

    public Person(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getUniversity() {
        return university;
    }

    public int getDrivingLicense() {
        return drivingLicense;
    }

    public boolean isMarried() {
        return isMarried;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", university='" + university + '\'' +
                ", drivingLicense=" + drivingLicense +
                ", isMarried=" + isMarried +
                '}';
    }
}
