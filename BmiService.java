
public class BmiService {
    public float calculate(int weight, float growth) {

        float BMI = weight / (growth * growth);
        return BMI;
    }
}
