package trace;

import java.util.ArrayList;
import java.util.List;

public class Trace {

	private final List<Event> events;

	public Trace(final List<Event> events) {
		this.events = new ArrayList<>(events);
	}

	public final synchronized Event getEvent(final int index) {
		return this.events.get(index);
	}

	public final synchronized void addEvent(final Event event) {
		this.events.add(event);
	}
}
