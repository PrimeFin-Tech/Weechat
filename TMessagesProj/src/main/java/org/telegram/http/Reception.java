package org.telegram.http;

public class Reception {

    private String agreementType;
    private String server;
    private int port;
    private Credentials credentials;
    public void setAgreementType(String agreementType) {
        this.agreementType = agreementType;
    }
    public String getAgreementType() {
        return agreementType;
    }

    public void setServer(String server) {
        this.server = server;
    }
    public String getServer() {
        return server;
    }

    public void setPort(int port) {
        this.port = port;
    }
    public int getPort() {
        return port;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }
    public Credentials getCredentials() {
        return credentials;
    }
    public class Credentials {

        private String username;
        private String password;
        public void setUsername(String username) {
            this.username = username;
        }
        public String getUsername() {
            return username;
        }

        public void setPassword(String password) {
            this.password = password;
        }
        public String getPassword() {
            return password;
        }

        @Override
        public String toString() {
            return "Credentials{" +
                    "username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Reception{" +
                "agreementType='" + agreementType + '\'' +
                ", server='" + server + '\'' +
                ", port=" + port +
                ", credentials=" + credentials +
                '}';
    }
}