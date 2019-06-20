package ksmart31.team02.document.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team02.document.domain.ApprovalDocument;
import ksmart31.team02.document.domain.DisbursementDocument;
import ksmart31.team02.document.domain.LeaveApplication;
import ksmart31.team02.document.domain.ProjectDisbursement;
import ksmart31.team02.document.domain.ProjectReport;
import ksmart31.team02.document.domain.PurchaseRequisition;

@Mapper
public interface DocumentManagementMapper {
	public List<ApprovalDocument> selectDocuemntApprovalList();
	public String selectDocumentFormTitleByApprovalDocumentCode(String approvalDocumentcode);
	public List<PurchaseRequisition> selectPurchaseRequisitionDetail(String approvalDocuemntCode);
	public List<DisbursementDocument> selectDisbursementDocumentDetail(String approvalDocuemntCode);
	public List<LeaveApplication> selectLeaveApplicationDetail(String approvalDocuemntCode);
	public List<ProjectReport> selectProjectReportDetail(String approvalDocuemntCode);
	public List<ProjectDisbursement> selectProjectDisbursementDetail(String approvalDocuemntCode);
}
