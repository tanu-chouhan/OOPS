public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Tanu","Indore",12334,21);
        Employee e1=new Employee("Prateek","Indore",12334,21,"01");
        Ceo c1=new Ceo("Aanu","Indore",1234,20,"02");
        p1.display();
        System.out.println();
        e1.display();
        System.out.println();
        c1.display();
        c1.reviewProject();
    }
}