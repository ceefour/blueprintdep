/**
 * 
 */
package com.hendyirawan.blueprintdep.dep;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author rudi
 *
 */
public class HelloImpl implements HelloService {

	private static final Logger log = LoggerFactory.getLogger(HelloImpl.class);
	
	private void say(String something) {
//		System.out.println(something);
		log.warn(something);
	}
	
	/* (non-Javadoc)
	 * @see com.hendyirawan.blueprintdep.dep.HelloService#hello()
	 */
	public void hello() {
		say("Hai girl");
	}
	
	public HelloImpl() {
		say("HelloService constructed");
	}
	
	public void init() {
		say("HelloService inited");
	}
	
	public void destroy() {
		say("HelloService destroyed");
	}

}
