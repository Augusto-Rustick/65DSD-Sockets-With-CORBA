package DSD.T3.Entity;

/**
 * Generated from IDL interface "Transportador".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 29 de jun de 2023 00:14:07
 */

public final class TransportadorHolder	implements org.omg.CORBA.portable.Streamable{
	 public Transportador value;
	public TransportadorHolder()
	{
	}
	public TransportadorHolder (final Transportador initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TransportadorHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TransportadorHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TransportadorHelper.write (_out,value);
	}
}
