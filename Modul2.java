import java.util.ArrayList;

public class Modul2 {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");
        System.out.println("Nama Hewan Yang DiTambahakan : ");
        System.out.println(hewan);

        ArrayList<String> hapusHewan = new ArrayList<>();
        hapusHewan.add("Kelinci");
        hapusHewan.add("Kambing");
        hapusHewan.add("Unta");
        ArrayList<String> hapusData = new ArrayList<>();

        for (String hapus : hapusHewan) {
            hewan.removeIf(h -> h.equals(hapus));
            hapusData.add(hapus);
        }

        System.out.println("\nHewan yang dihapus : ");
        System.out.println(hapusData);
        System.out.println("\nOutput Hewan Setelah DiHapus : ");
        System.out.println(hewan);
    }
}
