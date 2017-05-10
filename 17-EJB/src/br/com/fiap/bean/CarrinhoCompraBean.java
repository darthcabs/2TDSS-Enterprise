package br.com.fiap.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.fiap.bo.CarrinhoCompraBO;

@ManagedBean
@SessionScoped
public class CarrinhoCompraBean {
	private double bitcoin;
	private double totalBitcoin;
	
	@EJB
	private CarrinhoCompraBO bo;
	
	public void depositar(){
		totalBitcoin = bo.adicionarBitCoin(bitcoin);
	}

	public double getBitcoin() {
		return bitcoin;
	}

	public void setBitcoin(double bitcoin) {
		this.bitcoin = bitcoin;
	}

	public double getTotalBitcoin() {
		return totalBitcoin;
	}

	public void setTotalBitcoin(double totalBitcoin) {
		this.totalBitcoin = totalBitcoin;
	}
}