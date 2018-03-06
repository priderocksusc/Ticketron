/**
*@author: ZD
*@version: 6 Mar 18
*/
import java.util.List;
import java.util.ArrayList;

public class Ticket {
	private double price = 0.00;
	private String name;
	private int size = 0;
	List<MenuItem> registry = new ArrayList<>();
	public Ticket(String name){
		this.name = name;
	}
	public void add(MenuItem item){
		for(int i = 0; i < item.getQuantity(); i++){
			registry.add(item);
			this.price += item.getPrice();
			this.size++;
		}
			
	}
	//Private remove() function that removes an item based on its location in the registry
	private void remove(int pos){
		int n = registry.get(pos).getQuantity();
		double p = registry.get(pos).getPrice();
		for(int i = 0; i < n; i++){
			this.size--;
			this.price -= p;
		}
		registry.remove(pos);		
	}
	//Default remove() that removes the last item in a list.
	public void remove(){
		remove(this.size-1);
	}
    public int getSize(){	return this.size;	}
    public String getName(){	return this.name;	}
    public double getPrice(){	return this.price;	}
    public void setName(String newName) {    	this.name = newName;    }

    @Override
    public String toString(){
    	String list = "";
	    for(MenuItem i : registry){	
	    	list += i.getName();
	    }
	    return list;
	}
}