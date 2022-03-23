
package br.ulbra.classe;

import javax.swing.JOptionPane;

public class Aluno {
    
    private String nome;
    private double notas[];
    
    
    public Aluno (){
       
        notas = new double [3];
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas(int i) {
        return notas[i];
    }

    public void setNotas(double notas, int i) {
        this.notas[i] = notas;
    }
    public int getSize(){
        return notas.length;
    }       
    public double calcularMedia(){
        
        double acumulador=0;
        int i;
        for ( i=0; i<getSize(); i++){
            acumulador= acumulador + notas [i];
        }
        acumulador = acumulador / i;
        return acumulador;
    }
    public String toString(){
        String resposta = "B O L E T I M \n";
        
        resposta += "--------------------\n" +
        "Nome: " + getNome();
        
        String resp1 = "";
        
        for (int i = 0; i<getSize(); i++){
            resp1 += "\nNota" + (i+1) + ": " +
            getNotas(i);
        }
        resposta += resp1 + "\n--------------------\n" + "Média: " + calcularMedia();
        
        return resposta;
    }
    public static void main (String[] args){
        Aluno a= new Aluno();
        a.setNome("Nome");
        a.setNotas (2,0);
        a.setNotas (2,1);
        a.setNotas (2,2);
        JOptionPane.showMessageDialog(null, a.toString());
    }
}

