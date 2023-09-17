
package edu.Marcelo.repeteticoes;

public class ExemploForArray {
    
    public static void main(String[] args) {
        
        String alunos [] = {"Marcelo", "Jonas", "Julia", "Marcos"};
        
        for(int x = 0; x < alunos.length; x++){
            System.out.println("O aluno com índice " + x + "  " + alunos[x]);
        }
    }
    
}
