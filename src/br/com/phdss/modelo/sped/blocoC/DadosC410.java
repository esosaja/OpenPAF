package br.com.phdss.modelo.sped.blocoC;

import br.com.phdss.modelo.sped.Bean;

public class DadosC410 extends Bean {

    private double vl_pis;
    private double vl_cofins;

    public DadosC410() {
        super("C410");
    }

    public double getVl_cofins() {
        return vl_cofins;
    }

    public void setVl_cofins(double vl_cofins) {
        this.vl_cofins = vl_cofins;
    }

    public double getVl_pis() {
        return vl_pis;
    }

    public void setVl_pis(double vl_pis) {
        this.vl_pis = vl_pis;
    }
}
