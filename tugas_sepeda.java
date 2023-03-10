/*
 * Nama  : Wildan Khafichudin
 * Nim   : A11.2021.13750
 * Title : Tugas PBO "Java_Lab-2"
 * Date  : 10 Maret 2023
 */

class Sepeda {
    
    //ini adalah tempat atribut
    int gear = 5;
    int gear2 = 7;
    int Roda;
    String Jenis;
    String Merk;

    //ini adalah tempat method
    void ngerem() {
        System.out.println("Sepeda direm");
    }

    //ini adalah konstrukor
    Sepeda(int jumlahRoda, String jenis, String merk) {

        Roda = jumlahRoda;
        Jenis = jenis;
        Merk = merk;

        System.out.println("Sepeda "+jenis+" bermerk "+merk+" memiliki jumlah roda "+jumlahRoda);
    }
}

class lampu {
    //atribut
    boolean nyala;
    
    //method
    void nyalakanLampu() {
        nyala = true;
    }
    void matikanLampu() {
        nyala = false;
    }
}

//ini untuk membuat objek sepeda
class tugas_Sepeda {
    public static void main(String[] args) {
        Sepeda sepeda1 = new Sepeda(2, "Anak TOPPERS", "Polygon");
        Sepeda sepeda2 = new Sepeda(4, "Lipat", "FNHon");

        int gearSepeda1 = sepeda1.gear;
        System.out.println("Jumlah gear "+gearSepeda1);
        sepeda1.ngerem();

        int gearSepeda2 = sepeda2.gear2;
        System.out.println("Jumlah gear "+gearSepeda2);
        sepeda2.ngerem();

        //membuat objek lampu
        lampu lampu1 = new lampu();
        lampu1.nyalakanLampu();
        System.out.println("Apakah lampu menyala? "+lampu1.nyala);
        
        lampu1.matikanLampu();
        System.out.println("Apakah lampu menyala? "+lampu1.nyala);
    }
}