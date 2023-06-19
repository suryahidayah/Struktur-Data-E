import java.util.ArrayList;
public class Tes {

        public static void main(String[] args) {
            ArrayList<String> ad = new ArrayList<>();
            ArrayList<String> del = new ArrayList<>();
            ArrayList<String> deleted = new ArrayList<>();

            ad.add("Sapi");
            ad.add("Kelinci");
            ad.add("Kambing");
            ad.add("Unta");
            ad.add("Domba");
            System.out.println("Hewan : " + ad);

            del.add("Kelinci");
            del.add("Kambing");
            del.add("Unta");
            for (String a: del)
            {
                ad.removeIf(h -> h.equals(a));
                deleted.add(a);
            }
            System.out.println("Hewan yang dihapus : ");
            System.out.println(deleted);
            System.out.println("Output Hewan : ");
            System.out.println(ad);
        }
    }

