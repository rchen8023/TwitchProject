
//this class cannot exist at the same time with GameController


//package com.ruichen.twitchproject;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.ruichen.twitchproject.entity.response.Game;
//import org.apache.commons.io.IOUtils;
//import org.json.JSONObject;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet(name = "helloServlet", value = {"/game"})
//public class HelloServlet extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        //test url: http://localhost:8080/game
//        //can only test on Postman, cannot request POST from browser
//
//        // Read game information from request body
//        JSONObject jsonRequest = new JSONObject(IOUtils.toString(request.getReader()));
//        String name = jsonRequest.getString("name");
//        String developer = jsonRequest.getString("developer");
//        String releaseTime = jsonRequest.getString("release_time");
//        String website = jsonRequest.getString("website");
//        float price = jsonRequest.getFloat("price");
//
//        // Print game information to IDE console
//        System.out.println("Name is: " + name);
//        System.out.println("Developer is: " + developer);
//        System.out.println("Release time is: " + releaseTime);
//        System.out.println("Website is: " + website);
//        System.out.println("Price is: " + price);
//
//        // Return status = ok as response body to the client
//        response.setContentType("application/json");
//        JSONObject jsonResponse = new JSONObject();
//        jsonResponse.put("status", "ok");
//        response.getWriter().print(jsonResponse);
//
//    }
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////        response.getWriter().print("Hello World");
//
////        //GET request with parameters --> gamename
////        //request url example: http://localhost:8080/game?gamename=World%20of%20Warcraft
////        String gamename = request.getParameter("gamename");
////        response.getWriter().print("Game is: " + gamename);
//
////        //get JSON format data in the Servlet
////        //test url: http://localhost:8080/game
////        response.setContentType("application/json");
////        JSONObject game = new JSONObject();
////        game.put("name", "World of Warcraft");
////        game.put("developer", "Blizzard Entertainment");
////        game.put("release_time", "Feb 11, 2005");
////        game.put("website", "https://www.worldofwarcraft.com");
////        game.put("price", 49.99);
////
////        // Write game information to response body
////        response.getWriter().print(game);
//
//        //use Jackson to build JSON string.
//        response.setContentType("application/json");
//        ObjectMapper mapper = new ObjectMapper();
//        Game.Builder builder = new Game.Builder();
//        builder.setName("World of Warcraft");
//        builder.setDeveloper("Blizzard Entertainment");
//        builder.setReleaseTime("Feb 11, 2005");
//        builder.setWebsite("https://www.worldofwarcraft.com");
//        builder.setPrice(49.99);
//
//
//        Game game = builder.build();
//        response.getWriter().print(mapper.writeValueAsString(game));
//
//
//    }
//}
