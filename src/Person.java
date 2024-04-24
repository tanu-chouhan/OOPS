public class Person {
    String name;
    String address;
    int contact;
    int age;
    public Person(String name,String address,int contact,int age){
        this.name=name;
        this.address=address;
        this.contact=contact;
        this.age=age;
    }
    public void display(){
        System.out.println(getClass());
        System.out.println("name: "+this.name);
        System.out.println("address: "+this.address);
        System.out.println("contact: "+this.contact);
        System.out.println("age: "+this.age);
    }
    public void talk(String message){
        System.out.println(name + " said "+ message);
    }
    public void walk(String message){
        System.out.println(name+" walk to "+message);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
