package Bai_tap_1;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

   public double delta (){
        return b*b - 4*a*c;
   }
   public void Nghiem(){
        double n1=0 , n2=0, n3=0;
        if(delta() < 0){
            System.out.println("Pt vo nghiem");
        }else if(delta()==0){
            n3 = -b/ (2*a);
            System.out.println("Pt co nghiem kep: n1=n2=" + n3);
        }else{
            double delta = delta();
            n1 = (-b + Math.pow(delta, 0.5) / (2 * a));
            n2 = (-b - Math.pow(delta, 0.5) / (2 * a));
            System.out.println("Pt co 2 nghiem n1 " + n1 + " va n2 "+ n2 );
       }

   }
}
