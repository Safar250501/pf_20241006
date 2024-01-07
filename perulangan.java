import java.util.Scanner;
public class perulangan {
    public static void main(String[] args) {
        Scanner coba = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int jml = coba.nextInt();
        for(int i = 1; i<= jml; i++){
            for(int j = 1; j < i; j++){
                System.out.print("*  ");
            }
            System.out.println("*");
        }
        coba.close();
    }
}
