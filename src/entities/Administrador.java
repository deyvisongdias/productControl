package entities;

import java.util.Scanner;

public class Administrador {
	
	  Scanner sc=new Scanner(System.in);
	  
	  private String nome;
      private String login="adm";
      private String senha="123";
      
      public Administrador()
      {
    	  System.out.println("Digite o seu nome :");
    	  String name=sc.next();
    	  System.out.println("Digite o login de adminstrador :");
    	  String lg=sc.next();
    	  System.out.println("Digite a senha  de adminstrador :");
    	  String sn=sc.next();
    	  if(lg==login && sn==senha)
    	  {
    		  System.out.println("Bem vindo ,"+name);
    	  }
    	  else
    	  {
    		  System.out.println("LOGIN OU SENHA INCORRETOS,tentar novamente ?");
    		  System.out.println("sim(1) nao(2)" );
    		  int  resposta=sc.nextInt();
    		  if(resposta==1)
    		  {
    			  Administrador adm=new Administrador();
    		  }
    		  else
    		  {
    			  System.out.println("systema fechado !!!");
    		  }
    	  }
      }
      
      
	
	

}
