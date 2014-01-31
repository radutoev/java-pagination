package org.tzotopia.commons.pagination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DefaultPageImpl<T> implements Page<T> 
{
	private final List<T> content = new ArrayList<T>();
	
	public DefaultPageImpl(List<T> content)
	{
		if (null == content) {
            throw new IllegalArgumentException("Content must not be null!");
		}
		this.content.addAll(content);
	}
	
	public Iterator<T> iterator() {
		return this.content.iterator();
	}

	public List<T> getContent() {
		return Collections.unmodifiableList(this.content);
	}
	
	public boolean hasContent(){
		return !content.isEmpty();
	}
}
