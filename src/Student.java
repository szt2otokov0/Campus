public class Student extends Person{
    private String previousOrganization;
    private int skippedDays;

    @Override
    public void getGoal(){
        System.out.println("Be a junior software developer.");
    }

    @Override
    public void introduce(){
        System.out.println("Hi, I'm " + name + ", a " + age + "year old " + gender + " from " + previousOrganization +
                " who has skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays){
        skippedDays += numberOfDays;
    }

    public Student(String name, byte age, boolean gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        skippedDays = 0;
    }

    public Student() {
        super();
        this.previousOrganization = "The School of Life";
        skippedDays = 0;
    }
}
