public class Main {
    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Sebastian";
        me.lastName = "Jakubek";
        System.out.println(me);
        Animal dog = new Animal("Borys",20,"dog");
        System.out.println(dog);
        Phone phone = new Phone("POCO","F4 GT","black");
        System.out.println(phone);

    }
}