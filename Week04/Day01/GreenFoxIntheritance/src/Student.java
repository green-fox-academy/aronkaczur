public class Student extends Person {
    String previousOrganization;
    int skippedDays;


    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student(){
        this.name = "Jane Doe";
        this.age=30;
        this.gender="female";
        this.previousOrganization = "The School of Life";
        this.skippedDays=0;
   }


    @Override
    public  void getGoal(){
        System.out.println("My goal is: Be a junior software developer");
    }
    @Override

    public String specialIntroduce(){
        return " from " +this.previousOrganization + " who skipped " + this.skippedDays + "days from the course already" ;

        }
        public void skipDays(int numberOfDays) {
        skippedDays = +numberOfDays;
    }
}
