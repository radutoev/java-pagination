package org.tzotopia.commons.pagination;

import java.util.Collection;

public interface Page<T, V> extends Iterable<T>
{
	public Collection<T> getContent();

	public boolean getHasContent();

    public V getNext();

    public V getPrevious();
}
