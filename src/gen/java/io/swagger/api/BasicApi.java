package io.swagger.api;



import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

import javax.validation.constraints.*;
import javax.validation.Valid;



/**
 * Calculator API
 *
 
 * <p>This API provides different services to obtain the result of different operations.
 *
 
 */

@Path("/")
@Api(value = "/", description = "")

public interface BasicApi  {



    
    /**
     * Executes an opeation with two operands and an operator
     *
     
     * Executes an opeation with two operands and an operator
     *
     
     */
    
    @GET
    @Path("/calculate")


    @Produces({ "text/plain" })

    @ApiOperation(value = "Executes an opeation with two operands and an operator", tags={ "Basic" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = String.class),
        @ApiResponse(code = 404, message = "") })
    public String calculateoperation(@QueryParam("operand1") String operand1, @QueryParam("operator") String operator, @QueryParam("operand2") String operand2);

}


