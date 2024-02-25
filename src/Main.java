//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height= 1.87; // "m"
        int weight = 98; // "kg"
        int index = service.calculate(1.87, 98);
        System.out.println("Bmiindex =" + index);
    }
}