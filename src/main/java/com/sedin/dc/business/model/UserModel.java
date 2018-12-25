package com.sedin.dc.business.model;

import com.dzy.support.platform.common.util.Principal;
import com.dzy.support.platform.persistence.exception.PersistenceException;
import com.dzy.support.platform.service.common.BaseModel;
import com.sedin.dc.business.entity.DcUser;

public class UserModel extends BaseModel<DcUser>{

	public UserModel(Principal principal) throws PersistenceException
	{
		super(principal,DcUser.class);
	}
}
