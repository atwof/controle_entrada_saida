package com.alisson.boate;

import javax.swing.JOptionPane;

public class MainBoate{
	public static void main(String[] args) {
        
        SistemaBoate b = new SistemaBoate();
                
        String menu = "1 - Entrar ELE" +
                      "\n2 - Entrar ELA" +
                      "\n3 - Sair boate" +
                      "\n4 - Lotação atual" +
                      "\n5 - Caixa" +
                      "\n6- Sair";
                      
        String saida = "1 - Ele" +
                      "\n2 - Ela" +
                      "\n3 - Voltar";
        
        int op = 0;
        
        while(op != 6){
        
        	op = Entrada.leiaInt(menu);
        
            if(op == 1){
            	if(b.getLotacao() == 200) {
                   	JOptionPane.showMessageDialog(null, "Lotação máxima");
            	}else {
                	b.setEntradaEle();
            	}
            }else if(op == 2){
            	if(b.getLotacao() == 200) {
                   	JOptionPane.showMessageDialog(null, "Lotação máxima");
            	}else {
                    b.setEntradaEla();
            	}
            }else if(op == 3){
                int x = 0;
                while(x != 3){
                    x = Entrada.leiaInt(saida);
                    if(x == 1){
                       b.setSaidaBoate(1);
                       if(b.getEntradaEle() == 0) {
                       	JOptionPane.showMessageDialog(null, "Lotação mínima Eles");
                       }
                    }else if(x == 2){
                        b.setSaidaBoate(2);
                        if(b.getEntradaEla() == 0) {
                        	JOptionPane.showMessageDialog(null, "Lotação mínima Elas");
                        }
                    }
                }
            }else if(op == 4){
            	JOptionPane.showMessageDialog(null, "Lotação total atual: " + b.getLotacao() + 
						                	  "\nEles: " + b.getEntradaEle()+
						                	  "\nElas: " + b.getEntradaEla());
            }else if(op == 5){
            	JOptionPane.showMessageDialog(null, "Caixa: " + b.getValorTotal());
            }
        }
        System.exit(1);
    }
        
}