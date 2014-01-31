package org.tzotopia.commons.pagination;

public interface Pageable 
{
	int getPageNumber();
	
	int getPageSize();
	
	Sort getSort();
}
