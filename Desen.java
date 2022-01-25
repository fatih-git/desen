import java.util.Scanner;

/**
 * @author fatih-git
 * */

public class Desen {

    public static void main(String[] args) {

        int giriş;
        Scanner input=new Scanner(System.in);

        System.out.print("Değer giriniz: ");
        giriş=input.nextInt();

        if (giriş==0)
            System.out.print(giriş);
        else
            çıkar(giriş, giriş);

    }

    public static int çıkar(int deger, int ilk){

        System.out.print(deger+"    ");

        if (deger>0)
            return çıkar(deger-5, ilk);
        else
            return ekle(deger+5, ilk);



    }

    public static int ekle(int değer, int first){

        System.out.print(değer+"    ");

        if (değer!=first)
            return ekle(değer+5,first);

        return 0;
    }

}
