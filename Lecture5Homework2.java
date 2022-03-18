/**
 * Напишете програма SpringSeason, в която деинирате 2 int променливи - month & day. Програмата трябвада отпечатва true, ако денят е между 20ти Март (включително) и 20ти Юни (включително) и false в противен случай.
 */
package mypack;

public class Lecture5Homework2 {
    public static void main(String[] args) {
        int month = 9;
        int day = 14;

        String SpringSeason = 3 <= month && day >= 20 || month <= 6 && day <=20 ? "true" : "false";
        System.out.println(SpringSeason);

    }

}