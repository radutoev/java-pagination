package org.tzotopia.commons.pagination;

public class PageRequest implements Pageable {
	private final int page;
	private final int size;
	private final Sort sort;

	public PageRequest(int page, int size, Sort sort) {
		if (page < 0) {
			throw new IllegalArgumentException(
					"Page index must not be less than zero!");
		}
		if (size < 1) {
			throw new IllegalArgumentException(
					"Page size must not be less than one!");
		}
		this.page = page;
		this.size = size;
		this.sort = sort;
	}

	public int getPageNumber() {
		return page;
	}

	public int getPageSize() {
		return size;
	}

	public Sort getSort() {
		return sort;
	}

	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof PageRequest)) {
			return false;
		}
		PageRequest that = (PageRequest) obj;
		boolean pageEqual = this.page == that.page;
		boolean sizeEqual = this.size == that.size;
		boolean sortEqual = this.sort == null ? that.sort == null : this.sort.equals(that.sort);
		return pageEqual && sizeEqual && sortEqual;
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + page;
		result = 31 * result + size;
		result = 31 * result + (null == sort ? 0 : sort.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return String.format("Page request [number: %d, size %d, sort: %s]",
				page, size, sort == null ? null : sort.toString());
	}
}
