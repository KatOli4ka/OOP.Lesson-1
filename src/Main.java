public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Human maksim=new Human(null, -1988, "бренд-менеджер", "Минск");
        System.out.println(maksim.toString());
        Human anya=new Human("Аня", 1993, "", "Москва");
        System.out.println(anya.toString());
        Human katya=new Human("Катя", 1992, "продакт-менеджер","Калининград");
        System.out.println(katya.toString());
        Human artem=new Human("Артём", 1995, null,"Москва");
        System.out.println(artem.toString());

        System.out.println("Задание 2");
        Car lada=new Car("","Granta","желтый", 1.7,"Россия", 2015);
        System.out.println(lada.toString());
        Car audi=new Car("Audi","null","черный", 3.0,"Германия", 2020);
        System.out.println(audi.toString());
        Car bmw=new Car("BMW","Z8","черный", 0,"Германия", 2021);
        System.out.println(bmw.toString());
        Car kia=new Car("Kia","Sportage 4-го поколения","", 2.4,"Южная Корея", 2018);
        System.out.println(kia.toString());
        Car hyundai=new Car("Hyundai","Avante","оранжевый", 1.6,"Южная Корея", 0);
        System.out.println(hyundai.toString());
    }
}