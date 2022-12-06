package mission1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DrawCircle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("자동으로 원을 그려드립니다!");
        System.out.println("자연수 1과 80 사이의 값을 입력해주세요");

        int a = Integer.parseInt(br.readLine());
        int i,j = 0;
        int b = a-1;

        if (a <= 0 || a >= 81) {
            System.out.println("Error");
        }
        else {


        System.out.println();
        System.out.println("주문하신 원 나왔습니다!");

        for (i = 0; i <= b; i++) {
            for (j = 0; j <= b; j++) {
                int d = (int) Math.sqrt((i - b/2) * (i - b/2) + (j - b/2) * (j - b/2));
                if (d <= b/2) {
                    System.out.print(" º ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        }
    }
}

