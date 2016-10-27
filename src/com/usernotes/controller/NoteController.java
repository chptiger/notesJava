package com.usernotes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.usernotes.entities.Note;
import com.usernotes.service.NoteService;

@RestController
@Scope("prototype")
public class NoteController {
	
	@Autowired
	NoteService noteService;
	
	@ResponseBody
	@RequestMapping(value = "/notes", method = RequestMethod.GET)
	public ResponseEntity<List<Note>> getNotess() {
		List<Note> listOfNotes = noteService.getAllNotes();
		if(listOfNotes.isEmpty()){  
            return new ResponseEntity<List<Note>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND  
        }  
        return new ResponseEntity<List<Note>>(listOfNotes, HttpStatus.OK);  
	}
	
	@ResponseBody
	@RequestMapping(value = "/notes/{id}", method = RequestMethod.GET)
	public ResponseEntity<Note> getNoteById(@PathVariable("id") Integer id) {
		Note note= noteService.getNote(id);
//		System.out.println( note );
		 if (note == null) {  
	            System.out.println("Note with id " + id + " not found");  
	            return new ResponseEntity<Note>(HttpStatus.NOT_FOUND);  
	        } 
		return new ResponseEntity<Note>(note, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/notes/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Note> deleteNote(@PathVariable("id") int id) {
		Note note = noteService.getNote(id); 
		  if (note == null) {  
	            System.out.println("Unable to delete. User with id " + id + " not found");  
	            return new ResponseEntity<Note>(HttpStatus.NOT_FOUND);  
	        }
		noteService.deleteNote(id);	
		return new ResponseEntity<Note>(HttpStatus.NO_CONTENT);  
	}	
	
}
