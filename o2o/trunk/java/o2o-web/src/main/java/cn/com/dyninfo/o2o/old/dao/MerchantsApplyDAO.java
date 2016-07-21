/*
 * Copyright (c) 2009-2016 SHENZHEN Eternal Dynasty Technology Co.,Ltd.
 * All rights reserved.
 *
 * This file contains valuable properties of  SHENZHEN Eternal Dynasty
 * Technology Co.,Ltd.,  embodying  substantial  creative efforts  and
 * confidential information, ideas and expressions.    No part of this
 * file may be reproduced or distributed in any form or by  any  means,
 * or stored in a data base or a retrieval system,  without  the prior
 * written permission  of  SHENZHEN Eternal Dynasty Technology Co.,Ltd.
 *
 */

package cn.com.dyninfo.o2o.old.dao;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.com.dyninfo.o2o.old.dao.BaseDAO;

/**
 * 商家加盟申请
 * @author Administrator
 *
 */
@Repository("merchantsApplyDAO")
public class MerchantsApplyDAO extends BaseDAO {

	@Autowired
	public MerchantsApplyDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
		this.table="MerchantsApply";
	}
}