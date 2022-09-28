package com.collectionpart2.questionone.model;

public class Server {
    private String serverName;
    private String softwareType;
    private String softwarePackageName;
    private String version;

    public Server(String serverName, String softwareType, String softwareTypeName, String version) {
        this.serverName = serverName;
        this.softwareType = softwareType;
        this.softwarePackageName = softwareTypeName;
        this.version = version;
    }

    public String getServerName() {
        return serverName;
    }

    public String getSoftwareType() {
        return softwareType;
    }

    public String getSoftwarePackageName() {
        return softwarePackageName;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String
    toString() {
        return java.text.MessageFormat.format("ServerName :{0}, SoftwareType :{1}, SoftwareType Name :{2}, version :{3}",
                serverName,softwareType, softwarePackageName,version);
    }
}
