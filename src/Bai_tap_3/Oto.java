package Bai_tap_3;
//@todo tao class oto co it nhat 5 thuoc tinh
//@todo tao phuong thuc start oto. KHI START thi trang thai is on la true. gia tri mac dinh của trang thai is on la fales
//@todo ttao phương thuc sét tốc độ, nếu tóc độ quá 80 thì chửi.
//@todo tạo đối tượng sau đó  bật xe chạy đc 500km thì báo hết xăng.
public class Oto {
    int speed;
    boolean status;
    double line;
    String model;
    String name;

    public Oto(int speed, boolean status, double line, String model, String name) {
        this.speed = speed;
        this.status = status;
        this.line = line;
        this.model = model;
        this.name = name;
    }

    public boolean setStatus(){
        if(status == true) {
            System.out.println("Cars is on ");
        }else{
            System.out.println("Cars is off");
        }
        return status;
    }

    public void setLine(){
        double line = 0;
        if(line > 500){
            System.out.println("out of fuel");
        }else{
            System.out.println("have fuel");
        }
    }

    public void setSpeed(){
        int speed = 0;
        if(speed > 80){
            System.out.println("chửi");
        }
    }
}
