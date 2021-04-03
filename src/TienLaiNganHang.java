import java.util.Scanner;

public class TienLaiNganHang {
    public static void main(String[] args) {
        double tienGui;
        int thangGui;
        double tiLeLai;

        Scanner input =new Scanner(System.in);
        System.out.println("Nhập số tiền gửi");
        tienGui=input.nextDouble();
        System.out.println("Nhập số tháng gửi");
        thangGui= input.nextInt();
        System.out.println("Nhập lãi suất");
        tiLeLai= input.nextDouble();

        double tienLai=0;
        for (int i = 0; i < thangGui ; i++) {
            tienLai += tienGui*(tiLeLai/100)/12*thangGui;
        }

        System.out.println("Tiền Lãi là " + tienLai);
    }
}
