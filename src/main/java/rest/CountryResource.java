package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import facades.LikedMovieFacade;
import facades.RemoteServerFacade;
import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import utils.EMF_Creator;

/**
 * @author Patrick
 */
@Path("food")
public class CountryResource {
    
    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory();
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final LikedMovieFacade FACADE =  LikedMovieFacade.getFacadeExample(EMF);
   private static final RemoteServerFacade remoteFACADE =  RemoteServerFacade.getRemoteServerFacade(EMF);
    
    @Context
    private UriInfo context;

    @Context
    SecurityContext securityContext;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getInfoForAll() {
        
        String vel = "Velkommen til eksamens-prep backend";
        
        return GSON.toJson(vel);
   
    }

    //Just to verify if the database is setup
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("categories")
    public String allCountries() throws IOException {
        
       return remoteFACADE.getAllCategories();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("categories/food/{category}")
    public String allMealsByCategory(@PathParam("category") String cat) throws IOException {
       return remoteFACADE.getMealByCategory(cat);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("categories/drink/{category}")
    public String allDrinksByCategory(@PathParam("category") String cat) throws IOException {     
       return remoteFACADE.getDrinksByCategory(cat);
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("meal/{id}")
    public String mealInfo(@PathParam("id") String mealID) throws IOException {
        
       return remoteFACADE.getMealByCategory(mealID);
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("drink/{id}")
    public String drinkInfo(@PathParam("id") String drinkId) throws IOException {
        
       return remoteFACADE.getDrinkInfo(drinkId);
    }
    
    
    
    
  
    
    
    
    
   
    
}   