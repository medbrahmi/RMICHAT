package Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Client.ChatInterfaceC;

public class ChatServer extends UnicastRemoteObject implements ChatInterfaceS {

	private static final long serialVersionUID = 1L;
	private ArrayList<ChatInterfaceC> clients;
	protected ChatServer() throws RemoteException {
		clients = new ArrayList<ChatInterfaceC>();
	}

	@Override
	public synchronized void registerChatClient(ChatInterfaceC client) throws RemoteException {
		this.clients.add(client);
		
	}

	@Override
	public synchronized void SendMessage(String message) throws RemoteException {
		int i = 0;
		while(i<clients.size()) {
			clients.get(i++).receiveMessage(message);
		}
		
	}

}
