package com.website.arav.service;

import java.util.List;

import com.website.arav.modal.Content;

public interface ContentService {

	Content updateOrSave(Content content);

	List<Content> getAllContents();

}
