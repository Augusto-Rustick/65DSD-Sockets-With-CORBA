package DSD.T3.Entity;

/**
 * Generated from IDL interface "Departamento".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 29 de jun de 2023 00:14:07
 */

public final class DepartamentoHolder	implements org.omg.CORBA.portable.Streamable{
	 public Departamento value;
	public DepartamentoHolder()
	{
	}
	public DepartamentoHolder (final Departamento initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return DepartamentoHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = DepartamentoHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		DepartamentoHelper.write (_out,value);
	}
}
