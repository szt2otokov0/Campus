public class Person {
    protected String name;
    protected int age;
    protected boolean gender;

    public void getGoal(){
        System.out.println("My goal is: live for the moment!");
    }

    public void introduce(){
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + getGenderString() + ".");
    }

    protected String getGenderString(){
        return gender ? "male" : "female";
    }

    public Person(String name, int age, boolean gender) {
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
