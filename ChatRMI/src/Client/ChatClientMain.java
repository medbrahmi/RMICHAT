package Client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import Server.ChatInterfaceS;

public class ChatClientMain {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		
		ChatInterfaceS server = (ChatInterfaceS)Naming.lookup("rmi://localhost/RMIChatServer");
		new Thread(new ChatClient(args[0], server)).start();
	}

}
