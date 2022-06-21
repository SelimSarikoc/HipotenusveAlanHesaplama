import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {

        int a, b;
        double c, u, alan;

        Scanner girdi = new Scanner (System.in);

        System.out.print("A Kenarını Giriniz: ");
        a = girdi.nextInt();

        System.out.print("B Kenarı Giriniz: ");
        b = girdi.nextInt();

        c = Math.sqrt(( a*a)+(b*b));
        System.out.println("Hipotenüs: "+c);

        u = ((a+b+c)/2);

        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Alan: "+ alan);

    }
}
