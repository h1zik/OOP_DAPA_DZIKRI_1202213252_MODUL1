public class MainApp {
    public static void main(String[] args){
        // Object Perangkat
        Perangkat pkt = new Perangkat(null, 0, 0);
        pkt.drive = "Adata";
        pkt.ram = 8;
        pkt.processor = 2.0;

        // Object Handphone
        Handphone hp = new Handphone(null, 0, 0, true);
        hp.drive = "Kingston";
        hp.ram = 4;
        hp.processor = 2.4;
        hp.fingerprint = false;

        // Object Laptop
        Laptop lp = new Laptop(null, 0, 0, true);
        lp.drive = "Adata";
        lp.ram = 16;
        lp.processor = 3.2;
        lp.webcam = true;

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
