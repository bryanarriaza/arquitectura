package com.paradigma.arquitecture.event;

import java.io.Serializable;

/**
 * The Class RemoteEvent.
 *
 * @author Javier Ledo Vázquez
 * @version 1.0
 * @param <T>
 *            the generic type
 */
public class RemoteEvent extends AbstractEvent implements Serializable, SendRemote{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4088715604882690142L;

	public RemoteEvent(String source) {
		super(source);
	}

}
