package DSD.T1.Entity;

/**
 * Generated from IDL interface "Pessoa".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 29 de jun de 2023 00:06:19
 */

public final class PessoaHolder	implements org.omg.CORBA.portable.Streamable{
	 public Pessoa value;
	public PessoaHolder()
	{
	}
	public PessoaHolder (final Pessoa initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return PessoaHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PessoaHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		PessoaHelper.write (_out,value);
	}
}
