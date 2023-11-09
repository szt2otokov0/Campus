public class Person {
    protected String name;
    protected byte age;
    protected boolean gender;

    public void getGoal(){
        System.out.println("My goal is: live for the moment!");
    }

    public void introduce(){
        System.out.println("Hi, I'm " + name + ", a " + age + "year old " + gender + ".");
    }

    public Person(String name, byte age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        name = "Jane Doe";
        age = 30;
        gender = false;
    }
}
