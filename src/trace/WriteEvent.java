package trace;

public class WriteEvent extends Event {

	public WriteEvent(final int globalId, final int localId, final String threadName) {
		super(globalId, localId, threadName, EventType.WRITE_EVENT);
	}

}
