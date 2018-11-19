package Client;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

import Server.ChatInterfaceS;

public class ChatClient extends UnicastRemoteObject implements ChatInterfaceC, Runnable {

	private static final long serialVersionUID = 1L;
	private String name = null;
	private ChatInterfaceS server;

	protected ChatClient(String name, ChatInterfaceS server) throws RemoteException {
		this.setName(name);
		this.setServer(server);
		server.registerChatClient(this);
	}

	@Override
	public void receiveMessage(String message) throws RemoteException {
		System.out.println(message);
		
	}

	@Override
	public void run() {
		Scanner scanner =new Scanner(System.in);
		String message;
		while(true) {
			message = scanner.nextLine().trim();
			try {
				server.SendMessage(name + " : " +message);
			}catch(RemoteException e){
				e.printStackTrace(); 
			}
		}
    	
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ChatInterfaceS getServer() {
		return server;
	}

	public void setServer(ChatInterfaceS server) {
		this.server = server;
	}

}
