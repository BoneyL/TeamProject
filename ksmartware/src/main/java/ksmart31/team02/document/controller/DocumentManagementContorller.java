package ksmart31.team02.document.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ksmart31.team02.document.service.DocumentManagementService;
import ksmart31.team02.document.vo.ApprovalDocument;

@Controller
public class DocumentManagementContorller {
	@Autowired
	DocumentManagementService documentManagementService;
	
	@GetMapping(value = "/documentApprovalManagement")
	public String documentApprovalManagement(Model model, @RequestParam(value = "approvalDocumentNo")String approvalDocumentNo) {
		System.out.println("(C)documentApprovalManagement");
		List<ApprovalDocument> approvalDocumentList = null;
		if(approvalDocumentNo != null) {
			approvalDocumentList = documentManagementService.documentApprovalDetail(approvalDocumentNo);
		}
		approvalDocumentList = documentManagementService.documentApprovalList();
		model.addAttribute("approvalDocumentList", approvalDocumentList);
		return "/documentApprovalManagement";				
	}

}
