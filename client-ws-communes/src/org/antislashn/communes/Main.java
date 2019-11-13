package org.antislashn.communes;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.antislashn.communes.service.Commune;
import org.antislashn.communes.service.CommuneService;
import org.antislashn.communes.service.CommuneServiceServiceLocator;
import org.antislashn.communes.service.Region;

public class Main {

	public static void main(String[] args) throws ServiceException, RemoteException {
	CommuneService service = new CommuneServiceServiceLocator().getCommuneServicePort();
	Region[] regions = service.getAllRegions();
	Commune[] communes = service.getCommunesByCodePostalLike("95");
	for (Region r : regions) {
		System.out.println(r.getNom());
	}
	for (Commune c : communes) {
		System.out.println(c.getNom() +" - " + c.getCodePostal());
		System.out.println(service.decimalToSexagesimal(c.getCodePostal()));
	}
	

	}

}
