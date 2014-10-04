package com.videoshop.movies;


import org.apache.log4j.Logger;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;

public class MovieFormatter {

    private static final Logger LOG = Logger.getLogger(MovieFormatter.class);

    public String movieList(MovieList movies){
        LOG.info("Formatting movie data");
        try{
            Velocity.init();
            VelocityContext context = new VelocityContext();
            context.put("movies", movies.list());
            Template template = Velocity.getTemplate("/src/main/resources/templates/movie-list.vm");
            StringWriter writer = new StringWriter();
            template.merge(context, writer);
            return writer.toString();
        } catch (Exception e){
            e.printStackTrace();
            return "";
        }
    }

}
