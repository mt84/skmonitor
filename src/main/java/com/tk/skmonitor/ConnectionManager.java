package com.tk.skmonitor;

import com.gargoylesoftware.htmlunit.CookieManager;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

/**
 * Created by ja on 06.08.2014.
 */
public class ConnectionManager {
    ConnectionManager() throws IOException {
        connect();
    }

    private void connect() throws IOException {
        WebClient webClient = new WebClient();
        CookieManager cookieMan = webClient.getCookieManager();
        cookieMan.setCookiesEnabled(true);

        webClient.setThrowExceptionOnScriptError(false);
        HtmlPage page1 = webClient.getPage("http://www.sokker.org/");
        HtmlForm form = page1.getFormByName("logform");

        HtmlTextInput uName = form.getInputByName("ilogin");
        HtmlPasswordInput passWord = form.getInputByName("ipassword");
        HtmlButton button = (HtmlButton) page1.createElement("button");

        button.setAttribute("type", "submit");

        form.appendChild(button);
        uName.setValueAttribute("");
        passWord.setValueAttribute("");
        button.click();

        HtmlPage transfers = webClient.getPage("http://online.sokker.org/transfers");

        System.out.println(transfers.getWebResponse().getContentAsString());
    }
}
