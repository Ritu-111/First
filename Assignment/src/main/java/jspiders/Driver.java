package jspiders;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prasad");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		TrainingInstitute ti=new TrainingInstitute();
		ti.setId(1);
		ti.setName("Star Institute");
		
		Branch b=new Branch();
		b.setId(1);
		b.setBname("Deccan");
		b.setPincode(413512);
		
		Branch b1=new Branch();
		b1.setId(2);
		b1.setBname("Hadpsar");
		b1.setPincode(513512);
		
	 	Branch b2=new Branch();
		b2.setId(3);
		b2.setBname("wakad");
		b2.setPincode(963512);
		
		Branch b4=new Branch();
		b4.setId(4);
		b4.setBname("Swargate");
		b4.setPincode(160021);
		
		Branch b5=new Branch();
		b5.setId(5);
		b5.setBname("shivaji nagar");
		b5.setPincode(312516);
		
		List <Branch> branches=new ArrayList<Branch>();
		branches.add(b);
		branches.add(b1);
		branches.add(b2);
		branches.add(b4);
		branches.add(b5);
		
		
		ti.setBranches(branches);
		
		
		Admission a=new Admission ();
		a.setId(1);
		a.setRegNo(1600);
		
		Admission a1=new Admission ();
		a1.setId(2);
		a1.setRegNo(1700);
		
		Admission a2=new Admission ();
		a2.setId(3);
		a2.setRegNo(1800);
		
		Admission a3=new Admission ();
		a3.setId(4);
		a3.setRegNo(1900);
		
		Admission a4=new Admission ();
		a4.setId(5);
		a4.setRegNo(2000);
		
		Admission a5=new Admission ();
		a5.setId(6);
		a5.setRegNo(2100);
		
		Admission a6=new Admission ();
		a6.setId(7);
		a6.setRegNo(2200);
		
		
		
		List<Admission> admissions=new ArrayList<Admission>();
		admissions.add(a);
		admissions.add(a1);
		admissions.add(a2);
		admissions.add(a3);
		admissions.add(a4);
		admissions.add(a5);
		admissions.add(a6);
		
		b.setAdmission(admissions);
		
		Student s=new Student();
		s.setId(1);
		s.setName("prasad");
		s.setYop(2022);
		
		Student s1=new Student();
		s1.setId(2);
		s1.setName("Ganesh");
		s1.setYop(2023);
		
		Student s2=new Student();
		s2.setId(3);
		s2.setName("Disha");
		s2.setYop(2021);
		
		Student s3=new Student();
		s3.setId(4);
		s3.setName("Priya");
		s3.setYop(2022);
		
		Student s4=new Student();
		s4.setId(5);
		s4.setName("Sneha");
		s4.setYop(2021);
		
		Student s5=new Student();
		s5.setId(6);
		s5.setName("Devesh");
		s5.setYop(2020);
		
		Student s6=new Student();
		s6.setId(7);
		s6.setName("Divya");
		s6.setYop(2022);
		
		
		
		a.setS(s);
		a1.setS(s1);
		a2.setS(s2);
		a3.setS(s3);
		a4.setS(s4);
		a5.setS(s5);
		a6.setS(s6);
		
		
		Cource c=new Cource();
		c.setId(1);
		c.setCname("python");
		c.setFees(10000);
		
		Cource c1=new Cource();
		c1.setId(2);
		c1.setCname(".net");
		c1.setFees(12000);
		
		Cource c2=new Cource();
		c2.setId(3);
		c2.setCname("devops");
		c2.setFees(13000);
		
		Cource c3=new Cource();
		c3.setId(4);
		c3.setCname("Java");
		c3.setFees(11000);
		
		Cource c4=new Cource();
		c4.setId(5);
		c4.setCname("HTML");
		c4.setFees(8000);
		
		
		List <Cource> cources=new ArrayList<Cource>();
		cources.add(c);
		cources.add(c1);
		cources.add(c2);
		cources.add(c3);
		cources.add(c4);
			
		 s.setCources(cources);
		s1.setCources(cources);
		s2.setCources(cources);
		s3.setCources(cources);
		s4.setCources(cources);
		s5.setCources(cources);
		s6.setCources(cources);
		
		/*List <Cource> cources1=new ArrayList<Cource>();
		cources1.add(c);
		cources1.add(c1);
		cources1.add(c2);
		cources1.add(c3);
		cources1.add(c4);*/
		
		b.setCources(cources);
		
		
		
		
		Trainer t=new Trainer();
		t.setId(1);
		t.setName("Sumanth Chinnivar");
		t.setSubject("Core java");
		
		Trainer t1=new Trainer();
		t1.setId(2);
		t1.setName("Ravi Teja");
		t1.setSubject("SQL");
		
		Trainer t2=new Trainer();
		t2.setId(3);
		t2.setName("Vara Prasad");
		t2.setSubject("J2Ee");
		
		List<Trainer> trainers=new ArrayList<Trainer>();
		trainers.add(t);
		trainers.add(t1);
		trainers.add(t2);
		
		b.setTrainers(trainers);
		
		
		et.begin();
		em.persist(ti);
		
		em.persist(b);
		em.persist(b1);
		em.persist(b2);
		em.persist(b4);
		em.persist(b5);
		
		em.persist(a);
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		em.persist(a4);
		em.persist(a5);
		em.persist(a6);
		
		
		em.persist(s);
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(s4);
		em.persist(s5);
		em.persist(s6);
		
		
		em.persist(c);
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		em.persist(c4);
		
		
		
		em.persist(t);
		em.persist(t1);
		em.persist(t2);
		
		et.commit();
		
	}
}
