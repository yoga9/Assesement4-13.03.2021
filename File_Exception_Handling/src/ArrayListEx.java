import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
               
	            public static void main(String args[]) {
				
				ArrayList<String>  EmpName = new ArrayList<String>();            //List 1
				EmpName.add("Yoga");
				EmpName.add("Karnan");
				EmpName.add("Luxmi");
				EmpName.add("Pavi");
				EmpName.add("Hari");
				
				ArrayList<Integer>  EmpId= new ArrayList<Integer>();              //List 2
				EmpId.add(1);
				EmpId.add(2);
				EmpId.add(3);	
				EmpId.add(4);	
				EmpId.add(5);	
				
				Iterator<String> name = EmpName.iterator();
				while(name.hasNext()) {
					System.out.println("Emp Name: " +name.next());
				}
		System.out.println();		
				
				Iterator<Integer> id = EmpId.iterator();
				while(id.hasNext()) {
					System.out.println("Emp Id: " +id.next());
				}
				
		System.out.println();		
		        
		       System.out.println("New updates");                                    //Replace
		       
		       EmpName.set(4,"Haritha");
		       System.out.println(EmpName);
		       
		       EmpId.set(4,8);
		       System.out.println(EmpId);
		       
		 System.out.println(); 
		 
		       System.out.println("Find the index of 3rd Employee ID: " +EmpId.get(2));           //Find
		       
		       System.out.println("New List creation");
		       
		       ArrayList<Object> Info = new ArrayList<Object>();                                    //List 3
		       Info.addAll(EmpName);
		       Info.addAll(EmpId);
		       
		       System.out.println(Info);
		       
		       Info.removeAll(EmpId);                                                //Remove
		       System.out.println(Info); 
		       
		       ArrayList<Integer>  EmpId1= new ArrayList<Integer>();                    //New EmployeeID generate
				EmpId1.add(001);
				EmpId1.add(002);
				EmpId1.add(003);	
				EmpId1.add(004);	
				EmpId1.add(005);
				
				Iterator<Integer> id1= EmpId.iterator();
				while(id1.hasNext()) {
					System.out.println("Emp Id: " +id1.next());
				}
		       
				Info.addAll(EmpId1);                        //Insert
				System.out.println(Info);
			}
			
		}


