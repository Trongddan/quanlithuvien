/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.sql.Date;

public class Thanhvien {
    private int id;
    private String ten,tendangnhap,matkhau;
    private Date ngaysinh;
    private String diachi,email,dienthoai,vaitro,chichu;

    public Thanhvien() {
    }

    public Thanhvien(int id, String ten, String tendangnhap, String matkhau, Date ngaysinh, String diachi, String email, String dienthoai, String vaitro, String chichu) {
        this.id = id;
        this.ten = ten;
        this.tendangnhap = tendangnhap;
        this.matkhau = matkhau;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.email = email;
        this.dienthoai = dienthoai;
        this.vaitro = vaitro;
        this.chichu = chichu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getVaitro() {
        return vaitro;
    }

    public void setVaitro(String vaitro) {
        this.vaitro = vaitro;
    }

    public String getChichu() {
        return chichu;
    }

    public void setChichu(String chichu) {
        this.chichu = chichu;
    }
    
}
