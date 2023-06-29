package DSD.T1.Entity;

/**
 * Generated from IDL interface "Funcionario".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 29 de jun de 2023 00:06:19
 */

public final class FuncionarioHolder	implements org.omg.CORBA.portable.Streamable{
	 public Funcionario value;
	public FuncionarioHolder()
	{
	}
	public FuncionarioHolder (final Funcionario initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return FuncionarioHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FuncionarioHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		FuncionarioHelper.write (_out,value);
	}
}
