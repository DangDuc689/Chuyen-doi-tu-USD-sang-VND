import java.util.Scanner;

public class doiTien {
    public static void main(String[] args) {
        float USD, tiGia;
        Scanner sc = new Scanner(System.in);

        System.out.println("Vui long nhap so USD can doi: ");
        USD = sc.nextFloat();

        tiGia = (float) (USD * 23.500);
        System.out.println("so USD sau khi doi la: " +tiGia +" VND");
    }
}
