/**
 * 
 */
package com.hendyirawan.blueprintdep.dep;


/**
 * @author rudi
 *
 */
public class HelloImpl implements HelloService {

//	private static final Logger log = LoggerFactory.getLogger(HelloImpl.class);
	
	private void say(String something) {
		System.out.println(something);
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
