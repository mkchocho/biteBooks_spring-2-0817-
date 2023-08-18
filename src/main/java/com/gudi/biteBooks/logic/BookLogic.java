package com.gudi.biteBooks.logic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gudi.biteBooks.dao.BookDao;

import java.util.List;
import java.util.Map;

@Service
public class BookLogic {
    Logger logger = LoggerFactory.getLogger(BookLogic.class);
    @Autowired
    private BookDao bookDao = null;

    public List<Map<String, Object>> bookList(Map<String, Object> pMap) {
        List<Map<String, Object>> bList = null;
        bList = bookDao.bookList(pMap);
        return bList;
    }

    //insert method here 

}
