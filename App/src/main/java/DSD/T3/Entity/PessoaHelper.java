package DSD.T3.Entity;


/**
 * Generated from IDL interface "Pessoa".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 29 de jun de 2023 00:14:07
 */

public abstract class PessoaHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(PessoaHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:DSD/T3/Entity/Pessoa:1.0", "Pessoa");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final DSD.T3.Entity.Pessoa s)
	{
			any.insert_Object(s);
	}
	public static DSD.T3.Entity.Pessoa extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:DSD/T3/Entity/Pessoa:1.0";
	}
	public static Pessoa read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(DSD.T3.Entity._PessoaStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final DSD.T3.Entity.Pessoa s)
	{
		_out.write_Object(s);
	}
	public static DSD.T3.Entity.Pessoa narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof DSD.T3.Entity.Pessoa)
		{
			return (DSD.T3.Entity.Pessoa)obj;
		}
		else if (obj._is_a("IDL:DSD/T3/Entity/Pessoa:1.0"))
		{
			DSD.T3.Entity._PessoaStub stub;
			stub = new DSD.T3.Entity._PessoaStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static DSD.T3.Entity.Pessoa unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof DSD.T3.Entity.Pessoa)
		{
			return (DSD.T3.Entity.Pessoa)obj;
		}
		else
		{
			DSD.T3.Entity._PessoaStub stub;
			stub = new DSD.T3.Entity._PessoaStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
