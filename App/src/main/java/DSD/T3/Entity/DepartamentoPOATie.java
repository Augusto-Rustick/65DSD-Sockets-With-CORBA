package DSD.T1.Entity;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Departamento".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 29 de jun de 2023 00:06:19
 */

public class DepartamentoPOATie
	extends DepartamentoPOA
{
	private DepartamentoOperations _delegate;

	private POA _poa;
	public DepartamentoPOATie(DepartamentoOperations delegate)
	{
		_delegate = delegate;
	}
	public DepartamentoPOATie(DepartamentoOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
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
	public DepartamentoOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(DepartamentoOperations delegate)
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
	public void setProduto(java.lang.String produto)
	{
_delegate.setProduto(produto);
	}

	public void setQuantidadeEstoque(int quantidadeEstoque)
	{
_delegate.setQuantidadeEstoque(quantidadeEstoque);
	}

	public java.lang.String getNome()
	{
		return _delegate.getNome();
	}

	public int getQuantidadeEstoque()
	{
		return _delegate.getQuantidadeEstoque();
	}

	public java.lang.String getProduto()
	{
		return _delegate.getProduto();
	}

}
