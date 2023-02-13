public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98;
        double height = 1.87; //рост вводим в метрах
        int index = service.calculate(weight, height);
        System.out.println(index);








    }
}