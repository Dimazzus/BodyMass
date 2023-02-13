public class BmiService {
    public int calculate(int weight, double height) {
        double result = weight / (height * height);
        int ind = (int) result;
        return ind;
    }
}
