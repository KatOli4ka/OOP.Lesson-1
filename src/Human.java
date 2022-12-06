public class Human {
    private String name;
    private int yearOfBirth;
    private String town;


    public  Human(String name, int yearOfBirth, String town) {
        this.name = name;
        this.yearOfBirth=yearOfBirth;
        this.town=town;

    }

    public String toString() {
        return "Привет. Меня зовут - " + this.name + ". Я из города - " +this.town  + ". Я родился в - " + this.yearOfBirth+" году.  Будем знакомы!" ;
    }
}
