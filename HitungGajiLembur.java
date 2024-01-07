import java.util.Scanner;

public class HitungGajiLembur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jam lembur: ");
        int jamLembur = input.nextInt();

        int gajiLembur;

        if (jamLembur < 12) {
            gajiLembur = 100000;
        } else if (jamLembur == 12) {
            gajiLembur = 200000;
        } else {
            gajiLembur = 300000;
        }

        System.out.println("Gaji lembur Anda: Rp. " + gajiLembur);

        input.close();
    }
}
