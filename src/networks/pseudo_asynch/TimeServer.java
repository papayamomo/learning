package networks.pseudo_asynch;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import networks.bio.TimeServerHandler;

public class TimeServer {

	public static void main(String[] args) throws IOException {
		int port = 8080;
		if (args != null && args.length > 0) {
			try {
				port = Integer.valueOf(args[0]);
			} catch (NumberFormatException e) {

			}
		}

		ServerSocket server = null;
		try {
			server = new ServerSocket(port);
			System.out.println("The time server is started in port : " + port);
			Socket socket = null;
			TimeServerHandlerExecutePool singleExecutor = new TimeServerHandlerExecutePool(
					50, 10000);
			while (true) {
				socket = server.accept();
				singleExecutor.execute(new TimeServerHandler(socket));
			}
		} finally {
			if (server != null) {
				System.out.println("The time server closed");
				server.close();
				server = null;
			}
		}
	}
}
