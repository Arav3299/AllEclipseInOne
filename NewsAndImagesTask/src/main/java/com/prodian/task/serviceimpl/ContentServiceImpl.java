package com.prodian.task.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodian.task.modal.Content;
import com.prodian.task.repository.ContentRepository;
import com.prodian.task.service.ContentService;

@Service
public class ContentServiceImpl implements ContentService {

	@Autowired
	private ContentRepository contentRepository;
	
	@Override
	public List<Content> getAllPromotedData() {
		
		return contentRepository.findAll();
		
	}

}
