
package data;

/**
 *
 * @author quang
 */
public class Worker {
    private String ma;
    private String ten;
    private int soNgayCong;
    private final int giaNgayCong = 100000;

    public Worker(String ma, String ten, int soNgayCong) {
        this.ma = ma;
        this.ten = ten;
        this.soNgayCong = soNgayCong;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }
    
    
    public String getMa() {
        return ma;
    }
    
    
    
    public String getTenLD() {
        return ten.toUpperCase();
    }
    
    public double tinhLuong() {
        double sum = soNgayCong * giaNgayCong;
        if(soNgayCong >= 25)
            return sum + 1000000;
        else if(soNgayCong >= 15 && soNgayCong <= 25)
            return sum + 700000;
        else
            return sum;
    }
    
    
    public static void inTieuDe() {
        System.out.printf("|%-10s|%-10s|%-14s|%-10s|%-10s|\n", "MÃ LĐ", "TÊN LĐ"
                , "SỐ NGÀY CÔNG", "ĐƠN GIÁ", "LƯƠNG");
    }
    
    public void inDuLieu() {
        System.out.printf("|%-10s|%-10s|%-14d|%-10d|%-10.1f|\n", ma, getTenLD(), soNgayCong, giaNgayCong, tinhLuong());
    }
    
    
}
