public class Calculator {
    private int sum;
    public Calculator() {
        this.sum = 0;
    }

    public void add(int x) {
       sum = sum + x;
    }

    public void takeAway(int x) {
        sum-=x;
    }

    public String reading() {
        return Integer.toString(sum);
    }

    public void zero() {
        sum = 0;
    }

    public int getSum() {
        return sum;
    }
}
