public class Main {
    public static void main(String[] args) {
        final double d=10, h=3, weight=750, Pi=3.14;
        double V, Weight;
        V=Pi*(d/2)*(d/2);
        Weight=weight*V;
        System.out.println("The volume is:"+V+"; The total storage weight is:"+Weight);
    }
}