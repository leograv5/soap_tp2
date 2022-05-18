/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

import javax.xml.ws.WebFault;

/**
 *
 * @author legravier
 */
@WebFault(name="divisionZero")
public class DivisionZeroException extends Exception {

    private DivisionZeroBean detail;
    /**
     * Creates a new instance of <code>DivisionZeroException</code> without
     * detail message.
     */
    public DivisionZeroException() {
    }

    /**
     * Constructs an instance of <code>DivisionZeroException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DivisionZeroException(String msg, DivisionZeroBean detail) {
        super(msg);
        this.detail = detail;
    }
    
    public DivisionZeroException(String msg, DivisionZeroBean detail, Throwable cause) {
        super(msg, cause);
        this.detail = detail;
    }
    
    public DivisionZeroBean getDetail() {
        return this.detail;
    }
}
