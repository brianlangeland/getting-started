package com.aem.core.servlets;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.propertytypes.ServiceDescription;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;

@Component(service = { Servlet.class })
@SlingServletResourceTypes(
        resourceTypes="gettingStarted/components/content/curation",
        methods=HttpConstants.METHOD_GET,
        selectors="curate",
        extensions="html")
@ServiceDescription("Simple Curation Servlet")
public class CurationServlet extends SlingSafeMethodsServlet {

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        Resource resource = request.getResource();
        response.setContentType("text/html");
        response.getWriter().write("<h2>Sample Curation Servlet</h2>");
        String[] tags = resource.getValueMap().get("tags", String[].class);
        if (tags != null && tags.length > 0) {
            response.getWriter().write("<ul>");
            for (int i=0; i < tags.length; i++) {
                response.getWriter().write("<li>Tag #" + i + ": " + tags[i]+ "</li>");
            }
            response.getWriter().write("</ul>");
        }
    }
}
