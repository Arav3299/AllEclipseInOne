package com.website.arav.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.website.arav.modal.Content;
import com.website.arav.repository.ContentRepository;
import com.website.arav.service.ContentService;

@Service
public class ContentServiceImpl implements ContentService {

	@Autowired
	private ContentRepository contentRepository;
	
	
	@Override
	public Content updateOrSave(Content content) {
		 
		return contentRepository.save(content);
	}

	@Override
	public List<Content> getAllContents() {
		
		return contentRepository.findAll();
	}

}
