package ThiGiuaKy;

public class GiaoDichDat extends GiaoDich {
    private String loaiDat;

    public GiaoDichDat(){
        super();
    }
    
    public GiaoDichDat(String loaiDat){
        this.loaiDat=loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }
    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    public void nhap(){
        super.nhap();
        System.out.print("Nhập loại đất (A/B/C): ");
        loaiDat = sc.nextLine();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+", Loại đất: "+loaiDat;
    }

}
