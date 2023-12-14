package com.ceph.rados;

/**
 * A time value that is accurate to the nearest<br>
 * microsecond but also has a range of years.<br>
 * <i>native declaration : /usr/include/bits/time.h:50</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a>, <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class timeval extends com.sun.jna.Structure {
	/**
	 * Seconds.<br>
	 * C type : __time_t
	 */
	public int tv_sec;
	/**
	 * Microseconds.<br>
	 * C type : __suseconds_t
	 */
	public int tv_usec;
	public timeval() {
		super();
	}
	/**
	 * @param tv_sec Seconds.<br>
	 * C type : __time_t<br>
	 * @param tv_usec Microseconds.<br>
	 * C type : __suseconds_t
	 */
	public timeval(int tv_sec, int tv_usec) {
		super();
		this.tv_sec = tv_sec;
		this.tv_usec = tv_usec;
	}
	protected ByReference newByReference() {
		ByReference s = new ByReference();
		s.useMemory(getPointer());
		write();
		s.read();
		return s;
	}
	protected ByValue newByValue() {
		ByValue s = new ByValue();
		s.useMemory(getPointer());
		write();
		s.read();
		return s;
	}
	protected timeval newInstance() {
		timeval s = new timeval();
		s.useMemory(getPointer());
		write();
		s.read();
		return s;
	}
	public static class ByReference extends timeval implements com.sun.jna.Structure.ByReference {}
	public static class ByValue extends timeval implements com.sun.jna.Structure.ByValue {}
}
