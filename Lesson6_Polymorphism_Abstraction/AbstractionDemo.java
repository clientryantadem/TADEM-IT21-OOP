
abstract class BakeryOrder {
    private final String orderNumber;
    private final String customerName;

    public BakeryOrder(String orderNumber, String customerName) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    
    public void printTicketHeader() {
        System.out.println("------------------------------");
        System.out.println("Hearth & TDZ Bakery");
        System.out.println("Order " + orderNumber + " for " + customerName);
        System.out.println("------------------------------");
    }

   
    public abstract void describePreparation();
}


class SourdoughLoafOrder extends BakeryOrder {

    public SourdoughLoafOrder(String orderNumber, String customerName) {
        super(orderNumber, customerName);
    }

    @Override
    public void describePreparation() {
        System.out.println("Mix the levain, bulk ferment 4 hours, shape, proof, and bake at 450 F.");
    }
}

class CustomCakeOrder extends BakeryOrder {
    private final String inscription;

    public CustomCakeOrder(String orderNumber, String customerName, String inscription) {
        super(orderNumber, customerName);
        this.inscription = inscription;
    }

    @Override
    public void describePreparation() {
        System.out.println("Bake vanilla layers, fill with raspberry, and pipe the inscription: \""
                + inscription + "\".");
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {
       
        BakeryOrder loaf = new SourdoughLoafOrder("1042", "Priya Shah");
        BakeryOrder cake = new CustomCakeOrder("1043", "Luis Ortega", "Happy anniversary");

        loaf.printTicketHeader();
        loaf.describePreparation();

        System.out.println();

        cake.printTicketHeader();
        cake.describePreparation();
    }
}


