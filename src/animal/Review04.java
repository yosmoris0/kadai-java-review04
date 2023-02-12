package animal;

public class Review04 {

    public static void main(String[] args) {
        Human tanaka = new Human("田中 太郎", 25, "電車");
        tanaka.say();
        tanaka.think();

        Human suzuki = new Human("鈴木 次郎 ", 30, "野球");
        suzuki.say();
        suzuki.think();

        Human sato = new Human("佐藤 花子", 20, "映画");
        sato.say();
        sato.think();

    }
}