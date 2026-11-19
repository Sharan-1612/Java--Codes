class Laptop {
    String name = "";
    String Processor = "";
    String GraphicsCard = "";
}
class Details{
    int ram = 0;
    int storage = 0;
    int price = 0;
}
class ObjectClass {
    public static void main(String[] args){
        Laptop lap1 = new Laptop();
        lap1.name = "Dell Inspiron";
        lap1.Processor = "Intel Core i5";
        lap1.GraphicsCard = "NVIDIA GeForce GTX 1650";

        Details det1 = new Details();
        det1.ram = 16;
        det1.storage = 512;
        det1.price = 79999;

        Details det2 = new Details();
        det2.ram = 32;
        det2.storage = 1024;
        det2.price = 119999;

        Laptop lap2 = new Laptop();
        lap2.name = "HP Pavilion";
        lap2.Processor = "Intel Core i7";
        lap2.GraphicsCard = "AMD Radeon RX 6600 XT";

        System.out.println("Graphics card - " + det2.ram);
    }
}