public class Demo1 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("123d");
            System.out.println(num);
        } catch (Exception _) {
            System.out.println("Invalid va :");
        }

    }
}
