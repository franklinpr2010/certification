package br.certification.operators.oo.abstractlesson;



public class MasterProduct extends Product {

	private boolean isAvailableForLease;

	@Override
	public boolean isAvailableInStock() {
		return getRemainingAmountInStock() > 0;
	}
}
