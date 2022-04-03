package bilBurgers;

public class Hamburger {
    private String breadRollType, meat, name;
    private double price;
    private String addition1Name, addition2Name, addition3Name, addition4Name;
    private double addition1Price, addition2Price, addition3Price, addition4Price;

    public Hamburger(String name ,String meat , double price ,String breadRollType) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println( this.name + " hamburger " + " on a " + this.breadRollType + " roll " + " with " + this.meat + " , price is " + this.price);

                if (this.addition1Name !=null) {
                    hamburgerPrice +=addition1Price;
                System.out.println("Added " +this.addition1Name + " for an extra "+this.addition1Price);
                }
                if (this.addition2Name !=null) {
                    hamburgerPrice +=addition2Price;
                    System.out.println("Added " +this.addition2Name + " for an extra "+this.addition2Price);
                }
                if (this.addition3Name !=null) {
                    hamburgerPrice +=addition3Price;
                    System.out.println("Added " +this.addition3Name + " for an extra "+this.addition3Price);
                }
                if (this.addition4Name !=null) {
                    hamburgerPrice +=addition4Price;
                    System.out.println("Added " +this.addition4Name + " for an extra "+this.addition4Price);
                
                }
        return hamburgerPrice;
    }
}
