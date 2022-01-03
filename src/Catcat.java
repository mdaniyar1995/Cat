import static java.lang.Math.PI;
import static java.lang.Math.sin;

public class Catcat {
    public static void main(String[] args) {
        Cat barsik = new Cat(550, "sdgdg", 45, "dbdb");
        barsik.meow();
        System.out.println(barsik);
        final Cat bigCat = new Cat(5500, "Murka", 2, "Black");
//создали "большую кошку"
        Cat smallCat = new Cat(1000, "Kuzya", 1, "White");
//создали "маленькую кошку"
        System.out.println(sin(PI/4));
        barsik.meow();
        barsik.meow();
        barsik.meow();

    }
}

