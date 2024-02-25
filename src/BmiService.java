public class BmiService {
    public int calculate(double height, int weight) {

        double calculate = weight / height / height;

        return (int) calculate;
    }
}
