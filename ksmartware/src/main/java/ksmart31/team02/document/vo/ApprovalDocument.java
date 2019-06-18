package ksmart31.team02.document.vo;

public class ApprovalDocument {
				private String draftDocumentStatus;
				private String approvalDocumentFileSaveName;
				private String memberName;
				private String documentDate;
				private String finalApprovalMemberName;
				private String finalApprovalDate;
				public String getDraftDocumentStatus() {
					return draftDocumentStatus;
				}
				public void setDraftDocumentStatus(String draftDocumentStatus) {
					this.draftDocumentStatus = draftDocumentStatus;
				}
				public String getApprovalDocumentFileSaveName() {
					return approvalDocumentFileSaveName;
				}
				public void setApprovalDocumentFileSaveName(String approvalDocumentFileSaveName) {
					this.approvalDocumentFileSaveName = approvalDocumentFileSaveName;
				}
				public String getMemberName() {
					return memberName;
				}
				public void setMemberName(String memberName) {
					this.memberName = memberName;
				}
				public String getDocumentDate() {
					return documentDate;
				}
				public void setDocumentDate(String documentDate) {
					this.documentDate = documentDate;
				}
				public String getFinalApprovalMemberName() {
					return finalApprovalMemberName;
				}
				public void setFinalApprovalMemberName(String finalApprovalMemberName) {
					this.finalApprovalMemberName = finalApprovalMemberName;
				}
				public String getFinalApprovalDate() {
					return finalApprovalDate;
				}
				public void setFinalApprovalDate(String finalApprovalDate) {
					this.finalApprovalDate = finalApprovalDate;
				}
				@Override
				public String toString() {
					return "ApprovalDocument [draftDocumentStatus=" + draftDocumentStatus
							+ ", approvalDocumentFileSaveName=" + approvalDocumentFileSaveName + ", memberName="
							+ memberName + ", documentDate=" + documentDate + ", finalApprovalMemberName="
							+ finalApprovalMemberName + ", finalApprovalDate=" + finalApprovalDate + "]";
				}
				
				
}
