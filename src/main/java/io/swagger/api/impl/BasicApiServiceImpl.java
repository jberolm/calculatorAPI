package io.swagger.api.impl;

import io.swagger.api.*;


import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;





/**
 * Calculator API
 *
 
 * <p>This API provides different services to obtain the result of different operations.
 
 *
 */

public class BasicApiServiceImpl implements BasicApi {


    
    /**
     * Executes an opeation with two operands and an operator
     *
     
     * Executes an opeation with two operands and an operator
     *
     
     */
    
    public String calculateoperation(String operand1, String operator, String operand2) {
        // TODO: Implement...
        
        return null;
    }
    

}


