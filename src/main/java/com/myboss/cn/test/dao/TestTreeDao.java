/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.myboss.cn.test.dao;

import com.myboss.cn.common.persistence.TreeDao;
import com.myboss.cn.common.persistence.annotation.MyBatisDao;
import com.myboss.cn.test.entity.TestTree;

/**
 * 树结构生成DAO接口
 * @author ThinkGem
 * @version 2015-04-06
 */
@MyBatisDao
public interface TestTreeDao extends TreeDao<TestTree> {
	
}