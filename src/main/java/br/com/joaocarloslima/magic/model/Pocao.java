package br.com.joaocarloslima.magic.model;

import java.util.ArrayList;
import java.util.List;

public class Pocao {
    private int potencia = 0;
    private int estabilidade = 100;
    private boolean cheiroRuim = false;
    private boolean efeitoMagico = false;
    private boolean causaSono = false;

    List<Misturavel> ingredienteUsados = new ArrayList<>();

    public void misturar(Misturavel ingrediente){
        ingrediente.misturar(this);
        ingredienteUsados.add(ingrediente);
    }

    

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getEstabilidade() {
        return estabilidade;
    }

    public void setEstabilidade(int estabilidade) {
        this.estabilidade = estabilidade;
    }

    public boolean isCheiroRuim() {
        return cheiroRuim;
    }

    public void setCheiroRuim(boolean cheiroRuim) {
        this.cheiroRuim = cheiroRuim;
    }

    public boolean isCausaSono() {
        return causaSono;
    }

    public void setCausaSono(boolean causaSono) {
        this.causaSono = causaSono;
    }

    public List<Misturavel> getIngredienteUsados() {
        return ingredienteUsados;
    }

    public void setIngredienteUsados(List<Misturavel> ingredienteUsados) {
        this.ingredienteUsados = ingredienteUsados;
    }



    public boolean isEfeitoMagico() {
        return efeitoMagico;
    }



    public void setEfeitoMagico(boolean efeitoMagico) {
        this.efeitoMagico = efeitoMagico;
    }

    
}
