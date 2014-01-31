package org.tzotopia.commons.pagination;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

public class Sort implements Iterable<SortOrder>, Serializable
{
	private static final long serialVersionUID = 8837381926056904717L;
	
	private final Set<SortOrder> orders;
	
	public Sort(Set<SortOrder> orders)
	{
		if (null == orders || orders.isEmpty()) {
            throw new IllegalArgumentException("You have to provide at least one sort property to sort by!");
		}
		this.orders = orders;
	}

	public Iterator<SortOrder> iterator() {
		return orders.iterator();
	}
	
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(!(obj instanceof Sort)){
			return false;
		}
		Sort that = (Sort) obj;
		return this.orders.equals(that.orders);
	}
	
	public int hashCode() {
        int result = 17;
        result = 31 * result + orders.hashCode();
        return result;
	}
	
	public String toString(){
		if(orders.isEmpty()) return "";
		StringBuilder sb = new StringBuilder();
		for(SortOrder order : orders){
			sb.append(order).append(",");
		}
		return sb.deleteCharAt(sb.length() - 1).toString();
	}
}
