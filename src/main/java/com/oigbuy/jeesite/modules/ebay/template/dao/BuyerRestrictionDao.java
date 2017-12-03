package com.oigbuy.jeesite.modules.ebay.template.dao;

import org.apache.ibatis.annotations.Param;

import com.oigbuy.jeesite.common.persistence.CrudDao;
import com.oigbuy.jeesite.common.persistence.annotation.MyBatisDao;
import com.oigbuy.jeesite.modules.ebay.template.entity.BuyerRestriction;


@MyBatisDao
public interface BuyerRestrictionDao extends CrudDao<BuyerRestriction> {

	 int findCountBytemplateName(@Param("templateName") String templateName);
}
