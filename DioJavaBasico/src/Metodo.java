/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



public class Metodo {
    public static void main(String[] args) {
        
        String primeiroNome = "Marcelo";
        String segundoNome = "oliveira";
        
        String nomeCompleto =  nomeCompleto (primeiroNome, segundoNome);
        
        System.out.println(nomeCompleto);
        
    }
    
    public static  String  nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
    
}
