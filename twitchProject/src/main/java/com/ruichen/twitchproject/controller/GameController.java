package com.ruichen.twitchproject.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ruichen.twitchproject.service.GameService;
import com.ruichen.twitchproject.service.TwitchException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//use annotation to make such class as a Controller
@Controller
public class GameController {

    @Autowired
    private GameService gameService;

    // //Another way
    //     private final GameService gameService;
    //
    //    @Autowired
    //    public GameController(GameService gameService) {
    //        this.gameService = gameService;
    //    }


    // /game?game_name=whatever
    // /game
    //similar as doGet in HelloServlet
    //use RequestMapping && RequestParam can let Spring recognize such function, and get the request based on map path
    @RequestMapping(value = "/game", method = RequestMethod.GET)
    public void getGame(@RequestParam(value = "game_name", required = false) String gameName, HttpServletResponse response) throws IOException, ServletException {
        //update the GET result into HttpServletResponse response, and it will call some method and return response to server
        //use @RequestParam to map parameter from url to specified String gameName parameter of this getGame function

        response.setContentType("application/json;charset=UTF-8");
        try {
            // Return the dedicated game information if gameName is provided in the request URL, otherwise return the top x games.
            if (gameName != null) {
                response.getWriter().print(new ObjectMapper().writeValueAsString(gameService.searchGame(gameName)));
            } else {
                response.getWriter().print(new ObjectMapper().writeValueAsString(gameService.topGames(0)));
            }
        } catch (TwitchException e) {
            throw new ServletException(e);
        }

    }
//    //example
//    //test url: http://localhost:8080/search?lon=22&lat=37
//    @RequestMapping(value = "/search", method = RequestMethod.GET)
//    public String search(@RequestParam("lon") double lon, @RequestParam("lat") double lat) throws IOException{
//
//        return "";
//    }

//    //another example
//    //test url: http://localhost:8080/restaurant/1/menu
//    @RequestMapping(value = "/restaurant/{id}/menu", method = RequestMethod.GET)
//    public void searchMenu(@PathVariable("id") int id) {}


}
