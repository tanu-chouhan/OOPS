public class Eagle extends Animal{
    public Eagle(String name,String colour){
        super(name,colour,2,true,true);
    }

    @Override
    public void talk(String massage) {
        super.talk("chi chi ("+massage+")");
    }
}
