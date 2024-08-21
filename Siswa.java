package siswa;

public class Siswa {
    
    //variable
    int id;
    String nama;
    double ipk;

    //Constructor
    public Siswa() {
        id = 0;
        nama = "Kosong";
        ipk = 0.0;
    }
    //Constructor Parameter
    public Siswa (int i, String n, double k) {
        id = i;
        nama = n;
        ipk = k;
    }

    //Getter
    //Setter
    //method
    public void print() {
        System.out.println("ID : " + id );
        System.out.println("Nama : " + id );
        System.out.println(" IPK : " + id );
    }        

    
    
}
