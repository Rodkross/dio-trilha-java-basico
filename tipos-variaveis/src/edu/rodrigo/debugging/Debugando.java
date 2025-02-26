package edu.rodrigo.debugging;

public class Debugando {
    public static void main(String[] args) {
        System.out.println("Iniciou o programa");
        a();
        System.out.println("Acabou o programa");
    }
    
    static void a(){
        System.out.println("Entrou na funcao A");
        b();
        System.out.println("Acabou a funcao A");
    }

    static void b(){
        System.out.println("Entrou na funcao B");
        for(int i = 0; i <=4; i++) System.out.println(i);
        c();
        System.out.println("Acabou a funcao B");        
    }

    static void c(){
        System.out.println("Entrou na funcao C");
        Thread.dumpStack();
        System.out.println("Acabou a funcao C");        
    }
    
}
