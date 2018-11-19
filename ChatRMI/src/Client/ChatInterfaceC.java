package Client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatInterfaceC extends Remote {
	void receiveMessage(String message) throws RemoteException;
}
