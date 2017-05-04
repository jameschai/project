package com.gymx.user.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Administrator on 2017/5/3.
 */
public class BaseDao extends SqlSessionDaoSupport {
    protected final Logger logger = LoggerFactory.getLogger (this.getClass ());
}
