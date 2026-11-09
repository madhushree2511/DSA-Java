import java.util.*;
public class Bill_and_GST{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       float pen=10.12f;
       float pencil=5.25f;
       float eraser=2.34f;
       float total = pen+pencil+eraser;
       float gst= (total*18)/100;
       float finaltotal=total+gst;
       System.out.println("The total bill is");
       System.out.println("Bill is "+ finaltotal);
    }
}