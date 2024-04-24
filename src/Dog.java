public class Dog extends Animal {
    String breed;
    public Dog(String name,String colour,String breed){
        super(name,colour,4,true,false);
        this.breed=breed;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Breed: "+this.breed);
    }

    @Override
    public void talk(String massage) {
        super.talk("bow bow ("+massage+")");
    }
}
