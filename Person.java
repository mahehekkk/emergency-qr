public class Person {
    private String name;
    private int age;
    private EmergencyProfile profile;

    public Person(String name, int age, EmergencyProfile profile) {
        this.name = name;
        this.age = age;
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public EmergencyProfile getProfile() {
        return profile;
    }
}
