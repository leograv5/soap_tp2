/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author legravier
 */
public class DivisionZeroBean {
    private String message;
    
    public DivisionZeroBean() {
    }
    
    public DivisionZeroBean(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return this.message;
    }
}
