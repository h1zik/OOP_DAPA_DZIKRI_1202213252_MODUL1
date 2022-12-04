public class MainApp {
    public static void main(String[] args){
        // Object Perangkat
        String pkt_drive = "Adata";
        int pkt_ram = 2;
        double pkt_proc = 2.4;
        Perangkat pkt = new Perangkat(pkt_drive,pkt_ram,pkt_proc);

        // Object Handphone
        String hp_drive = "Samsung";
        int hp_ram = 8;
        double hp_proc = 2.0;
        boolean hp_bool = true;
        Handphone hp = new Handphone(hp_drive, hp_ram, hp_proc, hp_bool);

        // Object Laptop
        String lp_drive = "Seagate";
        int lp_ram = 16;
        double lp_proc = 3.0;
        boolean lp_bool = false;
        Laptop lp = new Laptop(lp_drive, lp_ram, lp_proc, lp_bool);

        // Show information Perangkat
        pkt.informasi();

        // New Line
        System.out.println();

        // Show information Laptop
        lp.informasi();
        lp.bukaGame("Valorant");
        lp.kirimEmail("redpainted4@gmail.com");
        lp.kirimEmail("dzikrihisyam@student.telkomuniversity.ac.id","pubgidoy10@gmail.com");

        // New Line
        System.out.println();

        // Show Information Handphone
        hp.informasi();
        hp.telfon(628381479);
        hp.kirimSMS(628381479);
        hp.kirimSMS(628381479, 629492580);
    }
}
