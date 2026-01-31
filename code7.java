interface payment{
    void pay();

}
class upi implements payment{
    public void pay(){
        System.out.println("paying");

    }
}
public class code7{
    public static void main(String[] args){
        upi gpay=new upi();
        gpay.pay();
        
    }
}