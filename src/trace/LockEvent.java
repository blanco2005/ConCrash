package trace;

public class LockEvent extends Event {

	public LockEvent(final int globalId, final int localId, final String threadName) {
		super(globalId, localId, threadName, EventType.LOCK_EVENT);
	}

}
