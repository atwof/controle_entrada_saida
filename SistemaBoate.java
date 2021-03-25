package com.alisson.boate;

public class SistemaBoate {

	//capacidade máxim 200 pessoas
	//elas = 40,00
	//eles = 55,00
	
	private int entradaEle;
    private int entradaEla;
    private int valorEle;
    private int valorEla;

    public SistemaBoate(){
        this.entradaEle = 0;
        this.entradaEla = 0;
        this.valorEle = 0;
        this.valorEla = 0;
    }
    
    public void setEntradaEle(){
    	if(getEntradaEle() >= 200) {
    		 this.entradaEle = 200;
    	}else {
	        this.entradaEle += 1;
	        this.valorEle += 55;
    	}
    }
    
    public void setEntradaEla(){
    	if(getEntradaEla() >= 200) {
    		this.entradaEla = 200;
    	}else {
    		this.entradaEla += 1;
            this.valorEla += 40;
    	}
    }
    
    public void setSaidaBoate(int x){
        if(x == 1 && this.entradaEle > 0){
            this.entradaEle -= 1;
        }else if(this.entradaEle < 0){
            this.entradaEle = 0;
        }else if(x == 2 && this.entradaEla > 0){
            this.entradaEla -= 1;
        }else if(this.entradaEla < 0){
            this.entradaEla = 0;
        }
    }
    
     public int getEntradaEle(){
        return entradaEle;
    }
    
    public int getEntradaEla(){
        return entradaEla;
    } 
    
    public int getValorEle(){
        return valorEle;
    } 
    
    public int getValorEla(){
        return valorEla;
    } 
    
    public int getLotacao(){
		return getEntradaEla() + getEntradaEle();
    }
    
    public double getValorTotal(){
        return getValorEla() + getValorEle();
    }
}