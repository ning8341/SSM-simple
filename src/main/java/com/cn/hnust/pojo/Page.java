package com.cn.hnust.pojo;

import java.util.List;

public class Page<T> {
	private int currPage;// ��ǰҳ��
	private int pageSize;// ÿҳ��ʾ�ļ�¼��
	private int totalCount;// �ܼ�¼��
	private int totalPage;// ��ҳ��
	private List<T> lists;// ÿҳ����ʾ������
	public int getCurrPage() {
		return currPage;
	}
	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<T> getLists() {
		return lists;
	}
	public void setLists(List<T> lists) {
		this.lists = lists;
	}
	@Override
	public String toString() {
		return "Page [currPage=" + currPage + ", pageSize=" + pageSize + ", totalCount=" + totalCount + ", totalPage="
				+ totalPage + ", lists=" + lists + "]";
	}
	
	

}
