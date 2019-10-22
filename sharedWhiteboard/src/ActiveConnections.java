import java.net.Socket;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

public class ActiveConnections {

	// thread-safe set
	public static Set<Socket> endPoints = new CopyOnWriteArraySet<Socket>();
	
	public static ConcurrentHashMap<Socket, String> SocketUsernameMap = new ConcurrentHashMap<>();
	


}
