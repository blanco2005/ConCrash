package trace;

public class ReadEvent extends Event {

	public ReadEvent(final int globalId, final int localId, final String threadName) {
		super(globalId, localId, threadName, EventType.READ_EVENT);
	}

}
