import java.util.Locale;

public class Mentor extends Person{
    private MentorLevel level;

    @Override
    public void getGoal(){
        System.out.println("Educate brilliant junior software developers");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " a " + level.name().toUpperCase(Locale.ENGLISH) + "level mentor.");
    }

    public Mentor(String name, byte age, boolean gender, MentorLevel level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor() {
        super();
        this.level = MentorLevel.INTERMEDIATE;
    }
}

