/**
 * Напишете програма Distance, която изчислява разстоянието от точка (x,y) до (0,0) по формулата:
 */
package mypack;

public class Lecture5Homework1 {
    public static void main(String[] args) {
        float x = 25f;
        float y = 37f;
        double Distance = Math.sqrt((Math.pow(x,2) + Math.pow(y,2)));
        System.out.println(Distance);
    }
}