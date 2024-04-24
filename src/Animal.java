import java.util.jar.Attributes;

public class Animal {
    String name;
    String colour;
    int noOfLegs;
    boolean hasTail;
    boolean doesFly;

    public Animal(String name,String colour,int legs,boolean hasTail,boolean doesFly){
        this.colour=colour;
        this.doesFly=doesFly;
        this.noOfLegs=legs;
        this.hasTail=hasTail;
        this.name=name;
    }

    public void eat(String food){
        System.out.println(this.name+" is eating "+food);
    }
    public void talk(String massage){
        System.out.println(this.name+" said : "+massage);
    }
    public void display(){
        System.out.println(getClass());
        System.out.println("Name: "+this.name);
        System.out.println("colour: "+this.colour);
        System.out.println("legs: "+this.noOfLegs);
        System.out.println("Does fly: "+this.doesFly);
        System.out.println("Has Tail: "+this.hasTail);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
