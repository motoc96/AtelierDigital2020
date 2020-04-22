package Lab2;

public class Drawer {

    int numberOfDrawers =0;

    void setNumberOfDrawers(int number){

        this.numberOfDrawers = number;

    }

    void openDrawer(int number){

        System.out.println("Drawer "+ number +" is opened.");

    }

    void closeDrawer(int number){

        System.out.println("Drawer "+ number + "is closed");

    }

    void takeFile(int number){

        System.out.println("A file from drawer "+ number +"was taken.");

    }

    void putFile(int number){

        System.out.println("A file was put in drawer "+ number);

    }


}
