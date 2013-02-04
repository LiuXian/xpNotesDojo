package com.example.xpnotesdojo.dao;

import java.util.List;

import com.example.xpnotesdojo.entity.Note;
import com.google.inject.Singleton;

@Singleton
public class NoteDao extends BaseHibernateDao<Note> {
	
	@SuppressWarnings("unchecked")
	public List<Note> list(int user_id, int topic_id) {
		String query = "from Note where user_id = " + user_id + "and topic_id = " + topic_id;
		List<Note> noteList = (List<Note>) daoHelper.find(0, 1000, query);
		return noteList;
	}
 
}
