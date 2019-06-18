package ksmart31.team02.document.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ksmart31.team02.document.service.DocumentFormService;
import ksmart31.team02.document.vo.DocumentForm;

@Controller
public class DocumentFormController {
	@Autowired
	DocumentFormService documentFormService;	

	@GetMapping(value = "/documentFormList")
	public String documentFormList(@RequestParam(value = "documentFormCategory", required = false)
									String documentFormCategory,Model model) {
		System.out.println("(C)get docuemntFormList(user 문서양식 리스트");
		List<DocumentForm> documentFormList = null;
		documentFormList = documentFormService.DocumentFormList();
		if(documentFormCategory != null) {
		documentFormList = documentFormService.DocumentFormListByCategory(documentFormCategory);
		}
		model.addAttribute("documentFormList", documentFormList);
		return  "/view/user/documentForm/documentFormList";
	}
	@GetMapping(value = "/documentFormListDetail")
	public String documentFormListDetail(@RequestParam(value = "documentForm")
										String documentFormDetail, Model model) {
		System.out.println("(C)get documentFormListDetail");
		
		return documentFormDetail;
		
	}
	
}
