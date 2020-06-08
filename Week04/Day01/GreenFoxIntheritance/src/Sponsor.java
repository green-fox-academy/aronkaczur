public class Sponsor extends Person{
    String company;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }
    public Sponsor(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "male";
        this.company =  " Google";
        this.hiredStudents = 0;
    }

    int hiredStudents;

    @Override
    public void introduce() {
        System.out.println("Hi, I`m "+this.name + ", a "+this.age+" year old" + this.gender + "who represents "
        + this.company + " and hired "+ this.hiredStudents + "students so far");
    }
    public int hire(){
        return hiredStudents++;
    }
    @Override
    public void getGoal(){
        System.out.println("My goal is: Hire brilliant junior software developers");
    }
}
