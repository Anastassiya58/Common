public class Common {
    public static void main(String[] args) {
        String ring = "Do you want to answer?";
        boolean a,b;
        a = ring.equalsIgnoreCase("cat");
        b = ring.equalsIgnoreCase("Do you want to answer?");
        String s1 =Boolean.toString(a);
        String s2 =Boolean.toString(b);
        s1 = s1.toUpperCase();
        System.out.println(a +" " + s1);
        System.out.println(b +" " + s2);

    }
}
