package com.sedin.dc.business.service.impl;

import com.dzy.support.platform.common.exception.CommonException;
import com.dzy.support.platform.common.util.Principal;
import com.dzy.support.platform.service.common.BaseService;
import com.sedin.dc.business.entity.DcUser;
import com.sedin.dc.business.service.IUserService;

public class UserService extends BaseService<DcUser> implements IUserService
{

	public UserService(Principal principal) throws CommonException
	{
		super(principal,DcUser.class);
	}
}
