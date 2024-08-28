/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CD;

import java.util.ArrayList;


/**
 *
 * @author ADMIN
 */
public class QuanLyCD {
    private ArrayList<CD> ds;
    
    public QuanLyCD(){
    ds = new ArrayList<>();
    
    ds.add(new CD("CD01","Noi buon gac tro","Quang Linh",195000,2018));
    ds.add(new CD("CD02","Bai tinh ca dem","Duc Tuan",185000,2021));
    ds.add(new CD("CD03","Cau ho chieu que","Nhieu ca si",172000,2022));
    ds.add(new CD("CD04","Tinh dau tinh cuoi","Van Khanh",139000,2022));
    ds.add(new CD("CD05","Thanh pho mua bay","Dan Nguyen",182000,2019));
    }
    public void xuatToanBoCD() {
        for (CD cd : ds){
            System.out.print(cd);
        }  
        System.out.println("Tong tri gia CD: " + tinhTongTriGia());
    }
    public double tinhTongTriGia() {
        return ds.stream().mapToDouble(CD::getGiaban).sum();
    }
    public void layCDTruocNam2020() {
        for (CD cd : ds){
            if(cd.getNamphathanh() < 2020){
                System.out.println(cd);
            }
        }  
    }
    public void timCD(){
        for(CD cd : ds){
            if(cd.getTenCD().startsWith("tinh")){
                System.out.println(cd);
        }
    }
    }
    public void SapXep(){
        ds.sort((sp1, sp2) -> Double.compare(sp2.getGiaban(),sp1.getGiaban()));
        System.out.println("Danh Sach san pham sau khi sap xep ");
        for(CD cd : ds){
            System.out.println(cd);
        }
    }
    public void Xoa(String maso){
        ds.removeIf(cd->cd.getMaso().equals(maso));
    }
}

