
package Telas;

import dao.Criar_BD;


public class Main {
    public static void main(String[] args) {
       Criar_BD BD = new Criar_BD();
       BD.criarBD();
       
       Tela_login Login = new Tela_login();
        
    }
}
