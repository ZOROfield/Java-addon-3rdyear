package Demo;

import java.util.*;
import java.io.*;

public class Students {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub

        Scanner in = new Scanner(System.in);
			ArrayList<String> names = new ArrayList<>();
			HashMap<String, ArrayList<String>> Courses = new HashMap<>();

		while (true) {
			  
		    int choice = in.nextInt();
		    in.nextLine(); // clear buffer

	    if (choice == 1) {
		        System.out.print("Enter student name: ");
		        String name = in.nextLine();
		        names.add(name);

		        System.out.print("Enter student ID: ");
		        int id = in.nextInt();

		        ArrayList<String> courses = new ArrayList<>();
		        while(true) {
		            System.out.print("Enter course ...!!! ");
		            String course = in.nextLine();
		            if (course.equals(course)) break;
		            courses.add(course);
		    }

		        Courses.clear();
		        System.out.println("Student added.....");

			    } else if (choice == 2) {
			        System.out.print("Enter student ID to search: ");
			        String id = in.nextLine();
		        if (Courses.containsKey(id)) {
		            System.out.println("Courses: " + Courses.get(id));
		        } else {
			            System.out.println("Student not found.");
		        }

		    } else if (choice == 3) {
			    System.out.print("Enter student ID to delete: ");
		        String id = in.nextLine();
		        if (Courses.remove(id) != null) {
		            System.out.println("Student deleted.");
		        } else {
		            System.out.println("Student not found.");
		        }

		    }else if(choice==4){   
	        try {
    	            BufferedWriter fr = new BufferedWriter(new FileWriter("op.txt"));
		            for (String id1 : Courses.keySet()) {
	                fr.write("ID: " + id1 + " -> " + Courses.get(id1) + "\n");
	              
		            }
	            fr.close();
	            System.out.println("saved");  
	            
	       } catch (IOException e) {
		            System.out.println("wrong"+e);
	       }        
		 }       
	    	in.close();
		}	    
	}	
 } 
    