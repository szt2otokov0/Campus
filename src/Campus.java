public class Campus {
    public static void main(String[] args) {
        Person mark = new Person("Mark",46,true);
        mark.introduce();
        mark.getGoal();

        Person jane = new Person();
        jane.introduce();
        jane.getGoal();

        Student john = new Student("John Doe",20,true,"BME");
        john.introduce();
        System.out.print("My goal is: ");
        john.getGoal();

        Student janeStudent = new Student();
        janeStudent.skipDays(3);
        janeStudent.introduce();
        System.out.print("My goal is: ");
        janeStudent.getGoal();

        Mentor gandhi = new Mentor("Gandhi",148,false,MentorLevel.SENIOR);
        gandhi.introduce();
        System.out.print("My goal is: ");
        gandhi.getGoal();

        Mentor janeMentor = new Mentor();
        janeMentor.introduce();
        System.out.print("My goal is: ");
        janeMentor.getGoal();

        Sponsor janeSponsor = new Sponsor();
        for (int i = 0;i < 3;i++) {
            janeSponsor.hire();
        }
        janeSponsor.introduce();
        System.out.print("My goal is: ");
        janeSponsor.getGoal();

        Sponsor elon = new Sponsor("Elon Musk",46,true,"SpaceX");
        for(int i = 0;i < 5;i++){
            elon.hire();
        }
        elon.introduce();
        System.out.print("My goal is: ");
        elon.getGoal();

        Cohort awesome = new Cohort("AWESOME");
        awesome.addStudent(john);
        awesome.addStudent(janeStudent);
        awesome.addMentor(gandhi);
        awesome.addMentor(janeMentor);
        awesome.info();

    }
}