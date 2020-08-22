public class Main {
    public static void main(String[] args) {
        BmiService  service = new BmiService ();
        float index = service.calculate(51,1.60f);
        System.out.println(index);
    }
}
