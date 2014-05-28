package org.tzotopia.commons.pagination;

public abstract class AbstractPage<T,V> implements Page
{
    protected V nextPage;
    protected V previousPage;

    public V getNext(){
        return nextPage;
    }
    public V getPrevious(){
        return previousPage;
    }
}
