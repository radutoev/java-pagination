package org.tzotopia.commons.pagination;

import java.util.Collection;

public interface Page<T> extends Iterable<T> 
{
	Collection<T> getContent();
	
	boolean hasContent();
}
