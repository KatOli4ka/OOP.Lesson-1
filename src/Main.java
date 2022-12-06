public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Human maksim=new Human("Максим", 1988, "бренд-менеджер", "Минск");
        System.out.println(maksim.toString());
        Human anya=new Human("Аня", 1993, "методист образовательных программ", "Москва");
        System.out.println(anya.toString());
        Human katya=new Human("Катя", 1992, "продакт-менеджер","Калининград");
        System.out.println(katya.toString());
        Human artem=new Human("Артём", 1995, "директор по развитию бизнеса","Москва");
        System.out.println(artem.toString());


    }
}