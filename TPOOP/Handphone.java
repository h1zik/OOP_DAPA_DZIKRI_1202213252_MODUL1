public class Handphone{

    // Create variable named fingerprint
    boolean fingerprint;

    // Create object of Handphone class
    Perangkat pkt = new Perangkat(null, 0, 0);

    // Create 1 operator of Handphone class
    public Handphone(String drive, int ram, double processor, boolean fingerprint){
        pkt.drive = drive;
        pkt.ram = ram;
        pkt.processor = processor;
        this.fingerprint = fingerprint;
    }

    // Create public method called telfon
    public void telfon(int no_hp){
        System.out.println("Handphone berhasil menyambungkan telfon ke "+no_hp);
    }

    // Create public method called kirimSMS with 1 thing in the parameter
    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim SMS ke "+no_hp);
    }

    // Create public method called kirimSMS with 2 things in the parameter
    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil menyambungkan telfon ke "+no_hp1+" dan ke No "+no_hp2);
    }

    // Create public method called informasi
    public void informasi(){
        if(fingerprint){
            System.out.println("Handphone ini memiliki drive tipe "+pkt.drive+" dengan ram sebesar "+pkt.ram+" GB dan processor secepat "+pkt.processor+" Ghz. Selain itu handphone ini memiliki fingerprint");
        } else {
            System.out.println("Handphone ini memiliki drive tipe "+pkt.drive+" dengan ram sebesar "+pkt.ram+" GB dan processor secepat "+pkt.processor+" Ghz. Selain itu handphone ini TIDAK memiliki fingerprint");
        }
    }
}