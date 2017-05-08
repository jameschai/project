package com.gymx.user.dao.impl;

import com.gymx.user.dao.IBaseDao;
import com.gymx.user.model.BaseEntity;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by Administrator on 2017/5/3.
 */
public class BaseDaoImpl<T extends BaseEntity> extends SqlSessionDaoSupport implements IBaseDao<T> {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * mybatis mapper xml namespace
     */
    protected String mapperNamespace;

    public BaseDaoImpl() {
        mapperNamespace = generateMapperNamespace();
    }

    private String generateMapperNamespace() {
        Type genericType = this.getClass().getGenericSuperclass();
        if (!(genericType instanceof ParameterizedType)) {
            return Object.class.getSimpleName();
        }
        Class clazz = (Class) ((ParameterizedType) genericType).getActualTypeArguments()[0];
        return clazz.getName() + ".";
    }

    public T findById(T entity) {
        if (null == entity) {
            logger.error("非法参数：entity为空！");
            throw new IllegalArgumentException("非法参数：entity为空！");
        }
        T result = null;
        try {
            result = this.getSqlSession().selectOne(mapperNamespace + SQL_FIND_BY_ID, entity);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return result;
    }

    public T save(T entity) {
        this.getSqlSession().update(mapperNamespace + SQL_SAVE, entity);
        if (entity != null && entity.getId() == null) {
            logger.error("保存失败");
        }else {
            logger.info("保存成功：new id = " + entity.getId());
        }
        return entity;
    }

    public boolean update(T entity) {
        int result = this.getSqlSession().update(mapperNamespace + SQL_UPDATE, entity);
        return (result > 0);
    }

    public boolean delete(Long id) {
        int result = this.getSqlSession().update(mapperNamespace + SQL_DELETE, id);
        return (result > 0);
    }
}
