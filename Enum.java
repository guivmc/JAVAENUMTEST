package br.kasolution.constants;

public enum StatusTransacao 
{
	SUCESSO("Sucesso!"),
	VALOR_INCORRETO("Valor informado incorreto."),
	SALDO_INSUFICIENTE("Não há saldo"),
	DATA_MATURIDADE_MENOR("Maturidade não atingida");
	
	private String info;
	
	private StatusTransacao(String info) 
	{
		this.setInfo(info);
	}

	public String getInfo() 
	{
		return info;
	}

	public void setInfo(String info) 
	{
		this.info = info;
	}
	
	
}
