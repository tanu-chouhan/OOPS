public class Car {

    public Car(String name, String colour, int hp, int price){
        this.name = name;
        this.colour = colour;
        this.hp = hp;
        this.price = price;
    }

    public Car(String name,String colour){
        this.name=name;
        this.colour=colour;
    }

    String name;
    String colour;
    int hp;
    int price;

    @Override
    public String toString() {
        return "Name: "+this.name+", HP: "+this.hp+", colour: "+this.colour+", price: "+this.price;
    }
}
