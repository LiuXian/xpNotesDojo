package com.example.xpnotesdojo.dao;

import java.util.List;

import com.example.xpnotesdojo.entity.Topic;
import com.google.inject.Singleton;

@Singleton
public class TopicDao extends BaseHibernateDao<Topic> {
	
	@SuppressWarnings("unchecked")
	public List<Topic> list(int user_id) {
		String query = "from Topic where user_id = " + user_id;
		List<Topic> topicList = (List<Topic>) daoHelper.find(0, 1000, query);
		return topicList;
	}
	
	public void remove(Long topic_id) {
		daoHelper.executeHql("delete Note where topic_id = ?", topic_id);
		daoHelper.delete(Topic.class, topic_id);
	}

}
