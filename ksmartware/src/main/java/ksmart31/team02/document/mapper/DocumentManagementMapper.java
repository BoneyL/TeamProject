package ksmart31.team02.document.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team02.document.vo.ApprovalDocument;

@Mapper
public interface DocumentManagementMapper {
	public List<ApprovalDocument> selectDocuemntApprovalList();
}
