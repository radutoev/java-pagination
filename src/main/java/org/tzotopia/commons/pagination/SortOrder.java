package org.tzotopia.commons.pagination;

import java.io.Serializable;

public class SortOrder implements Serializable 
{
	private static final long serialVersionUID = -8435126954577978442L;
	private static final Direction DEFAULT_DIRECTION = Direction.ASC;
	
	private final Direction direction;
	private final String    property;
	
	public SortOrder(Direction direction, String property)
	{
		if(property == null || !(property.length() > 0)){
			throw new IllegalArgumentException("Property must not be null or empty!");
		}
		this.property = property;
		this.direction = direction != null ? direction : DEFAULT_DIRECTION;
	}
	
	public Direction getDirection(){
		return this.direction;
	}
	public String getProperty(){
		return this.property;
	}
	
	public boolean equals(Object obj) {
        if (this == obj) {
                return true;
        }
        if (!(obj instanceof SortOrder)) {
                return false;
        }
        SortOrder that = (SortOrder) obj;
        return this.direction.equals(that.direction) && this.property.equals(that.property);
	}
	
    public int hashCode() {
        int result = 17;
        result = 31 * result + direction.hashCode();
        result = 31 * result + property.hashCode();
        return result;
    }
    
    public String toString() {
        return String.format("%s: %s", property, direction);
    }
}
