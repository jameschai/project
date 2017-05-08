package com.gymx.user.dao;

import com.gymx.user.model.BaseEntity;

/**
 * Created by Administrator on 2017/5/4.
 */
public interface IBaseDao<T extends BaseEntity> {

    /**
     * 保存
     */
    public static final String SQL_SAVE="save";

    /**
     * 删除
     */
    public static final String SQL_DELETE="delete";

    /**
     * 更新
     */
    public static final String SQL_UPDATE="update";

    /**
     * 根据Id查询
     */
    public static final String SQL_FIND_BY_ID = "findById";

    /**
     * 根据ID查询
     * @param entity
     * @return
     */
    T findById(T entity);

    /**
     * 保存
     * @param entity
     * @return
     */
    T save(T entity);

    /**
     * 更新
     * @param entity
     * @return
     */
    boolean update(T entity);

    /**
     * 删除
     * @param id
     * @return
     */
    boolean delete(Long id);

}
