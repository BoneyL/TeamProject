package ksmart31.team02.document.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart31.team02.document.vo.ApprovalDocument;
import ksmart31.team02.document.vo.PurchaseRequisition;

@Mapper
public interface DocumentManagementMapper {
	public List<ApprovalDocument> selectDocuemntApprovalList();
	public String selectDocumentFormTitleByApprovalDocumentCode(String approvalDocumentcode);
	public List<PurchaseRequisition> selectPurchaseRequisitionDetail(String approvalDocuemntCode);
	public List<> documentManagementMapper.selectDisbursementDocumentDetail();
	public List<> documentManagementMapper.selectLeaveApplicationDetail();
	public List<> documentManagementMapper.selectprojectReportDetail();
	public List<> documentManagementMapper.selectprojectDisbursementDetail();
}
