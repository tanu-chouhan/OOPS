public class Main {
    public static void main(String[] args) {

//        Dog tomyy = new Dog("tommy","black",4);
//        Eagle egu = new Eagle("egu","brown",2);
//
//        tomyy.eat("panner");
//        egu.eat("warms");
//        tomyy.talk();
//        egu.talk();

        Dog dog = new Dog("Tommy","black","Golden Retriever");
        Eagle egu = new Eagle("egu","brown");
        System.out.println(dog.name);
        System.out.println(egu.name);
        dog.eat("paddy");
        egu.eat("egg");
        dog.talk("hello");
        egu.talk("hi");
        System.out.println();
        System.out.println(dog);
        System.out.println(egu);
        System.out.println();
        dog.display();
        System.out.println();
        egu.display();
    }
}