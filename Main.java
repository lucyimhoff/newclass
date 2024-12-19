public class Main{
    public static void main(String[] args){
        Register cereal = new Register(5.50, 2, 0.5, false);
        System.out.println(cereal.scan()); 
    }
}