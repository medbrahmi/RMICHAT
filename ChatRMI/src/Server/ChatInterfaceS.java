package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;

import Client.ChatInterfaceC;

public interface ChatInterfaceS extends Remote {
	void registerChatClient(ChatInterfaceC client) throws RemoteException;
	void SendMessage(String message) throws RemoteException;
	

}
