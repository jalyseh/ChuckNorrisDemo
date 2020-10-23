package com.chucknorrisjawn.chucknorrisdemo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public class Joke {

        private String id;
        private String icon_url;
        private String url;
        private String value;

        public Joke() {
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIcon_url() {
            return icon_url;
        }

        public void setIcon_url(String icon_url) {
            this.icon_url = icon_url;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Quote{" +
                    "id='" + id + '\'' +
                    ", icon_url='" + icon_url + '\'' +
                    ", url='" + url + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }
    }
