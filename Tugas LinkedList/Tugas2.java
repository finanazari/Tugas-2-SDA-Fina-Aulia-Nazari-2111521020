import java.util.LinkedList;
//Tugas 2 Sturuktur Data dan Algoritma
public class Tugas2 {
    public static void main(String[] args) {
        LinkedList<String> saya = new LinkedList<>();
        saya.add("F");
        saya.add("I");
        saya.add("N");
        saya.add("A");
        saya.add(" ");
        saya.add("A");
        saya.add("U");
        saya.add("L");
        saya.add("I");
        saya.add("A");
        saya.add(" ");
        saya.add("N");
        saya.add("A");
        saya.add("Z");
        saya.add("A");
        saya.add("R");
        saya.add("I");

        System.out.println("Nama Saya : "+saya);
        System.out.println("----------------\n");

        System.out.println("soal 1 - add karakter lain yang anda inginkan");
        //add karakter lain yang anda inginkan

        saya.addFirst (" ");
        saya.addFirst ("S");
        saya.addFirst ("S");
        saya.addFirst ("I");
        saya.addFirst ("M");
        saya.addLast (" ");
        saya.addLast ("I");
        saya.addLast ("L");
        saya.addLast ("Y");

        System.out.println("Nama Saya Sekarang : "+saya);
        System.out.println("----------------\n");

        System.out.println("soal 2 - sisipkan karakter lain yang anda ingkinkan");
        //sisipkan karakter lain yang anda inginkan
        saya.set(10, "S");
        saya.set(11, "P");
        saya.set(12, "A");
        saya.set(13, "C");
        saya.set(14, "E");
        saya.set(23, "H");
        saya.set(24, "A");
        saya.set(25, "I");

        System.out.println("Nama Saya Sekarang : "+saya);
        System.out.println("----------------\n");

        System.out.println("soal 3 - hapus beberapa karakter yang ingin anda hapus");
        //hapus beberapa karakter yang ingin anda hapua
        //Hapus berdasarkan index
        saya.remove(0);
        saya.remove(0);
        saya.remove(0);
        saya.remove(0);
        saya.remove(0);
        saya.remove(5);
        saya.remove(5);
        saya.remove(5);
        saya.remove(5);
        saya.remove(5);
        saya.remove(5);

        System.err.println("Nama Saya Sekarang : "+saya);
        System.out.println("----------------\n");

        System.out.println("soal 4 - buat fungsi POP dan PUSH pada project anda");
        //buat fungsi POP dan PUSH pada project anda
        saya.pop();
        System.out.println("4. Output POP : ");
        System.out.println(saya);
        System.out.println("Ukuran : ");
        System.out.println(saya.size());
        System.out.println("");

        saya.push("M");
        System.out.println("4. Output PUSH :");
        System.out.println(saya);
        System.out.println("Ukuran :");
        System.out.println(saya.size());
        System.out.println("");
        }
    }