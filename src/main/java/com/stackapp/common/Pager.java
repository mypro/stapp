package com.stackapp.common;

import java.io.Serializable;
import java.util.List;

public class Pager implements Serializable {
	private static final long serialVersionUID = 1L;
	private int offset;
	private int pageSize;
	private long recordCount;
	private int pageCount;
	private List results;

	public Pager(int offset, int pageSize) {
		super();
		this.offset = offset;
		this.pageSize = pageSize;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(long recordCount) {
		this.recordCount = recordCount;
	}

	public int getPageCount() {
		if (pageCount < 0) {
			pageCount = (int) Math.ceil((double) recordCount / pageSize);
		}
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public List getResults() {
		return results;
	}

	public void setResults(List results) {
		this.results = results;
	}
}
