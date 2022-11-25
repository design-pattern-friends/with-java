package org.strategy.caculator;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("plus 또는 minus를 입력해주세요");
        String plusOrMinus = br.readLine();

        System.out.println("value1을 입력해주세요.");
        double value1 = Double.parseDouble(br.readLine());

        System.out.println("value2을 입력해주세요.");
        double value2 = Double.parseDouble(br.readLine());

        if (plusOrMinus.equals("plus")) {
            People people = new People(new PlusCalculator(), value1, value2);
            System.out.println("plus : " + people.execute());
        } else {
            People people = new People(new MinusCalculator(), value1, value2);
            System.out.println("minus : " + people.execute());
        }

    }
}