package src;

import java.util.Scanner;

class Phong extends ThucThe{
    private double giaPhong;
    private int soPhong;
    private int loaiPhong;
    private boolean isCoPhong;
    private static int soLuongKhachToiDa;
    public Phong  (){
        this.giaPhong = 0;
        this.soPhong = 0;
        this.loaiPhong = 0;
        this.isCoPhong= true;
        this.soLuongKhachToiDa=0;
    }
    //get and set GiaPhong
    public double getGiaPhong(){
        return giaPhong;
    }
    public void setGiaPhong(double giaPhong){
        if (giaPhong > 0) {
            this.giaPhong = giaPhong;
            System.out.println("Giá phòng đã được cập nhật thành: " + giaPhong + "VND"+"/đêm");
        } 
        else {
            System.out.println("Giá phòng không hợp lệ. Vui lòng nhập một giá trị lớn hơn 0");
        }
    }
    //get and set soPhong
    public int getsoPhong(){
        return soPhong;
    }
    public void setSoPhong(int soPhong){
        if (soPhong > 0) {
            this.soPhong = soPhong;
            System.out.println("Số phòng đã được cập nhật thành: " + soPhong + "VND"+"/đêm");
        } 
        else {
            System.out.println("Số phòng không hợp lệ. Vui lòng nhập một giá trị lớn hơn 0");
        }
    }
    //get and set trang thai phong
    public boolean gettrangthaiPhong(){
            return isCoPhong;
    }
    public void settrangthaiPhong(boolean isCoPhong){
        this.isCoPhong = isCoPhong;
    }

    //get and set so khach toi da
    public int getSoLuongKhachToiDa()
    {
        return soLuongKhachToiDa;
    }
    public void setSoLuongLuongKhachToiDa(int soLuongKhachToiDa){
        this.soLuongKhachToiDa= soLuongKhachToiDa;
    }
    //Phương thức nhập thông tin phòng
    @Override 
    public void nhapThongtin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten phong:");
        ten= scanner.nextLine();
        System.out.println("Nhap ma phong:");
        maSo = scanner.nextInt();
        System.out.println("Nhập tình trạng phòng: ");
        isCoPhong=scanner.nextBoolean();
        System.out.println("Nhập giá phòng: ");
        giaPhong=scanner.nextDouble();
        System.out.println("Nhập loaị phòng: ");
        loaiPhong=scanner.nextInt();
        System.out.println("Nhập số phòng: ");
        soPhong=scanner.nextInt();
        System.out.println("Nhập số lượng khách tối đa: ");
        soLuongKhachToiDa=scanner.nextInt();
    }
    // Phương thức hiển thị thông tin phong
    @Override
    public void inThongtin(){
        System.out.println("Tên phòng: "+super.getTen());
        System.out.println("Mã phòng: "+super.getMa());
        System.out.println("Giá phòng: " + giaPhong + "VND");
        System.out.println("Số phòng:"+soPhong);
        System.out.println("Trạng thái phòng:"+isCoPhong);
        System.out.println("SoLuongKhachToiDa:"+soLuongKhachToiDa);
    }
}
