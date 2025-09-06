public class BinomialCoefficient{

    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
        f=f*i;
        }
        return f;

    }
public static int binomialcoefficient(int n){
    
    int factN = factorial(n);
    int factR= factorial(r);
    int factNMR = factorial(n-r);
    int binomialcoefficient = factN/(factR*factNMR)

}
public static void main (String[] args){


System.out.println(binomialcoefficient(4,3));
}
}