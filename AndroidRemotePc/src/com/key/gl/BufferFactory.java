package com.key.gl;


import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

/**
 * A utility class to create buffers.
 * 
 * All public methods are static.
 */
public class BufferFactory {
	// This class cannot and should not be instantiated
	private BufferFactory() {}

	/**
	 * Creates a buffer of floats using memory outside the normal, garbage collected heap
	 * 
	 * @param capacity		The number of primitives to create in the buffer.
	 */
	public static FloatBuffer createFloatBuffer(int capacity) {
		// 4 is the number of bytes in a float
		ByteBuffer vbb = ByteBuffer.allocateDirect(capacity * 4);
		vbb.order(ByteOrder.nativeOrder());
		return vbb.asFloatBuffer();
	}

	/**
	 * Creates a buffer of shorts using memory outside the normal, garbage collected heap
	 * 
	 * @param capacity		The number of primitives to create in the buffer.
	 */
	public static ShortBuffer createShortBuffer(int capacity) {
		// 2 is the number of bytes in a short
		ByteBuffer vbb = ByteBuffer.allocateDirect(capacity * 2);
		vbb.order(ByteOrder.nativeOrder());
		return vbb.asShortBuffer();
	}
	
	public static IntBuffer createIntBuffer(int capacity) {
		ByteBuffer vbb = ByteBuffer.allocateDirect(capacity * 4);
		vbb.order(ByteOrder.nativeOrder());
		return vbb.asIntBuffer();
	}
	
	public static ByteBuffer createByteBuffer(int capacity) {
		ByteBuffer vbb = ByteBuffer.allocateDirect(capacity);
		vbb.order(ByteOrder.nativeOrder());
		return vbb;
	}
}
