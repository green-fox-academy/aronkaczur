public class Mentor extends Person{
    String level;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.level = "intermediate";


    }

    public void getGoal(){
        System.out.println("My goal is: Educate brilliant junior software developers");
    }
    @Override
    public String specialIntroduce(){
        return " " + this.level +" mentor";

    }

}
