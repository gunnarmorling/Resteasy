package org.jboss.resteasy.cdi.generic;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * 
 * @author <a href="ron.sigal@jboss.com">Ron Sigal</a>
 * @version $Revision: 1.1 $
 *
 * Copyright Dec 16, 2012
 */
public interface NestedTypedResourceIntf<T extends HierarchyHolder<? extends Primate>>
{
   @GET
   @Path("injection")
   public abstract Response testGenerics();

   @GET
   @Path("decorators")
   public abstract Response testDecorators();
}