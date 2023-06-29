package DSD.T1.Entity;


/**
 * Generated from IDL interface "Departamento".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 29 de jun de 2023 00:06:19
 */

public abstract class DepartamentoPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, DSD.T1.Entity.DepartamentoOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "setProduto", Integer.valueOf(0));
		m_opsHash.put ( "setQuantidadeEstoque", Integer.valueOf(1));
		m_opsHash.put ( "getNome", Integer.valueOf(2));
		m_opsHash.put ( "getQuantidadeEstoque", Integer.valueOf(3));
		m_opsHash.put ( "getProduto", Integer.valueOf(4));
	}
	private String[] ids = {"IDL:DSD/T1/Entity/Departamento:1.0"};
	public DSD.T1.Entity.Departamento _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		DSD.T1.Entity.Departamento __r = DSD.T1.Entity.DepartamentoHelper.narrow(__o);
		return __r;
	}
	public DSD.T1.Entity.Departamento _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		DSD.T1.Entity.Departamento __r = DSD.T1.Entity.DepartamentoHelper.narrow(__o);
		return __r;
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // setProduto
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				setProduto(_arg0);
				break;
			}
			case 1: // setQuantidadeEstoque
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				setQuantidadeEstoque(_arg0);
				break;
			}
			case 2: // getNome
			{
				_out = handler.createReply();
				java.lang.String tmpResult23 = getNome();
_out.write_string( tmpResult23 );
				break;
			}
			case 3: // getQuantidadeEstoque
			{
				_out = handler.createReply();
				_out.write_long(getQuantidadeEstoque());
				break;
			}
			case 4: // getProduto
			{
				_out = handler.createReply();
				java.lang.String tmpResult24 = getProduto();
_out.write_string( tmpResult24 );
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
