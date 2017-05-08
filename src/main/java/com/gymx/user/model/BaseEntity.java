package com.gymx.user.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/5/4.
 */
public class BaseEntity implements Serializable{
    private static final long serialVersionUID = 2413960745071474764L;

    private Long id;
    private String name;
    private String createBy;
    private Date createOn;
    private String updateBy;
    private String updateOn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Date createOn) {
        this.createOn = createOn;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getUpdateOn() {
        return updateOn;
    }

    public void setUpdateOn(String updateOn) {
        this.updateOn = updateOn;
    }
}
