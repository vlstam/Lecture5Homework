/**
 * Направете програма BMI, с която да изчислите вашият Body Mass Index
 */
package mypack;

public class Lecture5Homework3 {
    public static void main(String[] args) {
        int kg = 92;
        float hight = 1.80f;
        double BMI = kg/Math.pow(hight,2);
        System.out.println(BMI);

    }

}