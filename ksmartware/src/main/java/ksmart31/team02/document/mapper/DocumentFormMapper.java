package ksmart31.team02.document.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team02.document.domain.DocumentForm;

@Mapper
public interface DocumentFormMapper {	
	public List<DocumentForm> selectdocumentFormList();
	public List<DocumentForm> selectdocumentFormListByCategory(String documentFormCategory);

}
