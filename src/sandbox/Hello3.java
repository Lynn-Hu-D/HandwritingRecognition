package sandbox;

public class Hello3 {
    public static void main(String[] args) {
        System.out.println("Hello");
        Person x = new Person("Mic", "Smith", 19);
//        x.first = "Jack";
//        x.last = "Smith";
//        x.age = 19;
        System.out.println(x);
        Person s = new Person("Sally", "Joes", 80);
        s.snogs(x);
        Animal a = new Animal("Fido", "dog", "bark");
        System.out.println(a);
    }
}
