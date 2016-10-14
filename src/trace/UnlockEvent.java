package trace;

public class UnlockEvent extends Event {

	public UnlockEvent(final int globalId, final int localId, final String threadName) {
		super(globalId, localId, threadName, EventType.UNLOCK_EVENT);
	}

}
