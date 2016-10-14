package trace;

public class JoinEvent extends Event {

	/** The name of the thread to wait. **/
	private final String threadToWait;

	public JoinEvent(final int globalId, final int localId, final String threadName, final String threadToWait) {
		super(globalId, localId, threadName, EventType.JOIN_EVENT);
		this.threadToWait = threadToWait;
	}

	public final String getThreadToWait() {
		return this.threadToWait;
	}

}
