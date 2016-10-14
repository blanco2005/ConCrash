package trace;

public class StartEvent extends Event {

	/** The name of the thread to start. **/
	private final String threadToStart;

	public StartEvent(final int globalId, final int localId, final String threadName, final String threadToStart) {
		super(globalId, localId, threadName, EventType.START_EVENT);
		this.threadToStart = threadToStart;
	}

	public final String getThreadToStart() {
		return threadToStart;
	}

}
