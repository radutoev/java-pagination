package org.tzotopia.commons.pagination;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPageImpl<T, V> extends AbstractPage
{
    private Set<T> content = new HashSet<>();

    public SetPageImpl(Set<T> content, V nextPage, V previousPage)
    {
        if (null == content) {
            throw new IllegalArgumentException("Content must not be null!");
        }
        this.content.addAll(content);
        this.nextPage = nextPage;
        this.previousPage = previousPage;
    }

    @Override
    public Collection<T> getContent() {
        return content;
    }

    @Override
    public boolean getHasContent() {
        return !content.isEmpty();
    }

    @Override
    public Iterator<T> iterator() {
        return content.iterator();
    }
}
