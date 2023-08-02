package com.dscomm.dao.impl;

import com.dscomm.SpringbootJdbcApplication;
import com.dscomm.dao.IAccountDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


/**
 * Created by fangzhipeng on 2017/4/20.
 */
@Repository
public class AccountDaoImpl implements IAccountDAO {
    private static final Logger logger = LoggerFactory.getLogger(SpringbootJdbcApplication.class);


    @Autowired
    @Qualifier("sqlserverTemplate")
    private JdbcTemplate jdbcTemplate;




}
