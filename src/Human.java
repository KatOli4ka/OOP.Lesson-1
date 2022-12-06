public class Human {
    private String name;
    private int yearOfBirth;
    private String town;
    private String jobTitle;

    public  Human(String name, int yearOfBirth,String jobTitle, String town) {
        if (name == null|| name.isEmpty()){
            this.name="Информация не указана";
        }   else this.name = name;
        if (yearOfBirth>=0) {
            this.yearOfBirth = yearOfBirth;
        }   else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if (jobTitle == null||jobTitle.isEmpty()){
            this.jobTitle="Информация не указана";
        }   else this.jobTitle = jobTitle;
        if (town == null||town.isEmpty()){
            this.town="Информация не указана";
        }   else this.town=town;

        }
    public String toString() {
        return "Привет. Меня зовут - " + this.name + ". Я из города - " +this.town  + ". Я родился в - " + this.yearOfBirth+" году. Я работаю на должности - "+ this.jobTitle+". Будем знакомы!" ;
    }
}
