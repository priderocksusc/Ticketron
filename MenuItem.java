/**
 * @author JM
 * @version 26 Feb 2018
 */
public class MenuItem
{
    private double price = 0.00;
    private int quantity = 0;
    private String name = "Nothing";
    
    public MenuItem(String name, double price)
    {
        this.name = name;
        this.price = price;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void add()
    {
        quantity++;
    }
    public void remove()
    {
        if( quantity > 0 )
        {
            quantity--;
        }
    }    
}
