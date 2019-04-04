package com.claudio.deviceplugin.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="q")
public class ResponseEntity {
    @XmlElement(name = "h")
    private String host;
    @XmlElement(name = "pt")
    private String ping;
    @XmlElement(name = "c")
    private String viewCode;

    public String getViewCode() {
        return viewCode;
    }

    public void setViewCode(String viewCode) {
        this.viewCode = viewCode;
    }

    public String getPing() {
        return ping;
    }

    public void setPing(String ping) {
        this.ping = ping;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
