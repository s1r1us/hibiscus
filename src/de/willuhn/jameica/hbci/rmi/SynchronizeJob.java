/**********************************************************************
 * $Source: /cvsroot/hibiscus/hibiscus/src/de/willuhn/jameica/hbci/rmi/SynchronizeJob.java,v $
 * $Revision: 1.2 $
 * $Date: 2006/03/17 00:51:25 $
 * $Author: willuhn $
 * $Locker:  $
 * $State: Exp $
 *
 * Copyright (c) by willuhn.webdesign
 * All rights reserved
 *
 **********************************************************************/

package de.willuhn.jameica.hbci.rmi;

import java.rmi.RemoteException;

import de.willuhn.datasource.GenericObject;
import de.willuhn.jameica.hbci.server.hbci.AbstractHBCIJob;
import de.willuhn.util.ApplicationException;

/**
 * Interface fuer einen einzelnen Synchronisierungs-Job.
 * @author willuhn
 */
public interface SynchronizeJob extends GenericObject
{
  /**
   * Erzeugt einen HBCI-Job basierend auf dem SynchronizeJob.
   * @return der erzeugte HBCI-Job.
   * @throws RemoteException
   * @throws ApplicationException
   */
  public AbstractHBCIJob createHBCIJob() throws RemoteException, ApplicationException;
  
  /**
   * Liefert einen sprechenden Namen fuer den Job.
   * @return sprechender Name.
   * @throws RemoteException
   */
  public String getName() throws RemoteException;
  
  /**
   * Oeffnet den Synchronisierungs-Job zur Konfiguration.
   * @throws RemoteException
   * @throws ApplicationException
   */
  public void configure() throws RemoteException, ApplicationException;
}


/*********************************************************************
 * $Log: SynchronizeJob.java,v $
 * Revision 1.2  2006/03/17 00:51:25  willuhn
 * @N bug 209 Neues Synchronisierungs-Subsystem
 *
 * Revision 1.1  2006/03/16 18:23:36  willuhn
 * @N first code for new synchronize system
 *
 *********************************************************************/