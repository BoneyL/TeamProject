package ksmart31.team02.document.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart31.team02.document.domain.DocumentForm;
import ksmart31.team02.document.mapper.DocumentFormMapper;

@Service
public class DocumentFormService {
	
	@Autowired
	DocumentFormMapper documentFormMapper;
	public List<DocumentForm> DocumentFormList() {
	List<DocumentForm> documentFormList = documentFormMapper.selectdocumentFormList();
		return documentFormList;
	}
	public List<DocumentForm> DocumentFormListByCategory(String documentFormCategory){
		
		List<DocumentForm> documentFormList = documentFormMapper.selectdocumentFormListByCategory(documentFormCategory);
		return documentFormList;
	
	}
	
	
	

}
