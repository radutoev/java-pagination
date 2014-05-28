package org.tzotopia.commons.pagination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DefaultPageImpl<T, V> extends AbstractPage
{
	private final List<T> content = new ArrayList<>();

	public DefaultPageImpl(List<T> content, V nextPage, V previousPage)
	{
		if (null == content) {
            throw new IllegalArgumentException("Content must not be null!");
		}
		this.content.addAll(content);
        this.nextPage = nextPage;
        this.previousPage = previousPage;
	}
	
	public Iterator<T> iterator() {
		return this.content.iterator();
	}

	public List<T> getContent() {
		return Collections.unmodifiableList(this.content);
	}
	
	public boolean getHasContent(){
		return !content.isEmpty();
	}
}
