package com.book.mall.dao;

import com.book.mall.domain.Book;

import java.util.List;

public interface BookDao {

    /**
     * 根据书名搜索书籍
     *
     * @param bookName
     * @return
     */
    List<Book> selectBookByName(String bookName);
}