/**
 * menu item.
 *
 * @author JM
 * @version 26 Feb 2018
 */
public class MenuItem
{
    public int price = 0, quantity = 0;
    public String name = "Nothing";
    
    public MenuItem(String name, int price)
    {
        this.name = name;
        this.price = price;
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
