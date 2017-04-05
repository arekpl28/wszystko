/**
 * Created by Adrian on 2017-04-01.
 */
public class Main {

    public static void main(String[] args) throws WyjatekSprawdzany {
        dangerousMethod();
        int a = 3;
        int b = 3/a;
        int tab[] = {1,2,3};
        try {
            System.out.println(tab[0]);
            System.out.println(tab[1]);
            System.out.println(tab[2]);
            System.out.println(tab[3]);
            System.out.println(tab[2]);
            System.out.println(tab[1]);
        }catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Poza zakresem");
        }

        dangerousMethod2();
    }

    public static void dangerousMethod() {
        try{
            throw new WyjatekNiesprawdzany();
        }catch (WyjatekNiesprawdzany e) {
            System.out.println("Jest ok");
        }
    }

    public static void dangerousMethod2() throws WyjatekSprawdzany {
        throw new WyjatekSprawdzany();

    }
}
