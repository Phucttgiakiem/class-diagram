
package Buoi8;

import java.util.Scanner;

public abstract class HoGiaDinh {
    private String hoTen;
    private String diaChi;
    private int chiSoCu;
    private int chiSoMoi;

    public HoGiaDinh() {
    }

    public HoGiaDinh(String hoTen, String diaChi, int chiSoCu, int chiSoMoi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }
    float tienNuoc(){
        return 8000*soNuocPhaiTraTien();
    }
    abstract int soNuocPhaiTraTien();

    void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ho ten:");
        hoTen = sc.nextLine();
        System.out.println("Moi nhap dia chi:");
        diaChi= sc.nextLine();
        System.out.println("Moi nhap chi so cu:");
        chiSoCu=Integer.parseInt(sc.nextLine());
        System.out.println("Moi nhap chi so moi:");
        chiSoMoi = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return "HoGiaDinh{" + "hoTen=" + hoTen + ", diaChi=" + diaChi + ", chiSoCu=" + chiSoCu + ", chiSoMoi=" + chiSoMoi + '}';
    }
    
    int soNuocSuDung(){
        return chiSoMoi - chiSoCu;
    }
    void xuat(){
        System.out.println(toString());
    }
    
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getChiSoCu() {
        return chiSoCu;
    }

    public void setChiSoCu(int chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

    public int getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(int chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }
    
    
}
