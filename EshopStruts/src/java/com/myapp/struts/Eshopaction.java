/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.*;
/**
 *
 * @author lalas
 */
public class Eshopaction extends org.apache.struts.action.Action {

    /*
     * forward name="success" path=""
     */
    private static final String SUCCESS = "success";
    private final static String FAILURE = "failure";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        HttpSession session = request.getSession(true);
        Eshopform eformBean = (Eshopform)form;
        int cafe = eformBean.getCafeQuantity();
        int sugar = eformBean.getSugarQuantity();
        int water = eformBean.getWaterQuantity();
        //Cookie myCookie = null;
        if ((cafe < 0) ||  (sugar < 0)  ||  (water < 0) ) {            
                        
              
             eformBean.setError();
             return mapping.findForward(FAILURE);
        }
        
              String cookieName4 = "cafeQuantity";
        Cookie cookies4 [] = request.getCookies ();
    
    if (cookies4 != null)
    {
        for (int i = 0; i < cookies4.length; i++) 
        {
            if (cookies4 [i].getName().equals (cookieName4))
            {
                
                           
                
                break;
             }
             
        }
    }
        
        String caffe = request.getParameter("cafeQuantity");
        if(caffe==null){
            caffe="0";
             Cookie cafeCookie = new Cookie("cafeQuantity", caffe);
             cafeCookie.setMaxAge(15*60);
             response.addCookie(cafeCookie);
        
        }
        
        String sugarr = request.getParameter("sugarQuantity");
        if(sugarr==null){
            sugarr="0";
            Cookie sugarCookie = new Cookie("sugarQuantity", sugarr);
            sugarCookie.setMaxAge(15*60);
            response.addCookie(sugarCookie);
        
        }
        
        String waterr = request.getParameter("waterQuantity");
        if(waterr==null){
            waterr="0";
            Cookie waterCookie = new Cookie("waterQuantity", waterr);
            waterCookie.setMaxAge(15*60);
            response.addCookie(waterCookie);
        
        }
        
        
        
        
        String cookieName = "cafeQuantity";
        Cookie cookies [] = request.getCookies ();
    
    if (cookies != null)
    {
        for (int i = 0; i < cookies.length; i++) 
        {
            if (cookies [i].getName().equals (cookieName))
            {
                
                
                cookies[i] = new Cookie("cafeQuantity", caffe);
                cookies[i].setMaxAge(15*60);
                response.addCookie(cookies[i]);
                
                break;
             }
             
        }
    }
        String cookieName2 = "sugarQuantity";
        Cookie cookies2 [] = request.getCookies ();
        
        if (cookies2 != null)
    {
        for (int i = 0; i < cookies2.length; i++) 
        {
            if (cookies2 [i].getName().equals (cookieName2))
            {
                
                
                cookies2[i] = new Cookie("sugarQuantity", sugarr);
                cookies2[i].setMaxAge(15*60);
                response.addCookie(cookies2[i]);
                break;
             }
        }
    }
        
        String cookieName3 = "waterQuantity";
        Cookie cookies3 [] = request.getCookies ();
        
        if (cookies3 != null)
    {
        for (int i = 0; i < cookies3.length; i++) 
        {
            if (cookies3 [i].getName().equals (cookieName3))
            {
                
                
                cookies3[i] = new Cookie("waterQuantity", waterr);
                cookies3[i].setMaxAge(15*60);
                response.addCookie(cookies3[i]);
                break;
             }
        }
    }
        
        
        
        
        //Cookie cafeCookie = new Cookie("cafeQuantity", caffe);
       // cafeCookie.setMaxAge(15*60);
        //response.addCookie(cafeCookie);
        
        return mapping.findForward(SUCCESS);
        
    }
}
