package BatchParticipantRelation;

public class Participant {
    String name;
    private int age;
    private int Id;

    public Participant(String name, int age, int Id) {
        this.name = name;
        this.age = age;
        this.Id = Id;
    }

    public String get() {
        return "The name is " + this.name + "The age is "+ this.age + " Id no. is " + this.Id + ".";
    }
}