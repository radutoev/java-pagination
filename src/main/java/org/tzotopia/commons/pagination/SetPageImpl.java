package org.tzotopia.commons.pagination;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by radutoev on 16/12/13.
 */
public class SetPageImpl<T> implements Page<T>
{
    private Set<T> content = new HashSet<>();

    public SetPageImpl(Set<T> content)
    {
        if (null == content) {
            throw new IllegalArgumentException("Content must not be null!");
        }
        this.content.addAll(content);
    }

    @Override
    public Collection<T> getContent() {
        return content;
    }

    @Override
    public boolean hasContent() {
        return !content.isEmpty();
    }

    @Override
    public Iterator<T> iterator() {
        return content.iterator();
    }
}
