/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package CD;

/**
 *
 * @author ADMIN
 */
public class CD {
    String maso, tenCD, casi;
    double giaban;
    int namphathanh;
public CD(String maso, String tenCD, String casi, int namphathanh, int giaban){ 
    this.maso = maso;
    this.tenCD = tenCD;
    this.casi = casi;
    this.giaban = giaban;
    this.namphathanh = namphathanh; 
}   

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }

    public String getCasi() {
        return casi;
    }

    public void setCasi(String casi) {
        this.casi = casi;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public int getNamphathanh() {
        return namphathanh;
    }

    public void setNamphathanh(int namphathanh) {
        this.namphathanh = namphathanh;
    }

    @Override
    public String toString() {
        return "CD{" + "maso=" + maso + ", tenCD=" + tenCD + ", casi=" + casi + ", giaban=" + giaban + ", namphathanh=" + namphathanh + '}';
    }



}
