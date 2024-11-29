package src;

import java.util.Scanner;
public class QuanLyDSPhong {
    DSPhong ds1=new DSPhong();
    public void menu()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Xem danh sách phòng");
        System.out.println("2.Nhập danh sách phòng");
        System.out.println("3.Thêm mới phòng");
        System.out.println("4.Xóa phòng");
        System.out.println("5.Sửa phòng");
        System.out.println("6.Tìm kiếm phòng");
        System.out.println("7.Thoát");
        System.out.println("Chọn chức năng: ");
        int chon=sc.nextInt();
        switch(chon)
        {
            case 1:
                ds1.xuat();
                break;
            case 2:
                ds1.nhap();
                break;
            case 3:
                ds1.them();
            case 4:
                System.out.println("Nhập mã của phòng muốn xóa");
                int ma=sc.nextInt();
                ds1.xoa(ma);
                break;
            case 5:
                ds1.nhap();
                break;
            case 6:
                System.out.println("Nhập mã của phòng muốn tìm kiếm");
                ma=sc.nextInt();
                ds1.timkiem(ma);
                break;
            case 7:
                break;
            default:
                System.out.println("Chọn chức năng không tồn tại");
                break;
        }
    }
}
