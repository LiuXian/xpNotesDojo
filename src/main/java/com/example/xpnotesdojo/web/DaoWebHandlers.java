package com.example.xpnotesdojo.web;


import java.util.List;
import java.util.Map;

import javax.inject.Singleton;

import com.britesnow.snow.util.JsonUtil;
import com.britesnow.snow.util.ObjectUtil;
import com.britesnow.snow.web.RequestContext;
import com.britesnow.snow.web.param.annotation.WebParam;
import com.britesnow.snow.web.rest.annotation.WebGet;
import com.britesnow.snow.web.rest.annotation.WebPost;
import com.example.xpnotesdojo.dao.DaoRegistry;
import com.example.xpnotesdojo.dao.IDao;
import com.example.xpnotesdojo.dao.NoteDao;
import com.example.xpnotesdojo.dao.TopicDao;
import com.example.xpnotesdojo.entity.Note;
import com.example.xpnotesdojo.entity.Topic;
import com.google.inject.Inject;

@SuppressWarnings({"unchecked","rawtypes"})
@Singleton
public class DaoWebHandlers {

	@Inject
	private NoteDao noteDao;
	
	@Inject
	private TopicDao topicDao;
	
    @Inject
    private DaoRegistry daoRegistry;
    
	@WebPost("/daoSave")
    public Object daoSave(@WebParam("objType") String objType, @WebParam("obj_id") Long id,
                            @WebParam("objJson") String jsonObj) {
        Map jsonMap = JsonUtil.toMapAndList(jsonObj);
        IDao dao = daoRegistry.getDao(objType);
        Object object = daoRegistry.getEntityInstance(objType);
        ObjectUtil.populate(object, jsonMap);
        return dao.save(object);
    }
    
    @WebPost("/daoDelete")
    public void daoDelete(@WebParam("objType") String objType, @WebParam("obj_id") String obj_id) {
    	IDao dao = daoRegistry.getDao(objType);
    	System.out.println("remove" + objType);
    	dao.remove(Long.parseLong(obj_id));
    }
    
	@WebGet("/daoGet")
    public Object daoGet(@WebParam("objType") String objType, @WebParam("obj_id") String obj_id) {
    	IDao dao = daoRegistry.getDao(objType);
		return dao.get(Long.parseLong(obj_id));
    }
    
    @WebPost("/daoUpdate")
    public Object daoUpdate(@WebParam("objType") String objType, @WebParam("obj_id") Long id,
            	@WebParam("objJson") String jsonObj, RequestContext rc){
    	IDao dao = daoRegistry.getDao(objType);
    	Map<?,?> jsonMap = JsonUtil.toMapAndList(jsonObj);
    	Object object = daoRegistry.getEntityInstance(objType);
    	ObjectUtil.populate(object, jsonMap);
		return dao.update(object);
    }
    
    @WebGet("/daoList")
    public List daoList(@WebParam("objType") String objType, @WebParam("opts") String jsonOpts) {
    	Map opts = JsonUtil.toMapAndList(jsonOpts);
    	
    	if("Note".equals(objType)) {
    		int user_id =  Integer.parseInt(opts.get("user_id").toString());
        	if(opts.get("topic_id") != null) {
        		int topic_id =  Integer.parseInt(opts.get("topic_id").toString());
        		List<Note> noteList = noteDao.list(user_id,topic_id);
        		return noteList;
        	} else {
        		return null;
        	}
    	} else {
    		int user_id =  (Integer) opts.get("user_id");
            List<Topic> topicList = topicDao.list(user_id);
            return topicList;
    	}
     
    }
    
}
