class Animal{
    void Sound(){
        System.out.println("hello");

        }
    }
    class Dog extends Animal{
        Dog(){
        super();
        }
        void Sound(){
            System.out.println("hi");
        }
     }
public class code3{
    public static void main(String[] args){
        Dog dg=new Dog();
        dg.Sound();
    }
}