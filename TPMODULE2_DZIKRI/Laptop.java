public class Laptop {

    // Create 1 variable named webcam
    boolean webcam;

    // Create object of Perangkat class
    Perangkat pkt = new Perangkat(null, 0, 0);

    // Create 1 operator of Laptop class
    public Laptop(String drive, int ram, double processor, boolean webcam){
        pkt.drive = drive;
        pkt.ram = ram;
        pkt.processor = processor;
        this.webcam = webcam;
    }

    // Create public method named bukaGame
    public void bukaGame(String nama_game){
        System.out.println("Laptop berhasil membuka game "+nama_game);
    }

    // Create public method named kirimEmail with 1 thing in the parameter
    public void kirimEmail(String email){
        System.out.println("Laptop berhasil mengirim Email ke "+email);
    }

    // Create public method named kirimEmail with 2 things in the parameter
    public void kirimEmail(String email1, String email2){
        System.out.println("Laptop berhasil mengirim Email ke "+email1+" dan ke "+email2);
    }

    // Create public method named informasi
    public void informasi(){
        if(webcam){
            System.out.println("Laptop ini memiliki drive tipe "+pkt.drive+" dengan ram sebesar "+pkt.ram+" GB dan processor secepat "+pkt.processor+" Ghz. Selain itu laptop ini memiliki webcam");
        } else {
            System.out.println("Laptop ini memiliki drive tipe "+pkt.drive+" dengan ram sebesar "+pkt.ram+" GB dan processor secepat "+pkt.processor+" Ghz. Selain itu laptop ini TIDAK memiliki webcam");
        }
    }

    
}
