import java.time.LocalDate;
import java.util.Scanner;

/**
 * The golden boy
 */
public class Main {
    public static void main(String[] args) {
    Vino vino = new Vino("Krasnoe vino","asdw","ITALIA", LocalDate.of(1999,1,1));
    Vino vino1 = new Vino("vino2","sdsc","SPAIN",LocalDate.of(2000,2,2));
    Vino vino2 = new Vino("vino","adsdsa","CHILI",LocalDate.of(2002,3,4));
Vino[] vinos={vino,vino1,vino2};

    Vinodel vinodel= new Vinodel("krasniy","1 - jil","g.Bishkek",vino);
    Vinodel vinodel1 = new Vinodel("asaSACAS","3-JIL","g.Bishkek",vino1);
    Vinodel vinodel2 = new Vinodel("sdascs","4-Jil","g.Biskek",vino2);
    Vinodel[] vinodels={vinodel,vinodel1,vinodel2};
    while (true){
        System.out.println("""
                1. get all vino
                2.get all vino
                3. set vino
                """);
        int a = new Scanner(System.in).nextInt();
        switch (a){
          case 1 -> {
              for (Vinodel v:vinodels) {
                  System.out.println(v);
              }
          }
            case  2 -> {
                for (Vino v: vinos) {
                    System.out.println(v);
                }


             }
             case 3 -> {
            Vino vino3  = new Vino();
                 System.out.println("Name");
                 vino3.setName(new Scanner(System.in).nextLine());
                 System.out.println("Brand");
                 vino3.setBrand(new Scanner(System.in).nextLine());
                 System.out.println("Country");
                 vino3.setCountry(new Scanner(System.in).nextLine());
                 System.out.println("Date");
                 vino3.setYears(new Scanner(System.in).nextInt());
                 Vino[] vinos1 = {vino , vino1,vino2};
                 vino3.vino(vino3);


             }
        }
    }
    }
}