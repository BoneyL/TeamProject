package ksmart31.team02.document.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart31.team02.document.mapper.DocumentManagementMapper;
import ksmart31.team02.document.vo.ApprovalDocument;
import ksmart31.team02.document.vo.PurchaseRequisition;

@Service
public class DocumentManagementService {
	@Autowired
	DocumentManagementMapper documentManagementMapper;
	
	public List<ApprovalDocument> documentApprovalList() {
		List<ApprovalDocument> documentApprovalList = documentManagementMapper.selectDocuemntApprovalList();
		return documentApprovalList; 
	
	}
		public List<PurchaseRequisition> documentApprovalDetail(String approvalDocumentNo) {
		  = documentManagementMapper.selectDocuemntApprovalList();
		return documentApprovalList; 
	
	}

}
