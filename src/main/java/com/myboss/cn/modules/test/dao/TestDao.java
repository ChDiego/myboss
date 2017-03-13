/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.myboss.cn.modules.test.dao;

import com.myboss.cn.common.persistence.CrudDao;
import com.myboss.cn.common.persistence.annotation.MyBatisDao;
import com.myboss.cn.modules.test.entity.Test;

/**
 * 测试DAO接口
 * @author ThinkGem
 * @version 2013-10-17
 */
@MyBatisDao
public interface TestDao extends CrudDao<Test> {
	
}
