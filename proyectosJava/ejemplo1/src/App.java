public class App {
    public static void main(String[] args) throws Exception {
        int[] miArreglo;
        int a=1,b=2,c=10,s;
        System.out.println(a);
        System.out.println(b);
        for(int i=0; i<c;i++){
            s=a+b;
            System.out.println(s);
            a=b;
            b=s;
        }

    }
}
