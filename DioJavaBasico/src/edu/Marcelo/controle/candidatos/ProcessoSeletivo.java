
package edu.Marcelo.controle.candidatos;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    public static void main(String[] args) {
        
     String [] candidatos = {"MARCELO", "JOAO", "MIGUEL", "CAIO", "VICTOR", "MONICA", "JOSE"};
     for (String candidato: candidatos){
         entrandoEmContato(candidato);
         
         
     }
    }
    
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu= false;
        
        do {
            atendeu= atender();
            continuaTentando = !atendeu;
            if(continuaTentando)
               tentativasRealizadas++;
            else
                 System.out.println("CONTATO REALIZADO COM SUCESSO");
           
            
        }while(continuaTentando && tentativasRealizadas  < 3);
        
        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVAS");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +  ", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADAS");
    }
    
    //Método auxiliar
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
    
    static void imprimirSelecionados(){
        String [] candidatos = {"MARCELO", "JOAO", "MIGUEL", "CAIO", "VICTOR", "MONICA", "JOSE"};
        System.out.println("IMPRIMIMDO A LISTA DE CANDIDATOS INFORMANDO O INDECE DO ELEMENTO");
        
        for(int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O canditado do N° " + (indice+1) +  " é " + candidatos[indice]);
        }
            
    }
    
    static void selecaoCandidatos(){
        String [] candidatos = {"MARCELO", "JOAO", "MIGUEL", "CAIO", "VICTOR", "MONICA", "JOSE", "PAULO","RONALDO"};
        
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salrioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String cadidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            
            System.out.println("O candidato " + cadidato + " solicitou este valor de salario " + salarioPretendido);
            if (salrioBase >= salarioPretendido){
                System.out.println("O candidato " + cadidato + "foi selecionado para a vaga " + salarioPretendido);
                candidatosSelecionados ++;
            }
            candidatoAtual++;
        }
    }
    
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    
    static void analisarCanditato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
             System.out.println("LIGAR PARA O CANDIDATO");
             
        }else if(salarioBase ==salarioPretendido)
             System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        
        else {
              System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
           
        
        
    }
    
}
