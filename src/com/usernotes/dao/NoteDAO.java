package com.usernotes.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.usernotes.entities.Note;

@Repository
public class NoteDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	public List<Note> getAllNotes() {
		
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Note").list();
	}

	public Note getNote(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Note note = (Note) session.load(Note.class, new Integer(id));
		return note;
	}

	public void deleteNote(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Note p = (Note) session.load(Note.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
	}	
	
	public Note addNote(Note note) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(note);
		return note;
	}

	public void updateNote(Note note) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(note);
	}
}
