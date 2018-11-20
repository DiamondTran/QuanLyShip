package com.diamond.diamond.quanlyship.model;

public class KhachHang {
    String name,diachi,gionhap,sanphammua,hoadon;

    public KhachHang(String name, String diachi, String gionhap, String sanphammua, String hoadon) {
        this.name = name;
        this.diachi = diachi;
        this.gionhap = gionhap;
        this.sanphammua = sanphammua;
        this.hoadon = hoadon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGionhap() {
        return gionhap;
    }

    public void setGionhap(String gionhap) {
        this.gionhap = gionhap;
    }

    public String getSanphammua() {
        return sanphammua;
    }

    public void setSanphammua(String sanphammua) {
        this.sanphammua = sanphammua;
    }

    public String getHoadon() {
        return hoadon;
    }

    public void setHoadon(String hoadon) {
        this.hoadon = hoadon;
    }
}
