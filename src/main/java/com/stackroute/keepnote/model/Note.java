package com.stackroute.keepnote.model;

import java.time.LocalDateTime;

/*
 * The class "Note" will be acting as the data model for the Note data in the ArrayList.
 */
public class Note {

	/*
	 * This class should have five fields (noteId, noteTitle, noteContent,
	 * noteStatus and createdAt). This class should also contain the getters and
	 * setters for the fields. The value of createdAt should not be accepted from
	 * the user but should be always initialized with the system date
	 */

	public Note() {
	}

	/* All the getters/setters definition should be implemented here */

	public int getNoteId() {
		return 0;

	}

	public void setNoteId(int intid) {

	}

	public String getNoteTitle() {
		return null;
	}

	public void setNoteTitle(String string) {

	}

	public String getNoteContent() {
		return null;
	}

	public void setNoteContent(String string) {

	}

	public String getNoteStatus() {
		return null;
	}

	public void setNoteStatus(String string) {

	}

	public LocalDateTime getCreatedAt() {
		return null;
	}

	public void setCreatedAt(LocalDateTime localdatetime) {

	}

	/* Override the toString() method */

	@Override
	public String toString() {
		return null;
	}
}