package view;

import org.hibernate.Session;

import controller.HibernateUtil;
import model.Alunos;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alunos alunos = new Alunos();
		alunos.setNome("lil raff bro");
		alunos.setEndereco("Guarulhos");
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(alunos);
		session.getTransaction().commit();
	}

}
