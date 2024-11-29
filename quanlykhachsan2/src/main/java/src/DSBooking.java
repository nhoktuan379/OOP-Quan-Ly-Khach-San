package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

class DSBooking implements GiaoDien{
    Booking[] dsBooking;
    int n4;
    public DSBooking(){
        this.n4 = 0;
        dsBooking = new Booking[0];
    }
    @Override
    public void nhap() {
    //nhập n từ bàn phím ……, nhập n booking như sau
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số lượng booking: ");
        n4=sc.nextInt();
        dsBooking = new Booking[n4];
        for (int i=0;i<n4;i++) {
                dsBooking[i]=new Booking();
                dsBooking[i].NhapBooking();
        }
    }
    @Override
    public void xuat() {
        for (int i=0;i<n4;i++) {
        dsBooking[i].InBooking();
        }
    }   
    @Override
    public void them(){
        dsBooking = Arrays.copyOf(dsBooking, n4+1);
        dsBooking[n4]=new Booking();
        dsBooking[n4].NhapBooking();
        n4++;
    }
    @Override
    public void xoa (int ma) {
        for(int i = 0; i < n4; i++)
        {
            if(dsBooking[i].getMaBooking() == ma)
            {
                for(int j = i; j < n4-1; j++){
                dsBooking[j] = dsBooking[j+1];
                }
                dsBooking = Arrays.copyOf(dsBooking, n4-1);
                n4--;
                break;
            }
        }
    }
    @Override
    public void timkiem (int ma){
        for(int i = 0; i < n4; i++)
        {
            if(dsBooking[i].getMaBooking() ==ma)
            {
                System.out.println("Phòng bạn tìm kiếm có trong danh sách");
            }
        }
    }
    public void ReadFile()
    {
        try 
        {
            BufferedReader input = new BufferedReader(new FileReader("data.txt"));
            String line = input.readLine();

            while (line != null) 
            {
                // chia chuỗi thành các chuỗi con phân cách bởi khoảng trắng
                String[] arr = line.split(" ");
                int j=1;
                int n=Integer.parseInt(arr[0]);
                dsBooking=new Booking[n4];
                for (int i = 0; i<n; i++)
                {
                    dsBooking[i].setTenkhachhang(arr[i]);
                    j++;
                    dsBooking[i].setNgaydat(arr[i]);
                    j++;
                    dsBooking[i].setNgaytra(arr[i]);
                    j++;
                    int temp=Integer.parseInt(arr[i]);
                    dsBooking[i].setMaBooking(temp);
                    j++;
                    temp=Integer.parseInt(arr[i]);
                    dsBooking[i].setLoaiphong(temp);
                    j++;
                }
                line = input.readLine();
            }
            input.close();
        } 
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public void WriteFile()
    {
        try {
            FileWriter fw = new FileWriter("data.txt");
            for (int i = 0; i < dsBooking.length; i++)
            {
                fw.write("Thông tin Booking của khách hàng "+i+"\n");
                fw.write ("Tên khách hàng:"+dsBooking[i].getTenkhachhang()+"\n");
                fw.write ("Ngày đặt phòng:"+dsBooking[i].getNgaydat()+"\n");
                fw.write ("Ngày trả phòng:"+dsBooking[i].getNgaytra()+"\n");
                fw.write ("Mã Booking:"+dsBooking[i].getMaBooking()+"\n");
            }
            fw.close();
        } catch (Exception e) 
        {
        System.out.println(e);
        }
        
    }
}
