//Driver Class
package siswa;
import java.lang.reflect.Constructor;

public class SiswaTester {
    public static void main(String[] args) {
        //membuat Object
        //namaClass namaObject = new
        Siswa Raffi = new Siswa ();
        Siswa Davin = new Siswa ();
        Siswa Zaky = new Siswa ();
        Siswa Dewangga = new Siswa ();
        Siswa Rabbani = new Siswa ();
        Siswa Gopi = new Siswa (20, "Dewi", 23);
    

        Raffi.id = 24;
        Raffi.nama = "Raffi";
        Raffi.ipk = 86.7;
        Davin.id = 8;
        Davin.nama = "Davin";
        Davin.ipk = 85.2;
        Zaky.id = 3;
        Zaky.nama = "Zaky";
        Zaky.ipk = 20.5;
        Dewangga.id = 9;
        Dewangga.nama = "Dewangga";
        Dewangga.ipk = 5.1;
        Rabbani.id = 23;
        Rabbani.nama = "Rabbani";
        Rabbani.ipk = 90.2;
        Raffi.print();
        System.out.println("-----------------");
        Davin.print();
        System.out.println("-----------------");
        Zaky.print();
        System.out.println("-----------------");
        Dewangga.print();
        System.out.println("-----------------");
        Rabbani.print();
        System.out.println("-----------------");
    }




}

    

