package src;

import java.util.Scanner;
public class QuanLyDSKhachHang {
    DSKhachHang ds1=new DSKhachHang();
    public void menu()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Xem danh sách khách hàng");
        System.out.println("2.Nhập danh sách khách hàng");
        System.out.println("3.Thêm mới khách hàng");
        System.out.println("4.Xóa khách hàng");
        System.out.println("5.Sửa khách hàng");
        System.out.println("6.Tìm kiếm");
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
                System.out.println("Nhập mã của khách hàng muốn xóa");
                int ma=sc.nextInt();
                ds1.xoa(ma);
                break;
            case 5:
                ds1.nhap();
                break;
            case 6:
                System.out.println("Nhập mã của khách hàng muốn tìm kiếm");
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
