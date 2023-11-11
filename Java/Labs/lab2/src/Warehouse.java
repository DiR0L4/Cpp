public class Warehouse {
    public int amount;
    public double price;

    public Warehouse()
    {
        amount = 0;
        price = 0;
    }
    public Warehouse(int amount, double price)
    {
        this.amount = amount;
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double fullPrice()
    {
        return price * amount;
    }
    public void priceDiff(Warehouse a2)
    {
        if(this.price > a2.price) System.out.println("Costs more");
        else if(this.price == a2.price) System.out.println("Same price");
        else System.out.println("Costs less");
    }

    public int count(Warehouse... aa)
    {
        int buff = this.amount;
        for(Warehouse x : aa)
        {
            buff += x.amount;
        }
        return buff;
    }

}
