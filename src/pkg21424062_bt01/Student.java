/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg21424062_bt01;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Student{

    int MHS;
    String TenHS, DiaChi, GhiChu;
    float Diem;

    public Student() {

    }

    public Student(int MHS, String TenHS, String DiaChi, String GhiChu, float Diem) {
        this.MHS = MHS;
        this.TenHS = TenHS;
        this.DiaChi = DiaChi;
        this.GhiChu = GhiChu;
        this.Diem = Diem;
    }

    public int getMHS() {
        return MHS;
    }

    public void setMHS(int MHS) {
        this.MHS = MHS;
    }

    public String getTenHS() {
        return TenHS;
    }

    public void setTenHS(String TenHS) {
        this.TenHS = TenHS;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public float getDiem() {
        return Diem;
    }

    public void setDiem(float Diem) {
        this.Diem = Diem;
    }

    public void NhapThongTinHS() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten cua hoc sinh: ");
        TenHS = sc.nextLine();
        do {
            System.out.print("Nhap diem cua hoc sinh: ");
            Diem = Float.parseFloat(sc.nextLine());
        } while (Diem < 0 || Diem > 10);
        System.out.print("Nhap dia chi cua hoc sinh: ");
        DiaChi = sc.nextLine();
        System.out.print("Nhap ghi chu cho hoc sinh: ");
        GhiChu = sc.nextLine();
    }

    public void HienThongTinHS() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Student{" + "MHS= " + MHS + ", TenHS= " + TenHS + ", DiaChi= " + DiaChi + ", GhiChu= " + GhiChu + ", Diem= " + Diem + '}';
    }

}
