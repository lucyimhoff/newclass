public class Register{
    private double retailPrice;
    private int quantity;
    private double sale;
    private boolean cash;

    public Register(double r, int q){
        r = retailPrice;
        q = quantity;
    }
    public Register(double r, int q, double s, boolean c){
    r = retailPrice;
    q = quantity;
    s = sale;
    c = cash;}

    public double scan(){
        double finalPrice = retailPrice;
        finalPrice = retailPrice * quantity;
        if(sale > 0){
            finalPrice = finalPrice - sale * finalPrice;
        }
        if(!cash){
            finalPrice = finalPrice + .1 * finalPrice;
        }
        return finalPrice;
    }
}