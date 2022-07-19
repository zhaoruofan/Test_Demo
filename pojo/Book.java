package com.mybatis.pojo;

public class Book {

    private int bno;
    private String bname;
    private String author;
    private String type;
    private String pno;
    private int total_qty;
    private int cur_qty;

    public Book(int bno, String bname, String author, String type, String pno, int total_qty, int cur_qty) {
        this.bno = bno;
        this.bname = bname;
        this.author = author;
        this.type = type;
        this.pno = pno;
        this.total_qty = total_qty;
        this.cur_qty = cur_qty;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public int getTotal_qty() {
        return total_qty;
    }

    public void setTotal_qty(int total_qty) {
        this.total_qty = total_qty;
    }

    public int getCur_qty() {
        return cur_qty;
    }

    public void setCur_qty(int cur_qty) {
        this.cur_qty = cur_qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bno=" + bno +
                ", bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", pno='" + pno + '\'' +
                ", total_qty=" + total_qty +
                ", cur_qty=" + cur_qty +
                '}';
    }
}
