package com.stackroute.keepnote.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.stereotype.Repository;

import com.stackroute.keepnote.model.Note;

/*
 * This class contains the code for data storage interactions and methods 
 * of this class will be used by other parts of the applications such
 * as Controllers and Test Cases
 * */
@Repository
public class NoteRepository {

	/* Declare a variable called "list" to store all the notes. */
	List<Note> notes = null;

	public NoteRepository() {
		/* Initialize the variable using proper data type */
		notes = new ArrayList<>();
	}

	/* This method should return all the notes in the list */
	public List<Note> getList() {
		return this.notes;
	}

	/* This method should set the list variable with new list of notes */
	public void setList(List<Note> list) {
		this.notes = list;
	}

	/*
	 * This method should Note object as argument and add the new note object into
	 * list
	 */
	public void addNote(Note note) {
		getList().add(note);
	}

	/* This method should deleted a specified note from the list */
	public boolean deleteNote(int noteId) {
		/* Use list iterator to find matching note id and remove it from the list */
		ListIterator<Note> iterator = this.notes.listIterator();
		Boolean isRemoved = Boolean.FALSE;
		while (iterator.hasNext()) {
			if (noteId == iterator.next().getNoteId()) {
				iterator.remove();
				isRemoved = Boolean.TRUE;
			}
		}
		return isRemoved;
	}

	/* This method should return the list of notes */

	public List<Note> getAllNotes() {
		return this.getList();
	}

	/*
	 * This method should check if the matching note id present in the list or not.
	 * Return true if note id exists in the list or return false if note id does not
	 * exists in the list
	 */

	public boolean exists(int noteId) {
		return this.notes.stream().filter(note -> note.getNoteId() == noteId).findAny().isPresent();
	}
}