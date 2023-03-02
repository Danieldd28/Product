public class Product {
    private int itemNumber;
    private String productName;
    private int qty;
    private double price;
    private Boolean status = true;

    // Nilai default
    public Product() {
        itemNumber = 0;
        productName = "Barang";
        qty = 0;
        price = 0;
    }

    // Nilai kustom
    public Product(int itemNumber, String productName, int qty, double price) {
        this.itemNumber = itemNumber;
        this.productName = productName;
        this.qty = qty;
        this.price = price;
    }

    public void addToInventory(int quantity) {
        this.qty += quantity;
    }

    public void deductFromInventory(int quantity) {
        this.qty -= quantity;
    }

    // Metode getter dan setter
    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public String getProductName() {
        return productName;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public Boolean getStatus() {
        return status;
    }

    public double getInventoryValue() {
        return qty * price;
    }

    public void setActive(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Nomor Barang\t\t: " + itemNumber + "\nNama\t\t\t: " + productName + "\nJumlah di stok\t: " + qty
                + "\nHarga\t\t\t: "
                + price + "\nNilai Stok\t\t: " + getInventoryValue() + "\nStatus Produk\t\t: "
                + (status ? "Aktif" : "Dihentikan");
    }
}
