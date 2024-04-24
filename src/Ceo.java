public class Ceo extends Employee{
    public  Ceo(String name,String address,int contact,int age, String id){
        super(name,address,contact,age,id);
    }
    public void reviewProject(){
        System.out.println(name+" is reviewing project");
    }
}
