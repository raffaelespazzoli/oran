package org.acme;

import io.smallrye.common.constraint.NotNull;
import io.smallrye.mutiny.Uni;
import org.acme.model.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.UUID;

@Path("/O2ims_infrastructureInventory/v1")
public class InfrastructureInventory {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<OCloud> getOCloud(@QueryParam("all_fields")Boolean all_fields,@QueryParam("fields")String fields,
                                 @QueryParam("exclude_fields") String exclude_fields,@QueryParam("exclude_defaults") String exclude_defaults){
        return null;
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("resourceTypes")
    public Uni<List<ResourceType>> getResourceTypeList(@QueryParam("filter") String filter,
                                                       @QueryParam("all_fields")Boolean all_fields,@QueryParam("fields")String fields,
                                                       @QueryParam("exclude_fields") String exclude_fields,@QueryParam("exclude_defaults") String exclude_defaults,
                                                       @QueryParam("nextpage_opaque_marker")String nextpage_opaque_marker){
        return null;
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("resourceTypes/{resourceTypeID}")
    public Uni<ResourceType> getResourceType(@NotNull UUID resourceTypeID){
        return null;
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("resourcePools")
    public Uni<List<ResourcePool>> getResourcePoolList(@QueryParam("filter") String filter,
                                                       @QueryParam("all_fields")Boolean all_fields,@QueryParam("fields")String fields,
                                                       @QueryParam("exclude_fields") String exclude_fields,@QueryParam("exclude_defaults") String exclude_defaults,
                                                       @QueryParam("nextpage_opaque_marker")String nextpage_opaque_marker){
        return null;
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("resourcePools/{resourcePoolID}")
    public Uni<ResourcePool> getResourcePool(@NotNull UUID resourcePoolID){
        return null;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("resourcePools/{resourcePoolID}/resources")
    public Uni<List<Resource>> getResourceList(@NotNull UUID resourcePoolID, @QueryParam("filter") String filter,
                                               @QueryParam("all_fields")Boolean all_fields,@QueryParam("fields")String fields,
                                               @QueryParam("exclude_fields") String exclude_fields,@QueryParam("exclude_defaults") String exclude_defaults,
                                               @QueryParam("nextpage_opaque_marker")String nextpage_opaque_marker){
        return null;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("resourcePools/{resourcePoolID}/resources/{resource}")
    public Uni<Resource> getResource(@NotNull UUID resourcePoolID,@NotNull UUID resource){
        return null;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("deploymentManagers")
    public Uni<List<DeploymentManager>> getDeploymentManagerList(@QueryParam("filter") String filter,
                                                                 @QueryParam("all_fields")Boolean all_fields,@QueryParam("fields")String fields,
                                                                 @QueryParam("exclude_fields") String exclude_fields,@QueryParam("exclude_defaults") String exclude_defaults,
                                                                 @QueryParam("nextpage_opaque_marker")String nextpage_opaque_marker){
        return null;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("deploymentManagers/{deploymentManagerID}")
    public Uni<DeploymentManager> getDeploymentManager(@NotNull UUID deploymentManagerID){
        return null;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("subscriptions")
    public Uni<List<Subscription>> getSubscriptionList(@QueryParam("filter") String filter,
                                                       @QueryParam("all_fields")Boolean all_fields,@QueryParam("fields")String fields,
                                                       @QueryParam("exclude_fields") String exclude_fields,@QueryParam("exclude_defaults") String exclude_defaults,
                                                       @QueryParam("nextpage_opaque_marker")String nextpage_opaque_marker){
        return null;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("subscriptions/{subscriptionID}")
    public Uni<List<Subscription>> getSubscription(@NotNull UUID subscriptionID){
        return null;
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("subscriptions/{subscriptionID}")
    public Uni<Void> deleteSubscription(@NotNull UUID subscriptionID){
        return null;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("subscriptions")
    public Uni<Void> getSubscriptionList(Subscription subscription){
        return null;
    }
}
