import java.util.Scanner;
public class Discount{
    
    public static void main(String[]args) throws Exception {
        Double totalBelanja, discount;

        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan total  belanja:");
        totalBelanja = inputan.nextDouble();

        if (totalBelanja >= 100000) {
            discount = 5/100 * totalBelanja;
            totalBelanja = totalBelanja - discount;


            System.out.println("Total yang harus dibayar:" + totalBelanja);
        }

        inputan.close();
    }
}

