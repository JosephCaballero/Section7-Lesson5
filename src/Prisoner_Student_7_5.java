//Section 7, Lesson 5 Starter for Exercise 1 - Slide 10
import java.util.*;
public class Prisoner_Student_7_5 {
    //Fields
    public String name;
    public double height;
    public int sentence;
    public int celln;
    public boolean door;
    private int code = 2190;
    Scanner sc = new Scanner(System.in);
    //Constructor
    public Prisoner_Student_7_5( String name, double height, int sentence, int celln, boolean door){

        this.name = name;
        this.height = height;
        this.sentence = sentence;
        this.celln = celln;
        this.door = door;
    }

    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(boolean b){
        if (sc.nextInt()==2190) {
            b=true;
            if (b == true) {
                System.out.println("Name: " + name);
                System.out.println("Height: " + height);
                System.out.println("Sentence: " + sentence);
                System.out.println("Cell number: " + celln);
                if (door == true) {
                    System.out.println("Door status: open");
                    System.out.println("Door closed");
                } else {
                    System.out.println("Door status: closed");
                    System.out.println("Door opened");
                }
            }
        }
        else{
            b=false;
        }
    }
    public void openDoor(){

        if(door==true){
            door=false;
        }
        else{
            door=true;
        }
    }
}
