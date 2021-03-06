// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package cs.ut.domain;

import cs.ut.domain.SiteEngineer;
import cs.ut.domain.SiteEngineerController;
import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

privileged aspect SiteEngineerController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String SiteEngineerController.create(@Valid SiteEngineer siteEngineer, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, siteEngineer);
            return "siteengineers/create";
        }
        uiModel.asMap().clear();
        siteEngineer.persist();
        return "redirect:/siteengineers/" + encodeUrlPathSegment(siteEngineer.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String SiteEngineerController.createForm(Model uiModel) {
        populateEditForm(uiModel, new SiteEngineer());
        return "siteengineers/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String SiteEngineerController.show(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("siteengineer", SiteEngineer.findSiteEngineer(id));
        uiModel.addAttribute("itemId", id);
        return "siteengineers/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String SiteEngineerController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("siteengineers", SiteEngineer.findSiteEngineerEntries(firstResult, sizeNo));
            float nrOfPages = (float) SiteEngineer.countSiteEngineers() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("siteengineers", SiteEngineer.findAllSiteEngineers());
        }
        return "siteengineers/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String SiteEngineerController.update(@Valid SiteEngineer siteEngineer, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, siteEngineer);
            return "siteengineers/update";
        }
        uiModel.asMap().clear();
        siteEngineer.merge();
        return "redirect:/siteengineers/" + encodeUrlPathSegment(siteEngineer.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String SiteEngineerController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, SiteEngineer.findSiteEngineer(id));
        return "siteengineers/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String SiteEngineerController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        SiteEngineer siteEngineer = SiteEngineer.findSiteEngineer(id);
        siteEngineer.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/siteengineers";
    }
    
    void SiteEngineerController.populateEditForm(Model uiModel, SiteEngineer siteEngineer) {
        uiModel.addAttribute("siteEngineer", siteEngineer);
    }
    
    String SiteEngineerController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        } catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
    
}
