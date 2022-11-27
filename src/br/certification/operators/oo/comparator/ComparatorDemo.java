package br.certification.operators.oo.comparator;


import java.util.Comparator;

public class ComparatorDemo implements Comparator<Conta>  {

	@Override
	public int compare(Conta conta, Conta outraConta) {
        return conta.getTitular().
                compareTo(outraConta.getTitular());
    }
	


}
