public class Human {
    private String name;
    private int yearOfBirth;
    private String town;
    private String jobTitle;

    public  Human(String name, int yearOfBirth,String jobTitle, String town) {
        this.name = name;
        this.yearOfBirth=yearOfBirth;
        this.jobTitle=jobTitle;
        this.town=town;
    }
    public String toString() {
        return "Привет. Меня зовут - " + this.name + ". Я из города - " +this.town  + ". Я родился в - " + this.yearOfBirth+" году. Я работаю на должности - "+ this.jobTitle+". Будем знакомы!" ;
    }
}
