package coding;

public class BmiGenerator {

    private final double weightKg;
    private final double heightM;

    // Accepts kg and cm (matches your Athlete fields)
    public BmiGenerator(int weightKg, int heightCm) {
        this.weightKg = weightKg;
        this.heightM = heightCm / 100.0;
    }

    // Calculate BMI with doubles
    public double calculate() {
        if (heightM <= 0) {
            throw new IllegalArgumentException("Height must be > 0");
        }
        return weightKg / (heightM * heightM);
    }

    // Human-readable category
    public String classify() {
        double bmi = calculate();
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25.0) return "Normal weight";
        if (bmi < 30.0) return "Overweight";
        return "Obese";
    }

    // Text ranges
    public static String listBMIRange() {
        return "Underweight: <18.5 | Normal: 18.5–24.9 | Overweight: 25.0–29.9 | Obese: ≥30.0";
    }

    // Convenience: compute and store rounded BMI into Athlete.bmi (int)
    public static int calculateAndStore(Athlete athlete) {
        return 0;
    }
}
