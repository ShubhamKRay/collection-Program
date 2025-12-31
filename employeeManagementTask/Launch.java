package collectionFrameWork.employeeManagementTask;

import java.util.*;
//Employee Management System
public class Launch {         
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1
		while(true) {
			System.out.println("P1->Insert\nP2->Read\nP3->Update\nP4->Delete\nP5->Exit");
			System.out.println("Enter choice : ");
			int choice = sc.nextInt();
			if(choice==5)
			{
				System.out.println("Thanks for using");
				break;
			}
			switch (choice) {
			
			case 1 :
				
				//2
				while(true) {
				System.out.println("Enter Eid : ");
				int eid = sc.nextInt();
				
				System.out.println("Enter Ename : ");
				String ename = sc.next();
				
				System.out.println("Enter Eaddress : ");
				String eaddress = sc.next();
				
				System.out.println("Enter Esalary : ");
				int esalary = sc.nextInt();
				
				//2
				ArrayList<String> listofbook = new ArrayList<String>(); //List Of Book
				ArrayList<String> listofcontact = new ArrayList<String>(); //List of Contact
				
				int i = 1;
				while(true) {
					
					
					System.out.println("Enter Book"+i+" Name");
					i++;
					String bookname = sc.next();
					listofbook.add(bookname);
					
					System.out.println("Do you want to Add Book Again(Yes/No");
					
				    char x = sc.next().charAt(0);
				    if(x=='N')
				    break;
					} 
				}
				
				int i = 1;
				while(true) {
					
					System.out.println("Enter ContactNo"+i);
					i++;
					String contact = sc.next();
					listofcontact.add(contact);
					
					System.out.println("Do you want to Add Book Again(Yes/No");
					
				    char x = sc.next().charAt(0);
				    if(x=='N')
				    break;
					} 
				}
				
			System.out.println("Do you want to Add Book Again(Yes/No");
			    char x = sc.next().charAt(0);
			    if(x=='N')
			    break;
				    
			case 2 :
			    break;
				
			case 3 : 
				break;
				
			case 4 :
			    break;
			
			default :
				break;
			}
		}

	}


