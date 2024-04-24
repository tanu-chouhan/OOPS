public class Employee extends Person{
    String id;
    public Employee(String name,String address,int contact,int age, String id){
        super(name,address,contact,age);
        this.id=id;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("id: "+this.id);
    }

}
