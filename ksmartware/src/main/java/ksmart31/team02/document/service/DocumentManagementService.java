package ksmart31.team02.document.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart31.team02.document.mapper.DocumentManagementMapper;
import ksmart31.team02.document.vo.ApprovalDocument;
import ksmart31.team02.document.vo.DisbursementDocument;
import ksmart31.team02.document.vo.LeaveApplication;
import ksmart31.team02.document.vo.ProjectDisbursement;
import ksmart31.team02.document.vo.ProjectReport;
import ksmart31.team02.document.vo.PurchaseRequisition;

@Service
public class DocumentManagementService {
	@Autowired
	DocumentManagementMapper documentManagementMapper;
	// 관리자 문서통합 관리(리스트)
	public List<ApprovalDocument> documentApprovalList() {
		List<ApprovalDocument> documentApprovalList = documentManagementMapper.selectDocuemntApprovalList();
		return documentApprovalList; 
	
	}
	// 문서통합  관리 -> 문서별 상세 데이터 확인(모든양식)
		public Map<String, Object> documentApprovalDetail(String approvalDocumentcode) {
			
			Map<String, Object> approvalDocumentDetailMap = new HashMap<String, Object>();
			String documentFormTitle = documentManagementMapper.selectDocumentFormTitleByApprovalDocumentCode(approvalDocumentcode);
			if(documentFormTitle == "구매요청서") {
				List<PurchaseRequisition> purchaseRequisitionList = documentManagementMapper.selectPurchaseRequisitionDetail();
			}else if(documentFormTitle == "지출결의서") {
				List<DisbursementDocument> disbursementDocumentList= documentManagementMapper.selectDisbursementDocumentDetail();
			}else if(documentFormTitle == "휴가신청서") {
				List<LeaveApplication> leaveApplicationList= documentManagementMapper.selectLeaveApplicationDetail();
			}else if(documentFormTitle == "프로젝트 업무보고") {
				List<ProjectReport> projectReportList = documentManagementMapper.selectProjectReportDetail();
			}else if(documentFormTitle == "프로젝트 지출결의서") {
				List<ProjectDisbursement> projectDisbursementList = documentManagementMapper.selectProjectDisbursementDetail();
			}
			
			
			return approvalDocumentDetailMap;
	
	}

}
