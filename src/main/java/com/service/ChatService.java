package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChatEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChatVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChatView;


/**
 * 咨询服务
 *
 * @author 
 * @email 
 * @date 2022-02-24 11:13:04
 */
public interface ChatService extends IService<ChatEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChatVO> selectListVO(Wrapper<ChatEntity> wrapper);
   	
   	ChatVO selectVO(@Param("ew") Wrapper<ChatEntity> wrapper);
   	
   	List<ChatView> selectListView(Wrapper<ChatEntity> wrapper);
   	
   	ChatView selectView(@Param("ew") Wrapper<ChatEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChatEntity> wrapper);
   	

}

