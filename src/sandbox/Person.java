package sandbox;

public class Person {
    public String first;
    public String last;
    public int age;

    // constructor
    public Person(String first, String last, int age) {
        this.first = first;
        this.last = last;
        this.age = age;
    }

    @Override
    public String toString() {
        return last +"," + first;
    }

    public void snogs(Person p) {
        System.out.println("Holly smoke, " + this + " snogged " + p);

    }





}
