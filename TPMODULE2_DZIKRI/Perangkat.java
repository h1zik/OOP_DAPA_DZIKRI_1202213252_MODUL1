public class Perangkat {

    // Create 3 variables named drive, ram, and processor
    String drive;
    int ram;
    double processor;

    // Create 1 operator for perangkat class with parameters of drive, ram, and processor
    public Perangkat(String drive, int ram, double processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }

    public Perangkat(String drive2, int ram2, double processor2, boolean webcam) {
    }

    // Create a public method named informasi
    public void informasi(){
        System.out.println("Perangkat tidak diketahui memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan processor secepat "+processor+" Ghz");
    }
}
