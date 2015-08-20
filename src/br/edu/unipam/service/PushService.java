package br.edu.unipam.service;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;

import br.edu.unipam.entidade.PushRequest;
import br.edu.unipam.entidade.PushResponse;
import br.edu.unipam.request.GcmRequest;

@Path(value="/PushMobile")
@Produces(value={"application/json"})
@Consumes(value={"application/json"})
public class PushService implements MessageBodyWriter<Object> {
	
	@POST
	@Path(value="/postGcm")
	public String enviaPushGcm(PushRequest request){
		
		PushResponse response = new PushResponse(GcmRequest.post(request));
		
		return response.getResponse();
	}
	
	@GET
	@Path(value="/teste")
	public String teste(){
		
		return "teste";
		
	}
	

	@Override
	public long getSize(Object arg0, Class<?> arg1, Type arg2, Annotation[] arg3, MediaType arg4) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isWriteable(Class<?> arg0, Type arg1, Annotation[] arg2, MediaType arg3) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void writeTo(Object arg0, Class<?> arg1, Type arg2, Annotation[] arg3, MediaType arg4,
			MultivaluedMap<String, Object> arg5, OutputStream arg6) throws IOException, WebApplicationException {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
