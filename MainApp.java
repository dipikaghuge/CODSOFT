package com.dipika.basic.presentation;

import java.util.Scanner;

public class MainApp 
{
	public static void main(String args[])
	{
      Scanner sc=new Scanner(System.in);
      Integer ch=0;
      App app=new AppImpl();
      
      while(ch!=6)
      {
    	  System.out.println("_____________________");
    	  System.out.println("Student Information");
    	  System.out.println("_____________________");
    	  System.out.println("1.Add Record");
    	  System.out.println("2.Update Record");
    	  System.out.println("3.Delete Record");
    	  System.out.println("4.Find Record");
    	  System.out.println("5.FindAll Record");
          System.out.println("6.Exit");
          System.out.println("Enter your choice:");
          ch=sc.nextInt();
          switch(ch)
          {
          case 1:
        	  app.addRecord();
        	  break;
          case 2:
        	  app.updateRecord();
        	  break;
          case 3:
        	  app.deleteRecord();
        	  break;
          case 4:
        	  app.findRecord();
        	  break;
          case 5:
        	  app.findAllRecord();
        	  break;
          case 6:
        	  System.exit(0);
        	  break;
          default:
        	  System.out.println("Please Enter correct choice:");
        	  break;
         
          }

      }
      
	}

}
