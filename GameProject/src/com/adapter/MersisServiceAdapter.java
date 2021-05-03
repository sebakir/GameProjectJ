package com.adapter;

import java.rmi.RemoteException;

import com.abstracts.IUserValidateService;
import com.entities.User;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MersisServiceAdapter implements IUserValidateService {

	@Override
	public boolean validate(User user) throws Exception {
		// TODO Auto-generated method stub
		KPSPublicSoap kpsPublicSoap = new KPSPublicSoapProxy();
		
		return kpsPublicSoap.TCKimlikNoDogrula(user.getNationalityId(), user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(), user.getDateOfBirth());
		
	}

}
