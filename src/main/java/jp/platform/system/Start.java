package jp.platform.system;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.webapp.WebAppContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Jetty启动类
 */
public class Start {

	static final Logger logger = LoggerFactory.getLogger(Start.class);

	public static void main(String[] args) throws Exception {
		int port = Integer.getInteger("port", 1002);
		logger.info("Starting server at port {}", port);
		Server server = new Server(port);

		WebAppContext handler = new WebAppContext();

		handler.setContextPath("/");
		handler.setBaseResource(Resource.newClassPathResource("/webapp"));
		handler.setMaxFormContentSize(Integer.MAX_VALUE);
		handler.setDefaultsDescriptor("/webdefault.xml");

		server.setHandler(handler);
		server.start();
		logger.info("Server started at port {}", port);

		server.join();
	}

}