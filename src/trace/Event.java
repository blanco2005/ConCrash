package trace;

public abstract class Event {

	/** A global Id of the event in the trace. In the case of sequential trace, it will be equal to the local id. **/
	private final int globalId;

	/** A thread-local Id of the event in the trace. In the case of sequential trace, every event has a different ID; in the case of
	 * concurrent trace, different event of different threads can have the same id **/
	private final int localId;

	/** The thread generating the event. In the future it's better to use an int, to make comparison faster. **/
	private final String threadName;

	private final EventType type;

	public Event(final int globalId, final int localId, final String threadName, final EventType type) {
		this.globalId = globalId;
		this.localId = localId;
		this.threadName = threadName;
		this.type = type;
	}

	public int getGlobalId() {
		return globalId;
	}

	public int getLocalId() {
		return localId;
	}

	public String getThreadName() {
		return threadName;
	}

	public EventType getType() {
		return type;
	}

	@Override
	public String toString() {
		return "GID: " + globalId + " Thread: " + threadName + " LID: " + localId + " Type: " + type;
	}
}
