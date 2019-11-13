/**
 * CommuneService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.antislashn.communes.service;

public interface CommuneService extends java.rmi.Remote {
    public org.antislashn.communes.service.Region[] getAllRegions() throws java.rmi.RemoteException;
    public org.antislashn.communes.service.Commune[] getCommunesByCodePostalLike(java.lang.String arg0) throws java.rmi.RemoteException;
	public String[] decimalToSexagesimal(String cp);
}
