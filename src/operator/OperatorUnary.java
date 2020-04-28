package operator;

public class OperatorUnary {
    public static void main(String[] args) {
        int i = 0;
        i++;                    // tadinya 0 ditambah 1 sehingga i = 1
        System.out.println(i);  // betulkan i nilainya 1
        i++;                    // karena i tadinya sedah bernilai 1maka sekarang di tambah 1 lagi menjadi 2
        System.out.println(i);  // tuh betulkan i nilainya 2
        i=i+1;                  // bisa di lihat i++ sama dengan i = i+1
        System.out.println(i);  // i tadi 2 sekarang jadi 3

        //Berlaku juga untuk penambahan angka lain dan operator aritmatika lain
        i+=3; //sama dengan i = i+3
        System.out.println(i);

        i+=3;
        System.out.println(i);

        i*=3; //sama dengan i = i*3
        System.out.println(i);

        i*=3;
        System.out.println(i);
    }
}
