package jspiders;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prasad");
		EntityManager em=emf.createEntityManager();
		
		System.out.println("***Welcome to Star Institute***");
		
		TrainingInstitute ti=em.find(TrainingInstitute.class, 1);
		System.out.println("The id of Institute is: "+ti.getId());
		System.out.println("Name of Intitute is: "+ti.getName());
		
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1 to get details about branches;");
		System.out.println("Enter 2 to get details about Admissions;");
		System.out.println("Enter 3 to get details about student;");
		System.out.println("Enter 4 to get details about Cources;");
		System.out.println("Enter 5 to get details about Trainer;");
		System.out.println("Plese Enter your Choice:");
		
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:{
			List<Branch> branches=ti.getBranches();
			for(Branch b:branches) {
				System.out.println(b.getId());
				System.out.println(b.getBname());
				System.out.println(b.getPincode());
			}
			
			}
		break;
		case 2:{
			System.out.println("Plese Enter admission id no:");
			int id=sc.nextInt();
			Admission a=em.find(Admission.class, id);
			System.out.println("Admission id is- "+a.getId());
			System.out.println("Admission regno is- "+a.getRegNo());
			break;
			
		}
		case 3:{
			System.out.println("Plese Enter Student id no:");
			int id=sc.nextInt();
			Student s=em.find(Student.class, id);
			System.out.println("Student id is-"+s.getId());
			System.out.println("Student name is-"+s.getName());
			System.out.println("Student yop is-"+s.getYop());
			break;
		}
		case 4:{
		
			Branch b=em.find(Branch.class,413512 );
			
			List<Cource> cources=b.getCources();
			for(Cource c:cources) {
				System.out.println("Cource id is id is: "+c.getId());
				System.out.println("Cource name is id is: "+c.getCname());
				System.out.println("Cource fees is id is: "+c.getFees());
				System.out.println();
			}
			break;
			}
		case 5:{
			
			Branch b=em.find(Branch.class,413512);
		
			List<Trainer> trainers=b.getTrainers();
			for(Trainer t:trainers) {
				System.out.println("Trainer id is: "+t.getId());
				System.out.println("Trainer name is: "+t.getName());
				System.out.println("Trainer subject is: "+t.getSubject());
				System.out.println();
			}
			break;			
		}			
		}
		
		}
		

	}


