import java.util.ArrayList;

public class Cohort {
    private String name;
    private ArrayList<Student> students;
    private ArrayList<Mentor> mentors;

    public void addStudent(Student studentToAdd){
        students.add(studentToAdd);
    }

    public void addMentor(Mentor mentorToAdd){
        mentors.add(mentorToAdd);
    }

    public void info(){
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() +
                " mentors.");
    }

    public Cohort(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }
}
