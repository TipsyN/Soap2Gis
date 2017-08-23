package com.ric.st.dao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import com.ric.bill.model.exs.Ulist;
import com.ric.bill.model.exs.UlistTp;


public interface UlistDAO {

	public List<UlistTp> getListTpByGrp(String grp);
	public List<Ulist> getListByGrpId(String grp, BigInteger id);
	public void delListByListTp(UlistTp ulistTp);
}