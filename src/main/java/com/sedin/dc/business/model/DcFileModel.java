package com.sedin.dc.business.model;

import com.dzy.support.platform.common.util.Principal;
import com.dzy.support.platform.persistence.exception.PersistenceException;
import com.dzy.support.platform.service.common.BaseModel;
import com.sedin.dc.business.entity.DcFile;

public class DcFileModel extends BaseModel<DcFile>{

	public DcFileModel(Principal principal) throws PersistenceException
	{
		super(principal,DcFile.class);
	}
}
