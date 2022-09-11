public class App {

    public static void main(String[] args) {
        System.out.println(isUgly(44));

    }
    public static boolean isUgly(int n){
        if (n <=0)
            return false;
        else if(n==1)
            return true;
        else if (n == 2 || n==3 ||n==5)
        return true;
        else if ( n%2 == 0 )
            return false;
        else if (n%(2*3)==0 || n%(2*5)==0 || n%(2*2)==0 || n%(3*3)==0 || n%(3*5)==0
        || n%(5*5)==0)
            return true;
        
        else
            return false;
    }

    
}
