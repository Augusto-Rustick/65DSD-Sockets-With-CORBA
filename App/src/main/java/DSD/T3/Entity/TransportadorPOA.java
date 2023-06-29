package DSD.T1.Entity;


/**
 * Generated from IDL interface "Transportador".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 29 de jun de 2023 00:06:19
 */

public abstract class TransportadorPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, DSD.T1.Entity.TransportadorOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "_get_telefone", Integer.valueOf(0));
		m_opsHash.put ( "_set_telefone", Integer.valueOf(1));
		m_opsHash.put ( "_set_departamento", Integer.valueOf(2));
		m_opsHash.put ( "_set_nome", Integer.valueOf(3));
		m_opsHash.put ( "_set_id", Integer.valueOf(4));
		m_opsHash.put ( "_set_endereco", Integer.valueOf(5));
		m_opsHash.put ( "_get_id", Integer.valueOf(6));
		m_opsHash.put ( "_get_cpf", Integer.valueOf(7));
		m_opsHash.put ( "_set_carregamento", Integer.valueOf(8));
		m_opsHash.put ( "_get_endereco", Integer.valueOf(9));
		m_opsHash.put ( "_set_cpf", Integer.valueOf(10));
		m_opsHash.put ( "_get_carregamento", Integer.valueOf(11));
		m_opsHash.put ( "_get_nome", Integer.valueOf(12));
		m_opsHash.put ( "_get_departamento", Integer.valueOf(13));
	}
	private String[] ids = {"IDL:DSD/T1/Entity/Transportador:1.0","IDL:DSD/T1/Entity/Pessoa:1.0"};
	public DSD.T1.Entity.Transportador _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		DSD.T1.Entity.Transportador __r = DSD.T1.Entity.TransportadorHelper.narrow(__o);
		return __r;
	}
	public DSD.T1.Entity.Transportador _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		DSD.T1.Entity.Transportador __r = DSD.T1.Entity.TransportadorHelper.narrow(__o);
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
			case 0: // _get_telefone
			{
			_out = handler.createReply();
			java.lang.String tmpResult18 = telefone();
_out.write_string( tmpResult18 );
				break;
			}
			case 1: // _set_telefone
			{
			_out = handler.createReply();
			telefone(_input.read_string());
				break;
			}
			case 2: // _set_departamento
			{
			_out = handler.createReply();
			departamento(_input.read_long());
				break;
			}
			case 3: // _set_nome
			{
			_out = handler.createReply();
			nome(_input.read_string());
				break;
			}
			case 4: // _set_id
			{
			_out = handler.createReply();
			id(_input.read_long());
				break;
			}
			case 5: // _set_endereco
			{
			_out = handler.createReply();
			endereco(_input.read_string());
				break;
			}
			case 6: // _get_id
			{
			_out = handler.createReply();
			_out.write_long(id());
				break;
			}
			case 7: // _get_cpf
			{
			_out = handler.createReply();
			java.lang.String tmpResult19 = cpf();
_out.write_string( tmpResult19 );
				break;
			}
			case 8: // _set_carregamento
			{
			_out = handler.createReply();
			carregamento(_input.read_long());
				break;
			}
			case 9: // _get_endereco
			{
			_out = handler.createReply();
			java.lang.String tmpResult20 = endereco();
_out.write_string( tmpResult20 );
				break;
			}
			case 10: // _set_cpf
			{
			_out = handler.createReply();
			cpf(_input.read_string());
				break;
			}
			case 11: // _get_carregamento
			{
			_out = handler.createReply();
			_out.write_long(carregamento());
				break;
			}
			case 12: // _get_nome
			{
			_out = handler.createReply();
			java.lang.String tmpResult21 = nome();
_out.write_string( tmpResult21 );
				break;
			}
			case 13: // _get_departamento
			{
			_out = handler.createReply();
			_out.write_long(departamento());
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
