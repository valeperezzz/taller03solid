abstract class Product {
    private String name;
    private double price;




    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }




    public String getName() { return name; }
    public double getPrice() { return price; }




    public abstract double calculateIVA();
}




abstract class PhysicalProduct extends Product {
    private double weight;




    public PhysicalProduct(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }




    public double getWeight() { return weight; }
}




class BookProduct extends PhysicalProduct {
    public BookProduct(String name, double price, double weight) {
        super(name, price, weight);
    }




    @Override
    public double calculateIVA() {
        return 0; 
    }
}




class ClothingProduct extends PhysicalProduct {
    public ClothingProduct(String name, double price, double weight) {
        super(name, price, weight);
    }




    @Override
    public double calculateIVA() {
        return getPrice() * 0.12;
    }
}




class DigitalProduct extends Product {
    public DigitalProduct(String name, double price) {
        super(name, price);
    }




    @Override
    public double calculateIVA() {
        return getPrice() * 0.15;
    }
}




class ShoppingCart {
    private List<Product> products = new ArrayList<>();




    public void addProduct(Product product) {
        products.add(product);
    }
   
    public void removeProduct(Product product) {
        products.remove(product);
    }




    public double calculateTotalPrice() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice() + p.calculateIVA();
        }
        return total;
    }




    public List<Product> getProducts() {
        return products;
    }
}




class ReceiptService {
    public void sendReceipt(ShoppingCart cart) {
        System.out.println("Enviando recibo por correo con total: $" + cart.calculateTotalPrice());
    }
