package com.katy.practica2;

import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Chido on 14/10/2017.
 */

public class BannersResponse {
    private Response response;

    public  Response getResponse(){
        return response;
    }
    public void setResponse (Response response){
        this.response=response;
    }
    public static class Response{
        public List<Banners> getBanners() {
            return banners;
        }

        public void setBanners(List<Banners> banners) {
            this.banners = banners;
        }

        private List<Banners> banners;
        public static class Banners{
            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPicture() {
                return picture;
            }

            public void setPicture(String picture) {
                this.picture = picture;
            }

            private String picture;
        }
    }
}
