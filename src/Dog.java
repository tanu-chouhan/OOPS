public class Dog extends Animal {
    public Dog(String name,String colour){
        super(name,colour,4,true,false);
    }

    @Override
    public void talk(String massage) {
        super.talk("bow bow ("+massage+")");
    }
}
