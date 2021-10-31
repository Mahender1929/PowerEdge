package com.cebi.service;

import java.util.List;

import com.cebi.entity.TellerMaster;

public interface LoginService {
	public List<Object[]> validateLoginUser(TellerMaster tellerMaster);
	public boolean runScript(String bankName);
	public List<Object[]> validateSuperLoginUser(TellerMaster tellerMaster);
	public List<String> checkbankcode(String dburl,TellerMaster tellermaster);
}
