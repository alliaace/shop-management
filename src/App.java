import classses.check;

public class App {
    public static void main(String[] args) throws Exception {
        check obj = new check("myname");
        p(obj.getName());

    }

    public static void p(Object a) {
        System.out.println(a);

    }
}
