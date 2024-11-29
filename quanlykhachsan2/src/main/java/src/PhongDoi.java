package src;

import java.util.Scanner;
public class PhongDoi extends Phong{
    private double dienTich;
    private boolean isGiuongDoi;
public PhongDoi(){
    this.dienTich=0;
    this.isGiuongDoi= true;
}
//get and set dien tich
public void setDienTich(double dienTich){
    this.dienTich= dienTich;
}
public double getDienTich()
{
    return dienTich;
}
//get and set is giuong doi
public void setIsGiuongDoi(boolean isGiuongDoi){
    this.isGiuongDoi = isGiuongDoi;
}
public boolean getIsGiuongDoi()
{
    return isGiuongDoi;
}
@Override 
public void nhapThongtin()
{
    Scanner sc=new Scanner(System.in);
    super.nhapThongtin();
    System.out.println("Nhap dien tich: ");
    this.dienTich = sc.nextDouble();
}
@Override
public void inThongtin()
{
    super.inThongtin();
    System.out.println("Dien Tich: "+dienTich+"m2");
    System.out.println("Giường đôi:"+isGiuongDoi);
}
}
