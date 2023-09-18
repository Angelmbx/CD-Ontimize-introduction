package com.campusdual.springontimize.api.core.service;

import com.ontimize.jee.common.dto.EntityResult;

import java.util.List;
import java.util.Map;

public interface IContactService {
    public EntityResult contactQuery(Map<String,Object> keyMap, List<String> attrList);
    public EntityResult contactInsert(Map<String,Object> attrMap);
    public EntityResult contactUpdate(Map<String, Object> attrMap, Map<String,Object> keyMap);
    public EntityResult contactDelete(Map<String, Object> keyMap);

}
