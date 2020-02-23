package com.adekah.issuemanagement.util;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;

public class TPage<T> {
private int number;
private int size;
private int totalPages;
    private Long totalElements;
private Sort sort;
private List<T> content;

public void setStat(Page page, List<T>list){
    this.number=page.getNumber();
    this.size=page.getSize();
    this.totalPages=page.getTotalPages();
    this.totalElements=page.getTotalElements();
    this.sort=page.getSort();
    this.content=list;

}


}
