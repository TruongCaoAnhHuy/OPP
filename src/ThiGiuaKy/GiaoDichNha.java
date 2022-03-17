package ThiGiuaKy;

public class GiaoDichNha extends GiaoDich {
    private String loaiNha, diaChi;
    private int choose;
    
    public GiaoDichNha(){
        super();
    }

    public GiaoDichNha(String loaiNha, String diaChi){
        this.loaiNha=loaiNha;
        this.diaChi=diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }
    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void nhap(){
        super.nhap();
        System.out.print("Nhập loại nhà(1. cao cấp / 2. thường): ");
        choose = sc.nextInt();
        switch (choose){
            case 1:
                loaiNha = "cao cấp";
                break;
            case 2: 
                loaiNha = "thường";
                break;
            default:
                System.out.println("Không hợp lệ");
                break;
        }
        System.out.println("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+", Loại nhà: "+this.loaiNha+", Địa chỉ: "+this.diaChi;
    }
}
