public class Main {

    public static void main(String[] args) {

        Computer gamingPC = new Computer.Builder()
                .setCpu("Intel i9")
                .setRam(32)
                .setStorage(1000)
                .build();

        Computer officePC = new Computer.Builder()
                .setCpu("Intel i5")
                .setRam(16)
                .setStorage(512)
                .build();

        System.out.println("Gaming PC:");
        gamingPC.display();

        System.out.println();

        System.out.println("Office PC:");
        officePC.display();
    }
}