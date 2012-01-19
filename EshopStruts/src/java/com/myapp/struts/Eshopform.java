/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author lalas
 */
public class Eshopform extends org.apache.struts.action.ActionForm {
    
    private int cafeQuantity;
    private int sugarQuantity;
    private int WaterQuantity;
    private String error;

    public String getError() {
        return error;
    }

    public void setError() {
        this.error = "<span style='color:red'>Please provide valid entries for both fields, non Negative</span>";
    }
    /**
     * @return the cafeQuantity
     */
    public int getCafeQuantity() {
        return cafeQuantity;
    }

    /**
     * @param cafeQuantity the cafeQuantity to set
     */
    public void setCafeQuantity(int cafeQuantity) {
        this.cafeQuantity = cafeQuantity;
    }

    /**
     * @return the sugarQuantity
     */
    public int getSugarQuantity() {
        return sugarQuantity;
    }

    /**
     * @param sugarQuantity the sugarQuantity to set
     */
    public void setSugarQuantity(int sugarQuantity) {
        this.sugarQuantity = sugarQuantity;
    }

    /**
     * @return the WaterQuantity
     */
    public int getWaterQuantity() {
        return WaterQuantity;
    }

    /**
     * @param WaterQuantity the WaterQuantity to set
     */
    public void setWaterQuantity(int WaterQuantity) {
        this.WaterQuantity = WaterQuantity;
    }

    /**
     *
     */
    public Eshopform() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getCafeQuantity()< 0 || getSugarQuantity()<0 || getWaterQuantity()<0) {
            errors.add("cafeQuant", new ActionMessage("error.Quantity.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
