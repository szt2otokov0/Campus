public class Campus {
    public static void main(String[] args) {
        Person mark = new Person("Mark",(byte)46,true);
        mark.introduce();
        System.out.print("My goal is: ");
        mark.getGoal();

        Person jane = new Person();
        jane.introduce();
        System.out.print("My goal is: ");
        jane.getGoal();

        Student john = new Student("John Doe",(byte)20,true,"BME");
        john.introduce();
        System.out.print("My goal is: ");
        john.getGoal();

        Student janeStudent = new Student();
        janeStudent.introduce();
        System.out.print("My goal is: ");
        janeStudent.skipDays(3);
        janeStudent.getGoal();

        Mentor gandhi = new Mentor("Gandhi",(byte)148,false,MentorLevel.SENIOR);
        gandhi.introduce();
        gandhi.getGoal();

        Mentor janeMentor = new Mentor();
        janeMentor.introduce();
        janeMentor.getGoal();

        Sponsor janeSponsor = new Sponsor();
        for (int i = 0;i < 3;i++) {
            janeSponsor.hire();
        }
        janeSponsor.introduce();
        janeSponsor.getGoal();

        Sponsor elon = new Sponsor("Elon Musk",(byte)46,true,"SpaceX");
        //todo: finish introductions
    }
}