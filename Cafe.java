/* This is a stub for the Cafe class */
public class Cafe extends Building{
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory
    
    public Cafe(String name, String address, int nFloors, int coffee, int sugar, int cream, int cups) {
        super(name, address, nFloors);
        nCoffeeOunces=coffee;
        nSugarPackets=sugar;
        nCreams=cream;
        nCups=cups;
        System.out.println("You have built a cafe: ☕");
    }
    
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        nCoffeeOunces-=size;
        this.nSugarPackets-=nSugarPackets;
        this.nCreams-=nCreams;
        nCups-=1;
        if(nCoffeeOunces<=0||this.nCreams<=0||this.nCreams<=0||nCups<=0){
            restock(100,100,100,10);
        }
    }
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces=nCoffeeOunces;
        this.nSugarPackets=nSugarPackets;
        this.nCreams=nCreams;
        this.nCups=nCups;
    }
    public static void main(String[] args) {
        Cafe compass=new Cafe("compass cafe","neilson library",2,70,30,10,15);
        compass.sellCoffee(12, 2, 3);
    }
    
}
