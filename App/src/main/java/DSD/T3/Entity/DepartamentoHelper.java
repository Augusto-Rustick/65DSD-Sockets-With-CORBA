package DSD.T3.Entity;


/**
 * Generated from IDL interface "Departamento".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 27 de jun de 2023 10:59:21
 */

public abstract class DepartamentoHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(DepartamentoHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:DSD/T3/Entity/Departamento:1.0", "Departamento");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final DSD.T3.Entity.Departamento s)
	{
			any.insert_Object(s);
	}
	public static DSD.T3.Entity.Departamento extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:DSD/T3/Entity/Departamento:1.0";
	}
	public static Departamento read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(DSD.T3.Entity._DepartamentoStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final DSD.T3.Entity.Departamento s)
	{
		_out.write_Object(s);
	}
	public static DSD.T3.Entity.Departamento narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof DSD.T3.Entity.Departamento)
		{
			return (DSD.T3.Entity.Departamento)obj;
		}
		else if (obj._is_a("IDL:DSD/T3/Entity/Departamento:1.0"))
		{
			DSD.T3.Entity._DepartamentoStub stub;
			stub = new DSD.T3.Entity._DepartamentoStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static DSD.T3.Entity.Departamento unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof DSD.T3.Entity.Departamento)
		{
			return (DSD.T3.Entity.Departamento)obj;
		}
		else
		{
			DSD.T3.Entity._DepartamentoStub stub;
			stub = new DSD.T3.Entity._DepartamentoStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
