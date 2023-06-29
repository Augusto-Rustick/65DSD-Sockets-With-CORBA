package DSD.T1.Entity;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Pessoa".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 29 de jun de 2023 00:06:19
 */

public class PessoaPOATie
	extends PessoaPOA
{
	private PessoaOperations _delegate;

	private POA _poa;
	public PessoaPOATie(PessoaOperations delegate)
	{
		_delegate = delegate;
	}
	public PessoaPOATie(PessoaOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public DSD.T1.Entity.Pessoa _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		DSD.T1.Entity.Pessoa __r = DSD.T1.Entity.PessoaHelper.narrow(__o);
		return __r;
	}
	public DSD.T1.Entity.Pessoa _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		DSD.T1.Entity.Pessoa __r = DSD.T1.Entity.PessoaHelper.narrow(__o);
		return __r;
	}
	public PessoaOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(PessoaOperations delegate)
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

	public java.lang.String cpf()
	{
		return _delegate.cpf();
	}

	public int id()
	{
		return _delegate.id();
	}

	public java.lang.String endereco()
	{
		return _delegate.endereco();
	}

	public void cpf(java.lang.String a)
	{
		_delegate.cpf(a);
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
