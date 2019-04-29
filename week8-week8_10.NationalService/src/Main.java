public class Main {
    public static void main(String[] args) {
        // Test your code here!
        CivilService sc = new CivilService();
        System.out.println(sc.getDaysLeft());
        sc.work();
        System.out.println(sc.getDaysLeft());
        sc.work();
        System.out.println(sc.getDaysLeft());
        sc.work();
        System.out.println(sc.getDaysLeft());
    }
}
