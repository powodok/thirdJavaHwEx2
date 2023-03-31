package org.example;

public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();

        double weight = 66; // кг
        double height = 1.88; // м
        int bmi = bmiService.calculate(weight, height);

        System.out.println("Ваш индекс тела (BMI) = " + bmi);
    }
}

