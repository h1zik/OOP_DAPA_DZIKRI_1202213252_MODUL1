public class Laptop extends Perangkat {

    // Create 1 variable named webcam
    protected boolean webcam;

    // Create 1 operator of Laptop class
    public Laptop(String drive, int ram, double processor, boolean webcam){
        super(drive, ram, processor, webcam);
    }

    @Override
    // Create public method named informasi
    public void informasi(){
        if(webcam){
            System.out.println("Laptop ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan processor secepat "+processor+" Ghz. Selain itu laptop ini memiliki webcam");
        } else {
            System.out.println("Laptop ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan processor secepat "+processor+" Ghz. Selain itu laptop ini TIDAK memiliki webcam");
        }
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

    
}
