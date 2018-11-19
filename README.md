# RMICHAT
Java RMI Example : a simple chat program using two users. One user will be chatting from the server side, whilst the other user would be chatting from the client side of the RMI application


USAGE - Open 3 terminal instances :
  Access the bin file in the project in all terminals (ex: cd C:\Users\user\eclipse-workspace\ChatRMI\bin)
  
  first terminal :
  
    rmic Server.ChatServer
    rmic Client.ChatClient
    rmiregistry
   
  Second terminal :
  
    java Server.ChatServerMain
    
  Third terminal :
  
    java Client.ChatClientMain "Chosen Name"
    
  and then type a message to be displayed by the server side
   
