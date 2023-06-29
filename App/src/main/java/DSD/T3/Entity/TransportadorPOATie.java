package DSD.T1.Entity;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Transportador".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 29 de jun de 2023 00:06:19
 */

public class TransportadorPOATie
	extends TransportadorPOA
{
	private TransportadorOperations _delegate;

	private POA _poa;
	public TransportadorPOATie(TransportadorOperations delegate)
	{
		_delegate = delegate;
	}
	public TransportadorPOATie(TransportadorOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
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
	public TransportadorOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TransportadorOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public java.lang.String telefone()
	{
		return _delegate.telefone();
	}

	public void telefone(java.lang.String a)
	{
		_delegate.telefone(a);
	}

	public void departamento(int a)
	{
		_delegate.departamento(a);
	}

	public void nome(java.lang.String a)
	{
		_delegate.nome(a);
	}

	public void id(int a)
	{
		_delegate.id(a);
	}

	public void endereco(java.lang.String a)
	{
		_delegate.endereco(a);
	}

	public int id()
	{
		return _delegate.id();
	}

	public java.lang.String cpf()
	{
		return _delegate.cpf();
	}

	public void carregamento(int a)
	{
		_delegate.carregamento(a);
	}

	public java.lang.String endereco()
	{
		return _delegate.endereco();
	}

	public void cpf(java.lang.String a)
	{
		_delegate.cpf(a);
	}

	public int carregamento()
	{
		return _delegate.carregamento();
	}

	public java.lang.String nome()
	{
		return _delegate.nome();
	}

	public int departamento()
	{
		return _delegate.departamento();
	}

}
