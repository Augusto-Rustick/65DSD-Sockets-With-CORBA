package DSD.T1.Entity;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Funcionario".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 29 de jun de 2023 00:06:19
 */

public class FuncionarioPOATie
	extends FuncionarioPOA
{
	private FuncionarioOperations _delegate;

	private POA _poa;
	public FuncionarioPOATie(FuncionarioOperations delegate)
	{
		_delegate = delegate;
	}
	public FuncionarioPOATie(FuncionarioOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public DSD.T1.Entity.Funcionario _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		DSD.T1.Entity.Funcionario __r = DSD.T1.Entity.FuncionarioHelper.narrow(__o);
		return __r;
	}
	public DSD.T1.Entity.Funcionario _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		DSD.T1.Entity.Funcionario __r = DSD.T1.Entity.FuncionarioHelper.narrow(__o);
		return __r;
	}
	public FuncionarioOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(FuncionarioOperations delegate)
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
	public int quantidadeVendas()
	{
		return _delegate.quantidadeVendas();
	}

	public void ctps(java.lang.String a)
	{
		_delegate.ctps(a);
	}

	public void departamento(int a)
	{
		_delegate.departamento(a);
	}

	public java.lang.String ctps()
	{
		return _delegate.ctps();
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

	public java.lang.String endereco()
	{
		return _delegate.endereco();
	}

	public void cpf(java.lang.String a)
	{
		_delegate.cpf(a);
	}

	public void quantidadeVendas(int a)
	{
		_delegate.quantidadeVendas(a);
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
