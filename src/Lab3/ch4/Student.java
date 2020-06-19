package Lab3.ch4;

public class Student implements Observer {

    private String name;
    private Teacher teacher;

    public Student(String name) {
        this.name = name;
    }


    @Override
    public void update(String message) {
        if(message == null){
            System.out.println(name + " Didn't learned anything");
        } else System.out.println(name + " learned about "+ message);
    }
    public void listenTo(Teacher teacher){
        this.teacher = teacher;
        teacher.register(this);
    }
    public void stopListenTo(Teacher teacher){
        this.teacher = teacher;
        teacher.unregister(this);
    }
}
