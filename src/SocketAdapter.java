
public class SocketAdapter implements EU{
	USSocket socket;
	
	public SocketAdapter(USSocket socket){
		this.socket = socket;
	}
	@Override
	public void power230() {
		socket.power120();
		
	}

}
