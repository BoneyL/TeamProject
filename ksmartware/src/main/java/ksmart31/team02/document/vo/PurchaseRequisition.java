package ksmart31.team02.document.vo;

public class PurchaseRequisition {
	private String memberId;
	private String memberPositionName;
	private String purchaseRequisitionDate;
	private String purchaseRequisitionPayDay;
	private String purchaseRequisitionItemCategory;
	private String purchaseRequisitionItem;
	private int purchaseRequisitionItemUnit;
	private int purchaseRequisitionItemCount;
	private int purchaseRequisitionItemPrice;
	private int purchaseRequisitionTotalPrice;
	private String purchaseRequisitionEtc;
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPositionName() {
		return memberPositionName;
	}
	public void setMemberPositionName(String memberPositionName) {
		this.memberPositionName = memberPositionName;
	}
	public String getPurchaseRequisitionDate() {
		return purchaseRequisitionDate;
	}
	public void setPurchaseRequisitionDate(String purchaseRequisitionDate) {
		this.purchaseRequisitionDate = purchaseRequisitionDate;
	}
	public String getPurchaseRequisitionPayDay() {
		return purchaseRequisitionPayDay;
	}
	public void setPurchaseRequisitionPayDay(String purchaseRequisitionPayDay) {
		this.purchaseRequisitionPayDay = purchaseRequisitionPayDay;
	}
	public String getPurchaseRequisitionItemCategory() {
		return purchaseRequisitionItemCategory;
	}
	public void setPurchaseRequisitionItemCategory(String purchaseRequisitionItemCategory) {
		this.purchaseRequisitionItemCategory = purchaseRequisitionItemCategory;
	}
	public String getPurchaseRequisitionItem() {
		return purchaseRequisitionItem;
	}
	public void setPurchaseRequisitionItem(String purchaseRequisitionItem) {
		this.purchaseRequisitionItem = purchaseRequisitionItem;
	}
	public int getPurchaseRequisitionItemUnit() {
		return purchaseRequisitionItemUnit;
	}
	public void setPurchaseRequisitionItemUnit(int purchaseRequisitionItemUnit) {
		this.purchaseRequisitionItemUnit = purchaseRequisitionItemUnit;
	}
	public int getPurchaseRequisitionItemCount() {
		return purchaseRequisitionItemCount;
	}
	public void setPurchaseRequisitionItemCount(int purchaseRequisitionItemCount) {
		this.purchaseRequisitionItemCount = purchaseRequisitionItemCount;
	}
	public int getPurchaseRequisitionItemPrice() {
		return purchaseRequisitionItemPrice;
	}
	public void setPurchaseRequisitionItemPrice(int purchaseRequisitionItemPrice) {
		this.purchaseRequisitionItemPrice = purchaseRequisitionItemPrice;
	}
	public int getPurchaseRequisitionTotalPrice() {
		return purchaseRequisitionTotalPrice;
	}
	public void setPurchaseRequisitionTotalPrice(int purchaseRequisitionTotalPrice) {
		this.purchaseRequisitionTotalPrice = purchaseRequisitionTotalPrice;
	}
	public String getPurchaseRequisitionEtc() {
		return purchaseRequisitionEtc;
	}
	public void setPurchaseRequisitionEtc(String purchaseRequisitionEtc) {
		this.purchaseRequisitionEtc = purchaseRequisitionEtc;
	}
	@Override
	public String toString() {
		return "PurchaseRequisition [memberId=" + memberId + ", memberPositionName=" + memberPositionName
				+ ", purchaseRequisitionDate=" + purchaseRequisitionDate + ", purchaseRequisitionPayDay="
				+ purchaseRequisitionPayDay + ", purchaseRequisitionItemCategory=" + purchaseRequisitionItemCategory
				+ ", purchaseRequisitionItem=" + purchaseRequisitionItem + ", purchaseRequisitionItemUnit="
				+ purchaseRequisitionItemUnit + ", purchaseRequisitionItemCount=" + purchaseRequisitionItemCount
				+ ", purchaseRequisitionItemPrice=" + purchaseRequisitionItemPrice + ", purchaseRequisitionTotalPrice="
				+ purchaseRequisitionTotalPrice + ", purchaseRequisitionEtc=" + purchaseRequisitionEtc + "]";
	}
	
	
}
