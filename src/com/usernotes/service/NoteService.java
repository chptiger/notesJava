package com.usernotes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.usernotes.dao.NoteDAO;
import com.usernotes.entities.Note;

@Service("noteService")
public class NoteService {

	@Autowired
	NoteDAO noteDao;
	
	@Transactional
	public List<Note> getAllNotes() {
		return noteDao.getAllNotes();
	}

	@Transactional
	public Note getNote(int id) {
		return noteDao.getNote(id);
	}

	@Transactional
	public void deleteNote(int id) {
		noteDao.deleteNote(id);
	}
	
	@Transactional
	public void addNote(Note note) {
		noteDao.addNote(note);
	}

	@Transactional
	public void updateNote(Note note) {
		noteDao.updateNote(note);

	}
}

