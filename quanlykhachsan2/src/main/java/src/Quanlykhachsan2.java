/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package src;

/**
 *
 * @author duong
 */
import java.util.Scanner;
public class Quanlykhachsan2 {

    public static void main(String[] args) {
        QuanLyDSBooking ds1= new QuanLyDSBooking();
        QuanLyDSKhachHang ds2= new QuanLyDSKhachHang();
        QuanLyDSPhong ds3= new QuanLyDSPhong();
        QuanLyDSNhanVien ds4= new QuanLyDSNhanVien();
        System.out.println("Chọn truy cập chức năng dưới tư cách:");
        System.out.println("1. Quản trị viên");
        System.out.println("2. Nhân viên");
        System.out.println("3. Khách hàng");
        Scanner sc = new Scanner(System.in);
        int chon, chon1, chon2, chon3;
        
        // Menu chính
        System.out.println("Chọn menu chức năng:");
        System.out.println("1. Quản lý phòng");
        System.out.println("2. Quản lý nhân viên");
        System.out.println("3. Quản lý khách hàng");
        System.out.println("4. Quản lý đặt phòng");
        chon = sc.nextInt();
        
        switch (chon) {
            case 1:
                System.out.println("Chọn menu chức năng:");
                System.out.println("1. Quản lý phòng");
                System.out.println("2. Quản lý nhân viên");
                System.out.println("3. Quản lý khách hàng");
                System.out.println("4. Quản lý đặt phòng");
                chon1 = sc.nextInt();
                switch (chon1) {
                    case 1:
                        ds3.menu();
                        break;
                    case 2:
                        ds4.menu();
                        break;
                    case 3:
                        ds2.menu();
                        break;
                    case 4:
                        ds1.menu();
                        break;
                    default:
                        System.out.println("Chọn không hợp lệ");
                        break;
                }
                break;
                
            case 2:
                System.out.println("Chọn menu chức năng:");
                System.out.println("1. Quản lý nhân viên");
                chon2 = sc.nextInt();
                if (chon2 == 1) {
                    ds4.menu();
                } else {
                    System.out.println("Chọn không hợp lệ");
                }
                break;
                
            case 3:
                System.out.println("Chọn menu chức năng:");
                System.out.println("1. Quản lý khách hàng");
                chon3 = sc.nextInt();
                if (chon3 == 1) {
                    ds2.menu();
                } else {
                    System.out.println("Chọn không hợp lệ");
                }
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
                break;
        }
    }
}
